# APK build error report

38039465030	completed	success
38039444391	completed	success
38039362216	completed	success

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

## Run ID: 38039362216

```text
29:2026-10-10T08:51:59.4251653Z Prepare all required actions
149:2026-10-10T08:52:05.2895919Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
151:2026-10-10T08:52:05.2896515Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
154:2026-10-10T08:52:05.2897216Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
190:2026-10-10T08:52:05.3482068Z   dependency-graph-continue-on-failure: true
348:2026-10-10T08:52:24.0792573Z (node:2360) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
413:2026-10-10T08:52:34.5311273Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
546:2026-10-10T08:51:59.4251613Z Prepare all required actions
666:2026-10-10T08:52:05.2895905Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
668:2026-10-10T08:52:05.2896470Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
671:2026-10-10T08:52:05.2897214Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
707:2026-10-10T08:52:05.3482065Z   dependency-graph-continue-on-failure: true
865:2026-10-10T08:52:24.0792532Z (node:2360) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
930:2026-10-10T08:52:34.5311189Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
```

### Tail of logs

```text
2026-10-10T08:52:37.6308887Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleanup deleted 2 files/directories.
2026-10-10T08:52:37.6312522Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleaned up in 0.011 secs.
2026-10-10T08:52:37.6315610Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 0 files/directories.
2026-10-10T08:52:37.6319986Z jars (/home/runner/.gradle/caches/jars-9) removing files not accessed on or after Sat Oct 10 08:52:05 UTC 2026.
2026-10-10T08:52:37.6321092Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 2 files/directories.
2026-10-10T08:52:37.6321908Z jars (/home/runner/.gradle/caches/jars-9) cleaned up in 0.008 secs.
2026-10-10T08:52:37.6322994Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) removing files not accessed on or after Sat Oct 10 08:52:05 UTC 2026.
2026-10-10T08:52:37.6324284Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleanup deleted 0 files/directories.
2026-10-10T08:52:37.6325352Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleaned up in 0.0 secs.
2026-10-10T08:52:37.6326835Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) removing files not accessed on or after Sat Oct 10 08:52:05 UTC 2026.
2026-10-10T08:52:37.6328374Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleanup deleted 0 files/directories.
2026-10-10T08:52:37.6329665Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleaned up in 0.0 secs.
2026-10-10T08:52:37.6330795Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T08:52:37.6332145Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:52:37.6333866Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Sat Oct 10 08:52:05 UTC 2026.
2026-10-10T08:52:37.6335595Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:52:37.6337195Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:52:37.6338747Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Sat Oct 10 08:52:05 UTC 2026.
2026-10-10T08:52:37.6340361Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:52:37.6341849Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-10-10T08:52:37.6343081Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T08:52:37.6343985Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.032 secs.
2026-10-10T08:52:37.6792253Z ##[endgroup]
2026-10-10T08:52:37.6793234Z ##[group]Caching Gradle state
2026-10-10T08:52:37.8137747Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:52:37.8446480Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:52:38.7471620Z Sent 99297 of 99297 (100.0%), 0.3 MBs/sec
2026-10-10T08:52:38.7499970Z Sent 167604 of 167604 (100.0%), 0.4 MBs/sec
2026-10-10T08:52:39.0131105Z Saved cache entry with key gradle-instrumented-jars-v1-11fb37dbab17c5285c2ce50bb0cd5444 from /home/runner/.gradle/caches/jars-*/*/ in 1221ms
2026-10-10T08:52:39.0460374Z Saved cache entry with key gradle-groovy-dsl-v1-18fad5c8388f8378d2754daa1e835fe5 from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 1226ms
2026-10-10T08:52:39.1166776Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:52:39.7879631Z Sent 863976 of 863976 (100.0%), 1.9 MBs/sec
2026-10-10T08:52:40.0323297Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-d93242d9bfe940e35d2a64770d3ea5ed0d6955c6 from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 923ms
2026-10-10T08:52:40.0324925Z ##[endgroup]
2026-10-10T08:52:40.0330651Z Generating Job Summary
2026-10-10T08:52:40.0341050Z Completed post-action step
﻿2026-10-10T08:52:40.0523902Z Post job cleanup.
2026-10-10T08:52:40.1598876Z (node:2598) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-10T08:52:40.1599910Z (Use `node --trace-deprecation ...` to show where the warning was created)
﻿2026-10-10T08:52:40.1774509Z Post job cleanup.
2026-10-10T08:52:40.2480820Z [command]/usr/bin/git version
2026-10-10T08:52:40.2515004Z git version 2.55.0
2026-10-10T08:52:40.2542729Z Temporarily overriding HOME='/home/runner/work/_temp/867b543f-4b83-4340-9bfa-05ee178b209e' before making global git config changes
2026-10-10T08:52:40.2543854Z Adding repository directory to the temporary git global config as a safe directory
2026-10-10T08:52:40.2547441Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-10T08:52:40.2577460Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-10T08:52:40.2606212Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-10T08:52:40.2825809Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-10T08:52:40.2847945Z http.https://github.com/.extraheader
2026-10-10T08:52:40.2856490Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-10T08:52:40.2885416Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-10T08:52:40.3089924Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-10T08:52:40.3121772Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
﻿2026-10-10T08:52:40.3462019Z Cleaning up orphan processes
2026-10-10T08:52:40.3690088Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
```
