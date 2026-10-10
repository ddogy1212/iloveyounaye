package com.iloveyounaye.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/** One drawing algorithm for the editing frame AND the final widget bitmap. */
public final class PhotoCropView extends View {
    public interface ChangeListener {
        void onChanged();
        void onFinished();
    }

    private final Paint photoPaint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.FILTER_BITMAP_FLAG | Paint.DITHER_FLAG);
    private final Paint scrimPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final Paint borderPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final ScaleGestureDetector scaleDetector;
    private final RectF frame = new RectF();
    private Bitmap bitmap;
    private float ratio = 0.84f;
    private float zoom = 1f;
    private float panX = 0f, panY = 0f;
    private float lastX, lastY;
    private ChangeListener listener;

    public PhotoCropView(Context context) {
        super(context);
        scrimPaint.setColor(0xB8000000);
        borderPaint.setColor(Color.WHITE);
        borderPaint.setStrokeWidth(dp(2.5f));
        borderPaint.setStyle(Paint.Style.STROKE);
        scaleDetector = new ScaleGestureDetector(context, new ScaleGestureDetector.SimpleOnScaleGestureListener() {
            @Override public boolean onScale(ScaleGestureDetector detector) {
                if (bitmap == null) return false;
                float previous = zoom;
                zoom = clamp(zoom * detector.getScaleFactor(), 1f, 10f);
                float change = zoom / previous;
                // Keep the pinched point steady inside the crop frame.
                float focusX = (detector.getFocusX() - frame.centerX()) / Math.max(1f, frame.width());
                float focusY = (detector.getFocusY() - frame.centerY()) / Math.max(1f, frame.height());
                panX = focusX + (panX - focusX) * change;
                panY = focusY + (panY - focusY) * change;
                clampPan();
                invalidate();
                if (listener != null) listener.onChanged();
                return true;
            }
        });
    }

    public void setChangeListener(ChangeListener value) { listener = value; }

    public void setPhoto(Bitmap value) {
        bitmap = value;
        zoom = 1f;
        panX = panY = 0f;
        invalidate();
        if (listener != null) listener.onChanged();
    }
    public Bitmap getPhoto() { return bitmap; }
    public void setCropRatio(float aspect) {
        ratio = clamp(aspect, 0.65f, 1.35f);
        updateFrame(getWidth(), getHeight());
        clampPan();
        invalidate();
        if (listener != null) listener.onChanged();
    }
    public float getCropRatio() { return ratio; }
    public float getZoom() { return zoom; }
    public float getPanX() { return panX; }
    public float getPanY() { return panY; }
    public void setTransform(float valueZoom, float x, float y) {
        zoom = clamp(valueZoom, 1f, 10f);
        panX = x;
        panY = y;
        clampPan();
        invalidate();
    }

    private float dp(float value) { return value * getResources().getDisplayMetrics().density; }
    private static float clamp(float value, float lo, float hi) {
        return Math.max(lo, Math.min(value, hi));
    }
    @Override protected void onMeasure(int widthSpec, int heightSpec) {
        int w = MeasureSpec.getSize(widthSpec);
        float desired = dp(420f);
        int h = resolveSize(Math.round(desired), heightSpec);
        setMeasuredDimension(w, h);
    }
    @Override protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w,h,oldw,oldh);
        updateFrame(w, h);
        clampPan();
    }
    private void updateFrame(int w, int h) {
        if (w <= 0 || h <= 0) return;
        float innerW = Math.max(1f, w - dp(36f));
        float innerH = Math.max(1f, h - dp(44f));
        float cropW = Math.min(innerW, innerH * ratio);
        float cropH = cropW / ratio;
        frame.set((w-cropW)*0.5f,(h-cropH)*0.5f,(w+cropW)*0.5f,(h+cropH)*0.5f);
    }

    /** Draws a cover crop from the same normalized transform at any output resolution. */
    private void drawImage(Canvas canvas, RectF target) {
        if (bitmap == null || target.width() <= 0 || target.height() <= 0) return;
        float scale = Math.max(target.width()/bitmap.getWidth(), target.height()/bitmap.getHeight()) * zoom;
        float dw = bitmap.getWidth() * scale;
        float dh = bitmap.getHeight() * scale;
        float dx = clamp(panX * target.width(), -(dw - target.width())*0.5f, (dw-target.width())*0.5f);
        float dy = clamp(panY * target.height(), -(dh - target.height())*0.5f, (dh-target.height())*0.5f);
        float cx = target.centerX() + dx;
        float cy = target.centerY() + dy;
        canvas.drawBitmap(bitmap,null,new RectF(cx-dw*0.5f,cy-dh*0.5f,cx+dw*0.5f,cy+dh*0.5f),photoPaint);
    }

    private void clampPan() {
        if (bitmap == null || frame.width() <= 0 || frame.height() <= 0) return;
        float scale = Math.max(frame.width()/bitmap.getWidth(), frame.height()/bitmap.getHeight()) * zoom;
        float rangeX = (bitmap.getWidth()*scale-frame.width())/(2f*frame.width());
        float rangeY = (bitmap.getHeight()*scale-frame.height())/(2f*frame.height());
        panX = clamp(panX,-Math.max(0f,rangeX),Math.max(0f,rangeX));
        panY = clamp(panY,-Math.max(0f,rangeY),Math.max(0f,rangeY));
    }

    @Override protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(0xff222127);
        // Draw the full selected image, then dim everything OUTSIDE the widget-shaped frame.
        drawImage(canvas,frame);
        float radius = Math.min(frame.width(),frame.height())*0.235f;
        Path outside = new Path();
        outside.setFillType(Path.FillType.EVEN_ODD);
        outside.addRect(0,0,getWidth(),getHeight(),Path.Direction.CW);
        outside.addRoundRect(frame,radius,radius,Path.Direction.CW);
        canvas.drawPath(outside,scrimPaint);
        canvas.drawRoundRect(frame,radius,radius,borderPaint);
    }

    /** No border, gradient or padding is saved. All pixels are actual photo pixels. */
    public Bitmap exportWidgetBitmap() {
        int outputH=320;
        int outputW=Math.round(outputH*ratio);
        Bitmap result=Bitmap.createBitmap(Math.max(1,outputW),outputH,Bitmap.Config.ARGB_8888);
        Canvas canvas=new Canvas(result);
        drawImage(canvas,new RectF(0,0,result.getWidth(),result.getHeight()));
        return result;
    }

    @Override public boolean onTouchEvent(MotionEvent e) {
        if (bitmap == null) return true;
        getParent().requestDisallowInterceptTouchEvent(true);
        scaleDetector.onTouchEvent(e);
        switch(e.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                lastX=e.getX();lastY=e.getY();return true;
            case MotionEvent.ACTION_POINTER_DOWN:
                lastX=e.getX(0);lastY=e.getY(0);return true;
            case MotionEvent.ACTION_MOVE:
                if(e.getPointerCount()==1 && !scaleDetector.isInProgress() && frame.width()>0) {
                    panX += (e.getX()-lastX)/frame.width();
                    panY += (e.getY()-lastY)/frame.height();
                    clampPan();
                    invalidate();
                    if(listener!=null)listener.onChanged();
                }
                lastX=e.getX();lastY=e.getY();return true;
            case MotionEvent.ACTION_POINTER_UP: {
                int remaining=e.getActionIndex()==0?1:0;
                if(remaining<e.getPointerCount()) {
                    lastX=e.getX(remaining);
                    lastY=e.getY(remaining);
                }
                return true;
            }
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                if(listener!=null)listener.onFinished();
                performClick();return true;
        }
        return true;
    }
    @Override public boolean performClick() { super.performClick();return true; }
}
