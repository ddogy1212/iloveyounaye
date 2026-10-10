# APK build error report

38040806651	completed	success
38039465030	completed	success
38039444391	completed	success

## Run ID: 38040806651

```text
29:2026-10-10T09:16:31.4623738Z Prepare all required actions
149:2026-10-10T09:16:36.1584179Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
151:2026-10-10T09:16:36.1584890Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
154:2026-10-10T09:16:36.1585795Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
190:2026-10-10T09:16:36.2516433Z   dependency-graph-continue-on-failure: true
348:2026-10-10T09:17:05.0889849Z (node:2578) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
414:2026-10-10T09:17:16.3413667Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
547:2026-10-10T09:16:31.4623706Z Prepare all required actions
667:2026-10-10T09:16:36.1584171Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
669:2026-10-10T09:16:36.1584853Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
672:2026-10-10T09:16:36.1585791Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
708:2026-10-10T09:16:36.2516428Z   dependency-graph-continue-on-failure: true
866:2026-10-10T09:17:05.0889777Z (node:2578) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
932:2026-10-10T09:17:16.3413608Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
```

### Tail of logs

```text
2026-10-10T09:17:20.6394001Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleanup deleted 2 files/directories.
2026-10-10T09:17:20.6394778Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleaned up in 0.011 secs.
2026-10-10T09:17:20.6395494Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6396995Z jars (/home/runner/.gradle/caches/jars-9) removing files not accessed on or after Sat Oct 10 09:16:36 UTC 2026.
2026-10-10T09:17:20.6400239Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 2 files/directories.
2026-10-10T09:17:20.6401604Z jars (/home/runner/.gradle/caches/jars-9) cleaned up in 0.012 secs.
2026-10-10T09:17:20.6402979Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) removing files not accessed on or after Sat Oct 10 09:16:36 UTC 2026.
2026-10-10T09:17:20.6404687Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6405567Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleaned up in 0.0 secs.
2026-10-10T09:17:20.6406487Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) removing files not accessed on or after Sat Oct 10 09:16:36 UTC 2026.
2026-10-10T09:17:20.6408260Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6409901Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleaned up in 0.0 secs.
2026-10-10T09:17:20.6412345Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6432595Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6434137Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Sat Oct 10 09:16:36 UTC 2026.
2026-10-10T09:17:20.6435488Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6436687Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6437980Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Sat Oct 10 09:16:36 UTC 2026.
2026-10-10T09:17:20.6664374Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6694231Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6696040Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6697246Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.042 secs.
2026-10-10T09:17:20.7563548Z ##[endgroup]
2026-10-10T09:17:20.7564229Z ##[group]Caching Gradle state
2026-10-10T09:17:20.9269297Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T09:17:20.9713079Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T09:17:21.7741577Z Sent 99388 of 99388 (100.0%), 0.3 MBs/sec
2026-10-10T09:17:21.8154571Z Sent 169796 of 169796 (100.0%), 0.4 MBs/sec
2026-10-10T09:17:22.0116300Z Saved cache entry with key gradle-instrumented-jars-v1-bfbefa0ecb674d9d23d4feb204418056 from /home/runner/.gradle/caches/jars-*/*/ in 1110ms
2026-10-10T09:17:22.0284655Z Saved cache entry with key gradle-groovy-dsl-v1-dc0341e07b896e7a9909d94e12d847d3 from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 1093ms
2026-10-10T09:17:22.0877746Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T09:17:22.8223717Z Sent 870989 of 870989 (100.0%), 1.7 MBs/sec
2026-10-10T09:17:23.0262302Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-529eb2b3d3dba51f665a1117e471550d63a284aa from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 949ms
2026-10-10T09:17:23.0264349Z ##[endgroup]
2026-10-10T09:17:23.0270564Z Generating Job Summary
2026-10-10T09:17:23.0283706Z Completed post-action step
﻿2026-10-10T09:17:23.0508469Z Post job cleanup.
2026-10-10T09:17:23.1868646Z (node:2822) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-10T09:17:23.1869781Z (Use `node --trace-deprecation ...` to show where the warning was created)
﻿2026-10-10T09:17:23.2095205Z Post job cleanup.
2026-10-10T09:17:23.3075894Z [command]/usr/bin/git version
2026-10-10T09:17:23.3122590Z git version 2.55.0
2026-10-10T09:17:23.3168902Z Temporarily overriding HOME='/home/runner/work/_temp/ba1f453d-73cd-4db5-b045-b5b00ed826b9' before making global git config changes
2026-10-10T09:17:23.3170775Z Adding repository directory to the temporary git global config as a safe directory
2026-10-10T09:17:23.3175907Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-10T09:17:23.3219593Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-10T09:17:23.3257661Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-10T09:17:23.3511020Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-10T09:17:23.3545033Z http.https://github.com/.extraheader
2026-10-10T09:17:23.3557046Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-10T09:17:23.3592658Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-10T09:17:23.3857964Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-10T09:17:23.3897085Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
﻿2026-10-10T09:17:23.4313406Z Cleaning up orphan processes
2026-10-10T09:17:23.4606143Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
```

## Run ID: 38039465030

```text
29:2026-10-10T08:53:47.7930437Z Prepare all required actions
149:2026-10-10T08:53:53.1339803Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
151:2026-10-10T08:53:53.1340615Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
154:2026-10-10T08:53:53.1341611Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
190:2026-10-10T08:53:53.1807547Z   dependency-graph-continue-on-failure: true
348:2026-10-10T08:54:13.7478455Z (node:2352) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
413:2026-10-10T08:54:24.5306620Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
546:2026-10-10T08:53:47.7930417Z Prepare all required actions
666:2026-10-10T08:53:53.1339801Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
668:2026-10-10T08:53:53.1340494Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
671:2026-10-10T08:53:53.1341608Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
707:2026-10-10T08:53:53.1807543Z   dependency-graph-continue-on-failure: true
865:2026-10-10T08:54:13.7478401Z (node:2352) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
930:2026-10-10T08:54:24.5306583Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
```

### Tail of logs

```text
2026-10-10T08:54:27.7277690Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleanup deleted 2 files/directories.
2026-10-10T08:54:27.7278929Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleaned up in 0.008 secs.
2026-10-10T08:54:27.7280156Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7281804Z jars (/home/runner/.gradle/caches/jars-9) removing files not accessed on or after Sat Oct 10 08:53:53 UTC 2026.
2026-10-10T08:54:27.7285785Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 1 files/directories.
2026-10-10T08:54:27.7286786Z jars (/home/runner/.gradle/caches/jars-9) cleaned up in 0.005 secs.
2026-10-10T08:54:27.7288086Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) removing files not accessed on or after Sat Oct 10 08:53:53 UTC 2026.
2026-10-10T08:54:27.7289483Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7290676Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleaned up in 0.0 secs.
2026-10-10T08:54:27.7292327Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) removing files not accessed on or after Sat Oct 10 08:53:53 UTC 2026.
2026-10-10T08:54:27.7294462Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7295809Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleaned up in 0.0 secs.
2026-10-10T08:54:27.7297388Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7298814Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7300623Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Sat Oct 10 08:53:53 UTC 2026.
2026-10-10T08:54:27.7302601Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7304257Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7306034Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Sat Oct 10 08:53:53 UTC 2026.
2026-10-10T08:54:27.7307812Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7309540Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7310982Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7312046Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.029 secs.
2026-10-10T08:54:27.7967975Z ##[endgroup]
2026-10-10T08:54:27.7969340Z ##[group]Caching Gradle state
2026-10-10T08:54:27.9291294Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:54:27.9555607Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:54:28.7610804Z Sent 98890 of 98890 (100.0%), 0.3 MBs/sec
2026-10-10T08:54:28.7715678Z Sent 167353 of 167353 (100.0%), 0.4 MBs/sec
2026-10-10T08:54:28.9749531Z Saved cache entry with key gradle-instrumented-jars-v1-845c103436a6d9ff36ac3b7c9205b599 from /home/runner/.gradle/caches/jars-*/*/ in 1068ms
2026-10-10T08:54:29.0282797Z Saved cache entry with key gradle-groovy-dsl-v1-dfe65cdb668e7e7c0226520e2f9bee13 from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 1096ms
2026-10-10T08:54:29.0951963Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:54:29.5694612Z Sent 865551 of 865551 (100.0%), 3.4 MBs/sec
2026-10-10T08:54:29.7903362Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-22cc37688fb34a2509f7b907f4bebc699f9dfdce from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 704ms
2026-10-10T08:54:29.7904618Z ##[endgroup]
2026-10-10T08:54:29.7909774Z Generating Job Summary
2026-10-10T08:54:29.7920292Z Completed post-action step
﻿2026-10-10T08:54:29.8083941Z Post job cleanup.
2026-10-10T08:54:29.9265501Z (node:2614) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-10T08:54:29.9266312Z (Use `node --trace-deprecation ...` to show where the warning was created)
﻿2026-10-10T08:54:29.9415705Z Post job cleanup.
2026-10-10T08:54:30.0151849Z [command]/usr/bin/git version
2026-10-10T08:54:30.0187527Z git version 2.55.0
2026-10-10T08:54:30.0217809Z Temporarily overriding HOME='/home/runner/work/_temp/d92c130e-f76e-4530-9777-3632c066c830' before making global git config changes
2026-10-10T08:54:30.0219127Z Adding repository directory to the temporary git global config as a safe directory
2026-10-10T08:54:30.0222779Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-10T08:54:30.0251913Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-10T08:54:30.0280245Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-10T08:54:30.0476628Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-10T08:54:30.0501586Z http.https://github.com/.extraheader
2026-10-10T08:54:30.0511041Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-10T08:54:30.0542421Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-10T08:54:30.0738404Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-10T08:54:30.0767787Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
﻿2026-10-10T08:54:30.1098168Z Cleaning up orphan processes
2026-10-10T08:54:30.1306157Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
```

## Run ID: 38039444391

```text
29:2026-10-10T08:53:26.4525786Z Prepare all required actions
149:2026-10-10T08:53:28.8336724Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
151:2026-10-10T08:53:28.8338581Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
154:2026-10-10T08:53:28.8349847Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
190:2026-10-10T08:53:28.9504029Z   dependency-graph-continue-on-failure: true
345:2026-10-10T08:53:54.8247383Z (node:2586) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
409:2026-10-10T08:54:00.9474343Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
542:2026-10-10T08:53:26.4525758Z Prepare all required actions
662:2026-10-10T08:53:28.8336720Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
664:2026-10-10T08:53:28.8338518Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
667:2026-10-10T08:53:28.8349842Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
703:2026-10-10T08:53:28.9504026Z   dependency-graph-continue-on-failure: true
858:2026-10-10T08:53:54.8247322Z (node:2586) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
922:2026-10-10T08:54:00.9474287Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
```

### Tail of logs

```text
2026-10-10T08:54:05.3403371Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleanup deleted 2 files/directories.
2026-10-10T08:54:05.3419707Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleaned up in 0.016 secs.
2026-10-10T08:54:05.3421069Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 0 files/directories.
2026-10-10T08:54:05.3423243Z jars (/home/runner/.gradle/caches/jars-9) removing files not accessed on or after Sat Oct 10 08:53:30 UTC 2026.
2026-10-10T08:54:05.3424779Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 1 files/directories.
2026-10-10T08:54:05.3425997Z jars (/home/runner/.gradle/caches/jars-9) cleaned up in 0.007 secs.
2026-10-10T08:54:05.3427550Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) removing files not accessed on or after Sat Oct 10 08:53:30 UTC 2026.
2026-10-10T08:54:05.3429343Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleanup deleted 0 files/directories.
2026-10-10T08:54:05.3430885Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleaned up in 0.0 secs.
2026-10-10T08:54:05.3432959Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) removing files not accessed on or after Sat Oct 10 08:53:30 UTC 2026.
2026-10-10T08:54:05.3435761Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleanup deleted 0 files/directories.
2026-10-10T08:54:05.3439497Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleaned up in 0.003 secs.
2026-10-10T08:54:05.3442370Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T08:54:05.3444273Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:54:05.3446726Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Sat Oct 10 08:53:30 UTC 2026.
2026-10-10T08:54:05.3449120Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:54:05.3451233Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:54:05.3453869Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Sat Oct 10 08:53:30 UTC 2026.
2026-10-10T08:54:05.3456238Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:54:05.3458375Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-10-10T08:54:05.3460165Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T08:54:05.3461485Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.041 secs.
2026-10-10T08:54:05.4447610Z ##[endgroup]
2026-10-10T08:54:05.4448152Z ##[group]Caching Gradle state
2026-10-10T08:54:05.6339535Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:54:05.6775519Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:54:05.7614026Z Sent 99444 of 99444 (100.0%), 1.6 MBs/sec
2026-10-10T08:54:05.8114772Z Sent 168111 of 168111 (100.0%), 2.9 MBs/sec
2026-10-10T08:54:05.8629062Z Saved cache entry with key gradle-instrumented-jars-v1-9e36d6694b83ba82c7b412875eb5d062 from /home/runner/.gradle/caches/jars-*/*/ in 255ms
2026-10-10T08:54:06.1743131Z Saved cache entry with key gradle-groovy-dsl-v1-6979277ef38ba473f02ac7903d8abe7d from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 532ms
2026-10-10T08:54:06.2327762Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:54:06.3676381Z Sent 866996 of 866996 (100.0%), 20.2 MBs/sec
2026-10-10T08:54:06.4428661Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-b9d26c2bd2b57567a093daa0b7fd7a028960d4ec from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 221ms
2026-10-10T08:54:06.4430604Z ##[endgroup]
2026-10-10T08:54:06.4436357Z Generating Job Summary
2026-10-10T08:54:06.4449596Z Completed post-action step
﻿2026-10-10T08:54:06.4697849Z Post job cleanup.
2026-10-10T08:54:06.6112602Z (node:2847) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-10T08:54:06.6113594Z (Use `node --trace-deprecation ...` to show where the warning was created)
﻿2026-10-10T08:54:06.6333080Z Post job cleanup.
2026-10-10T08:54:06.7269730Z [command]/usr/bin/git version
2026-10-10T08:54:06.7309567Z git version 2.55.0
2026-10-10T08:54:06.7346929Z Temporarily overriding HOME='/home/runner/work/_temp/059bb4c4-047b-4cb3-8936-39f8acaec217' before making global git config changes
2026-10-10T08:54:06.7348433Z Adding repository directory to the temporary git global config as a safe directory
2026-10-10T08:54:06.7352540Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-10T08:54:06.7394994Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-10T08:54:06.7430922Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-10T08:54:06.7694473Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-10T08:54:06.7725646Z http.https://github.com/.extraheader
2026-10-10T08:54:06.7744495Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-10T08:54:06.7782515Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-10T08:54:06.8172911Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-10T08:54:06.8204337Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
﻿2026-10-10T08:54:06.8725848Z Cleaning up orphan processes
2026-10-10T08:54:06.9044741Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
```
