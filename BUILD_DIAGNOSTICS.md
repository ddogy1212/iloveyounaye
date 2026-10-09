# APK build error report

37933929937	completed	success
37932757221	completed	success
37932221114	completed	success

## Run ID: 37933929937

```text
29:2026-10-09T13:01:26.3961076Z Prepare all required actions
149:2026-10-09T13:01:30.5973082Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
151:2026-10-09T13:01:30.5973812Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
154:2026-10-09T13:01:30.5974747Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
190:2026-10-09T13:01:30.6940659Z   dependency-graph-continue-on-failure: true
348:2026-10-09T13:02:03.5293324Z (node:2547) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
413:2026-10-09T13:02:13.8873733Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
546:2026-10-09T13:01:26.3961031Z Prepare all required actions
666:2026-10-09T13:01:30.5973079Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
668:2026-10-09T13:01:30.5973764Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
671:2026-10-09T13:01:30.5974745Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
707:2026-10-09T13:01:30.6940654Z   dependency-graph-continue-on-failure: true
865:2026-10-09T13:02:03.5293221Z (node:2547) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
930:2026-10-09T13:02:13.8873656Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
```

### Tail of logs

```text
2026-10-09T13:02:18.6776484Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleanup deleted 2 files/directories.
2026-10-09T13:02:18.6778190Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleaned up in 0.015 secs.
2026-10-09T13:02:18.6782490Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6786771Z jars (/home/runner/.gradle/caches/jars-9) removing files not accessed on or after Fri Oct 09 13:01:32 UTC 2026.
2026-10-09T13:02:18.6815696Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 2 files/directories.
2026-10-09T13:02:18.6835925Z jars (/home/runner/.gradle/caches/jars-9) cleaned up in 0.01 secs.
2026-10-09T13:02:18.6837466Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) removing files not accessed on or after Fri Oct 09 13:01:32 UTC 2026.
2026-10-09T13:02:18.6839114Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6840603Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleaned up in 0.0 secs.
2026-10-09T13:02:18.6842364Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) removing files not accessed on or after Fri Oct 09 13:01:32 UTC 2026.
2026-10-09T13:02:18.6844281Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6846077Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleaned up in 0.0 secs.
2026-10-09T13:02:18.6847662Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6849418Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6851800Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Fri Oct 09 13:01:32 UTC 2026.
2026-10-09T13:02:18.6854096Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6856872Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6859227Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Fri Oct 09 13:01:32 UTC 2026.
2026-10-09T13:02:18.6861415Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6863430Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6865386Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6866568Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.031 secs.
2026-10-09T13:02:18.7601060Z ##[endgroup]
2026-10-09T13:02:18.7601623Z ##[group]Caching Gradle state
2026-10-09T13:02:18.9400486Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T13:02:18.9834411Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T13:02:19.7869447Z Sent 99634 of 99634 (100.0%), 0.4 MBs/sec
2026-10-09T13:02:19.8200272Z Sent 162781 of 162781 (100.0%), 0.6 MBs/sec
2026-10-09T13:02:19.9772958Z Saved cache entry with key gradle-instrumented-jars-v1-1b8dbcc50017c037f5bddec2313a3d20 from /home/runner/.gradle/caches/jars-*/*/ in 1064ms
2026-10-09T13:02:20.0070550Z Saved cache entry with key gradle-groovy-dsl-v1-7431745c1d49acef815cbd7928a26a25 from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 1059ms
2026-10-09T13:02:20.0811697Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T13:02:20.5877429Z Sent 863291 of 863291 (100.0%), 2.7 MBs/sec
2026-10-09T13:02:20.7540805Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-83b43dc0b0ff58f555880e4c2fe3953e5f92c89d from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 686ms
2026-10-09T13:02:20.7542475Z ##[endgroup]
2026-10-09T13:02:20.7549715Z Generating Job Summary
2026-10-09T13:02:20.7563143Z Completed post-action step
﻿2026-10-09T13:02:20.7809667Z Post job cleanup.
2026-10-09T13:02:20.9219481Z (node:2787) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-09T13:02:20.9220525Z (Use `node --trace-deprecation ...` to show where the warning was created)
﻿2026-10-09T13:02:20.9403377Z Post job cleanup.
2026-10-09T13:02:21.0381681Z [command]/usr/bin/git version
2026-10-09T13:02:21.0432642Z git version 2.55.0
2026-10-09T13:02:21.0506571Z Temporarily overriding HOME='/home/runner/work/_temp/1bbca2fa-45bf-4d92-a94d-2ff79907393a' before making global git config changes
2026-10-09T13:02:21.0508164Z Adding repository directory to the temporary git global config as a safe directory
2026-10-09T13:02:21.0513533Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-09T13:02:21.0561478Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-09T13:02:21.0603988Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-09T13:02:21.0880989Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-09T13:02:21.0915652Z http.https://github.com/.extraheader
2026-10-09T13:02:21.0935002Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-09T13:02:21.0970411Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-09T13:02:21.1231919Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-09T13:02:21.1280632Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
﻿2026-10-09T13:02:21.1701399Z Cleaning up orphan processes
2026-10-09T13:02:21.2000463Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
```

## Run ID: 37932757221

```text
29:2026-10-09T12:51:06.3148170Z Prepare all required actions
149:2026-10-09T12:51:09.0819123Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
151:2026-10-09T12:51:09.0820441Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
154:2026-10-09T12:51:09.0822201Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
190:2026-10-09T12:51:09.1477476Z   dependency-graph-continue-on-failure: true
345:2026-10-09T12:51:36.7957913Z (node:2597) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
409:2026-10-09T12:51:45.5468126Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
542:2026-10-09T12:51:06.3148147Z Prepare all required actions
662:2026-10-09T12:51:09.0819118Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
664:2026-10-09T12:51:09.0820397Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
667:2026-10-09T12:51:09.0822196Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
703:2026-10-09T12:51:09.1477473Z   dependency-graph-continue-on-failure: true
858:2026-10-09T12:51:36.7957869Z (node:2597) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
922:2026-10-09T12:51:45.5468066Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
```

### Tail of logs

```text
2026-10-09T12:51:49.7473719Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleanup deleted 2 files/directories.
2026-10-09T12:51:49.7475102Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleaned up in 0.013 secs.
2026-10-09T12:51:49.7476376Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7478351Z jars (/home/runner/.gradle/caches/jars-9) removing files not accessed on or after Fri Oct 09 12:51:09 UTC 2026.
2026-10-09T12:51:49.7482982Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 2 files/directories.
2026-10-09T12:51:49.7484144Z jars (/home/runner/.gradle/caches/jars-9) cleaned up in 0.011 secs.
2026-10-09T12:51:49.7485646Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) removing files not accessed on or after Fri Oct 09 12:51:09 UTC 2026.
2026-10-09T12:51:49.7487394Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7488857Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleaned up in 0.0 secs.
2026-10-09T12:51:49.7490610Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) removing files not accessed on or after Fri Oct 09 12:51:09 UTC 2026.
2026-10-09T12:51:49.7492677Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7494322Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleaned up in 0.0 secs.
2026-10-09T12:51:49.7495755Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7497478Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7499737Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Fri Oct 09 12:51:09 UTC 2026.
2026-10-09T12:51:49.7502000Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7504307Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7506559Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Fri Oct 09 12:51:09 UTC 2026.
2026-10-09T12:51:49.7766480Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7783907Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7793836Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7803892Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.045 secs.
2026-10-09T12:51:49.8966539Z ##[endgroup]
2026-10-09T12:51:49.8967101Z ##[group]Caching Gradle state
2026-10-09T12:51:50.0787794Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T12:51:50.1165072Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T12:51:50.2276915Z Sent 99467 of 99467 (100.0%), 2.4 MBs/sec
2026-10-09T12:51:50.2397503Z Sent 161693 of 161693 (100.0%), 5.7 MBs/sec
2026-10-09T12:51:50.6037754Z Saved cache entry with key gradle-instrumented-jars-v1-77cb8bc0ad538db4f3d8a0a8af81655c from /home/runner/.gradle/caches/jars-*/*/ in 550ms
2026-10-09T12:51:50.6217426Z Saved cache entry with key gradle-groovy-dsl-v1-6ecc6e1b0dac4630a57806bc98af82c7 from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 537ms
2026-10-09T12:51:50.6702814Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T12:51:50.8165346Z Sent 861276 of 861276 (100.0%), 17.5 MBs/sec
2026-10-09T12:51:50.9051446Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-db98aca526444bd5883a0799a63f5f8242a780cd from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 245ms
2026-10-09T12:51:50.9053477Z ##[endgroup]
2026-10-09T12:51:50.9059074Z Generating Job Summary
2026-10-09T12:51:50.9072701Z Completed post-action step
﻿2026-10-09T12:51:50.9307327Z Post job cleanup.
2026-10-09T12:51:51.0646228Z (node:2835) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-09T12:51:51.0647465Z (Use `node --trace-deprecation ...` to show where the warning was created)
﻿2026-10-09T12:51:51.0869548Z Post job cleanup.
2026-10-09T12:51:51.1782102Z [command]/usr/bin/git version
2026-10-09T12:51:51.1828572Z git version 2.55.0
2026-10-09T12:51:51.1872442Z Temporarily overriding HOME='/home/runner/work/_temp/423753e4-1f6b-4b6b-ab21-f9a8a6046445' before making global git config changes
2026-10-09T12:51:51.1874046Z Adding repository directory to the temporary git global config as a safe directory
2026-10-09T12:51:51.1879595Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-09T12:51:51.1918082Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-09T12:51:51.1953821Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-09T12:51:51.2200870Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-09T12:51:51.2234685Z http.https://github.com/.extraheader
2026-10-09T12:51:51.2252884Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-09T12:51:51.2301704Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-09T12:51:51.2645682Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-09T12:51:51.2696660Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
﻿2026-10-09T12:51:51.3150484Z Cleaning up orphan processes
2026-10-09T12:51:51.3449144Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
```

## Run ID: 37932221114

```text
29:2026-10-09T12:46:16.3290513Z Prepare all required actions
149:2026-10-09T12:46:18.8254421Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
151:2026-10-09T12:46:18.8259210Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
154:2026-10-09T12:46:18.8265496Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
190:2026-10-09T12:46:18.9399065Z   dependency-graph-continue-on-failure: true
345:2026-10-09T12:46:57.0144799Z (node:2595) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
409:2026-10-09T12:47:05.7815789Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
545:2026-10-09T12:46:16.3290470Z Prepare all required actions
665:2026-10-09T12:46:18.8254412Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
667:2026-10-09T12:46:18.8259086Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
670:2026-10-09T12:46:18.8265487Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
706:2026-10-09T12:46:18.9399061Z   dependency-graph-continue-on-failure: true
861:2026-10-09T12:46:57.0144708Z (node:2595) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
925:2026-10-09T12:47:05.7815721Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
```

### Tail of logs

```text
2026-10-09T12:47:10.1800380Z jars (/home/runner/.gradle/caches/jars-9) removing files not accessed on or after Fri Oct 09 12:46:20 UTC 2026.
2026-10-09T12:47:10.1801529Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 2 files/directories.
2026-10-09T12:47:10.1802424Z jars (/home/runner/.gradle/caches/jars-9) cleaned up in 0.011 secs.
2026-10-09T12:47:10.1803744Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) removing files not accessed on or after Fri Oct 09 12:46:20 UTC 2026.
2026-10-09T12:47:10.1805725Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleanup deleted 0 files/directories.
2026-10-09T12:47:10.1817807Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleaned up in 0.0 secs.
2026-10-09T12:47:10.1819626Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) removing files not accessed on or after Fri Oct 09 12:46:20 UTC 2026.
2026-10-09T12:47:10.1821743Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleanup deleted 0 files/directories.
2026-10-09T12:47:10.1823614Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleaned up in 0.0 secs.
2026-10-09T12:47:10.1825197Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-09T12:47:10.1827363Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-09T12:47:10.1829641Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Fri Oct 09 12:46:20 UTC 2026.
2026-10-09T12:47:10.1832032Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-09T12:47:10.1834242Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-09T12:47:10.1836862Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Fri Oct 09 12:46:20 UTC 2026.
2026-10-09T12:47:10.3629770Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 295 files/directories.
2026-10-09T12:47:10.3631921Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-10-09T12:47:10.3633576Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-09T12:47:10.3634767Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.206 secs.
2026-10-09T12:47:10.4416684Z ##[endgroup]
2026-10-09T12:47:10.4417252Z ##[group]Caching Gradle state
2026-10-09T12:47:10.5909191Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T12:47:10.6357657Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T12:47:10.7556656Z Sent 161626 of 161626 (100.0%), 4.3 MBs/sec
2026-10-09T12:47:10.7606325Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T12:47:10.7844474Z Sent 99129 of 99129 (100.0%), 1.1 MBs/sec
2026-10-09T12:47:10.8664763Z Saved cache entry with key gradle-groovy-dsl-v1-e72bca566bf195b8830b3bf729aba71c from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 269ms
2026-10-09T12:47:10.9203278Z Saved cache entry with key gradle-instrumented-jars-v1-4b23dd5fd9a8fc244b7b005009aec0d8 from /home/runner/.gradle/caches/jars-*/*/ in 359ms
2026-10-09T12:47:12.3227022Z Sent 90294414 of 90294414 (100.0%), 90.9 MBs/sec
2026-10-09T12:47:12.4105650Z Saved cache entry with key gradle-dependencies-v1-aa72e648b2278a6625f4c6c041a52dea from /home/runner/.gradle/caches/modules-*/files-*/*/*/*/* in 1868ms
2026-10-09T12:47:12.4619237Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T12:47:12.6197223Z Sent 863631 of 863631 (100.0%), 23.5 MBs/sec
2026-10-09T12:47:12.7097114Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-f807a5ea8a747b29d2011167c504472899bbfce9 from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 263ms
2026-10-09T12:47:12.7100132Z ##[endgroup]
2026-10-09T12:47:12.7110114Z Generating Job Summary
2026-10-09T12:47:12.7126673Z Completed post-action step
﻿2026-10-09T12:47:12.7389943Z Post job cleanup.
2026-10-09T12:47:12.8788370Z (node:2841) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-09T12:47:12.8789462Z (Use `node --trace-deprecation ...` to show where the warning was created)
﻿2026-10-09T12:47:12.9043284Z Post job cleanup.
2026-10-09T12:47:13.0009219Z [command]/usr/bin/git version
2026-10-09T12:47:13.0054508Z git version 2.55.0
2026-10-09T12:47:13.0095690Z Temporarily overriding HOME='/home/runner/work/_temp/f6ce027d-01c1-4b1d-932d-c1cf31cf9519' before making global git config changes
2026-10-09T12:47:13.0097823Z Adding repository directory to the temporary git global config as a safe directory
2026-10-09T12:47:13.0106185Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-09T12:47:13.0152241Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-09T12:47:13.0200452Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-09T12:47:13.0455418Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-09T12:47:13.0488029Z http.https://github.com/.extraheader
2026-10-09T12:47:13.0516679Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-09T12:47:13.0586799Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-09T12:47:13.0852845Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-09T12:47:13.0903175Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
﻿2026-10-09T12:47:13.1302872Z Cleaning up orphan processes
2026-10-09T12:47:13.1622464Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
```
