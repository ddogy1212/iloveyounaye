# 💗 나예 사랑해 — Android 1×1 위젯

업로드한 영상의 **목소리 약 5.8초**를 홈 화면에서 바로 재생하는 안드로이드 전용 앱입니다.

- 1×1 크기의 분홍 하트 위젯
- 위젯 터치 → **다른 앱 화면을 열지 않고** 음성 재생
- 다시 누르면 처음부터 재생
- 오프라인 재생, 재생 완료 시 자동 종료
- 앱 첫 화면에서 위젯 추가 또는 음성 테스트 가능

## 📱 설치하기 (휴대폰만 사용)

1. [GitHub Releases](https://github.com/ddogy1212/iloveyounaye/releases/latest)에 접속합니다.
2. `app-debug.apk`를 내려받습니다. 아직 Release가 없다면 저장소의 **Actions → Build Android APK → 성공한 실행 → Artifacts → iloveyounaye-apk**에서 ZIP을 내려받고 압축을 푼 뒤 APK를 사용합니다.
3. 휴대폰에서 APK를 열고 Android가 요청하는 **이 출처의 앱 설치 허용**을 진행합니다. 본인이 직접 빌드한 파일인지 확인하세요.
4. 설치된 **나예 사랑해** 앱을 한 번 실행하고 **홈 화면에 위젯 추가**를 누릅니다. 휴대폰 런처가 바로 추가를 지원하지 않으면 홈 화면 빈 곳을 길게 누른 다음 **위젯 → 나예 사랑해**를 선택합니다.
5. 이제 홈 화면의 분홍 하트 버튼을 누르면 음성이 재생됩니다.

> GitHub Actions 최초 빌드가 성공해야 APK가 생성됩니다. 이 저장소는 공개 저장소이므로 소리 파일을 인코딩한 `voice.b64`도 누구나 내려받을 수 있습니다. 비공개로 유지하려면 저장소를 Private으로 변경하세요.

## 🛠️ 빌드

이 프로젝트는 Java + Android Gradle Plugin 8.7.3 + Gradle 8.9 + compileSdk 35 / minSdk 26으로 구성되어 있습니다. GitHub Actions에서 자동으로 컴파일합니다.

```
gradle :app:assembleDebug
```

- 출력 APK: `app/build/outputs/apk/debug/app-debug.apk`
- 음성 파일: `app/src/main/assets/voice.b64` (M4A / AAC 오디오를 Base64로 저장)
- Android 앱에서 첫 재생 시 앱 내부 저장소에 M4A로 디코딩합니다.

본인만 설치하는 앱이며 인터넷 권한을 요구하지 않습니다. **GitHub에서 빌드한 APK를 스마트폰 실기기로 실행 검증한 것은 아닙니다.**
