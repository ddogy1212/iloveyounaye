# APK build error report

44748516000	completed	success
44746598528	completed	success
38040806651	completed	success

## Run ID: 44748516000

```text
29:2026-11-20T13:54:59.0329130Z Prepare all required actions
149:2026-11-20T13:55:02.5363360Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
151:2026-11-20T13:55:02.5364029Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
154:2026-11-20T13:55:02.5364576Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
190:2026-11-20T13:55:02.5675863Z   dependency-graph-continue-on-failure: true
345:2026-11-20T13:55:25.4269533Z (node:2466) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
412:2026-11-20T13:55:35.3293098Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
549:2026-11-20T13:54:59.0329089Z Prepare all required actions
669:2026-11-20T13:55:02.5363350Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
671:2026-11-20T13:55:02.5363989Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
674:2026-11-20T13:55:02.5364573Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
710:2026-11-20T13:55:02.5675861Z   dependency-graph-continue-on-failure: true
865:2026-11-20T13:55:25.4268929Z (node:2466) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
932:2026-11-20T13:55:35.3293002Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
```

### Tail of logs

```text
2026-11-20T13:55:38.3328936Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 2 files/directories.
2026-11-20T13:55:38.3329610Z jars (/home/runner/.gradle/caches/jars-9) cleaned up in 0.007 secs.
2026-11-20T13:55:38.3330450Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) removing files not accessed on or after Fri Nov 20 13:55:02 UTC 2026.
2026-11-20T13:55:38.3331513Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleanup deleted 0 files/directories.
2026-11-20T13:55:38.3332310Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleaned up in 0.0 secs.
2026-11-20T13:55:38.3333278Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) removing files not accessed on or after Fri Nov 20 13:55:02 UTC 2026.
2026-11-20T13:55:38.3334299Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleanup deleted 0 files/directories.
2026-11-20T13:55:38.3335173Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleaned up in 0.0 secs.
2026-11-20T13:55:38.3335934Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-11-20T13:55:38.3336839Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-11-20T13:55:38.3337999Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Fri Nov 20 13:55:02 UTC 2026.
2026-11-20T13:55:38.3339150Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-11-20T13:55:38.3340200Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-11-20T13:55:38.3341474Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Fri Nov 20 13:55:02 UTC 2026.
2026-11-20T13:55:38.4282642Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 295 files/directories.
2026-11-20T13:55:38.4283463Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-11-20T13:55:38.4284045Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-11-20T13:55:38.4284472Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.127 secs.
2026-11-20T13:55:38.5568612Z ##[endgroup]
2026-11-20T13:55:38.5569139Z ##[group]Caching Gradle state
2026-11-20T13:55:38.6486549Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-11-20T13:55:38.6869022Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-11-20T13:55:38.7571338Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-11-20T13:55:39.4012457Z Sent 98638 of 98638 (100.0%), 0.2 MBs/sec
2026-11-20T13:55:39.4227069Z Sent 160106 of 160106 (100.0%), 0.7 MBs/sec
2026-11-20T13:55:39.5857091Z Saved cache entry with key gradle-groovy-dsl-v1-bf438bc58ff365643e6eb28604db9bd0 from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 926ms
2026-11-20T13:55:39.6299582Z Saved cache entry with key gradle-instrumented-jars-v1-ea6fc783ce1a5f28dacdacaa96a08a2d from /home/runner/.gradle/caches/jars-*/*/ in 1003ms
2026-11-20T13:55:40.2946632Z Sent 62652416 of 90294063 (69.4%), 59.8 MBs/sec
2026-11-20T13:55:41.1701591Z Sent 90294063 of 90294063 (100.0%), 46.0 MBs/sec
2026-11-20T13:55:41.3332413Z Saved cache entry with key gradle-dependencies-v1-aa72e648b2278a6625f4c6c041a52dea from /home/runner/.gradle/caches/modules-*/files-*/*/*/*/* in 2725ms
2026-11-20T13:55:41.4066331Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-11-20T13:55:41.8343825Z Sent 865195 of 865195 (100.0%), 3.3 MBs/sec
2026-11-20T13:55:41.9863886Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-f31c6505a2e5cc7f5e0ec67a2c941e1c96e30e09 from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 590ms
2026-11-20T13:55:41.9864838Z ##[endgroup]
2026-11-20T13:55:41.9871461Z Generating Job Summary
2026-11-20T13:55:41.9881110Z Completed post-action step
﻿2026-11-20T13:55:42.1747092Z Post job cleanup.
2026-11-20T13:55:42.2741418Z (node:2711) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-11-20T13:55:42.2741990Z (Use `node --trace-deprecation ...` to show where the warning was created)
﻿2026-11-20T13:55:42.2971474Z Post job cleanup.
2026-11-20T13:55:42.3631365Z [command]/usr/bin/git version
2026-11-20T13:55:42.3667802Z git version 2.56.1
2026-11-20T13:55:42.3695223Z Temporarily overriding HOME='/home/runner/work/_temp/aa43304d-9962-4ded-a483-b2acd60309f8' before making global git config changes
2026-11-20T13:55:42.3696063Z Adding repository directory to the temporary git global config as a safe directory
2026-11-20T13:55:42.3699802Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-11-20T13:55:42.4064003Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-11-20T13:55:42.4097112Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-11-20T13:55:42.4357482Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-11-20T13:55:42.4380621Z http.https://github.com/.extraheader
2026-11-20T13:55:42.4389297Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-11-20T13:55:42.5230639Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-11-20T13:55:42.5476513Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-11-20T13:55:42.5506579Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
﻿2026-11-20T13:55:42.5873079Z Cleaning up orphan processes
2026-11-20T13:55:42.6140665Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
```

## Run ID: 44746598528

```text
29:2026-11-20T13:42:05.5330157Z Prepare all required actions
149:2026-11-20T13:42:08.6869993Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
151:2026-11-20T13:42:08.6874746Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
154:2026-11-20T13:42:08.6879437Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
190:2026-11-20T13:42:08.7546663Z   dependency-graph-continue-on-failure: true
206:2026-11-20T13:42:09.4908902Z Gradle User Home cache not found. Will initialize empty.
212:2026-11-20T13:42:13.6617374Z Gradle distribution 8.9 not found in cache. Will download.
241:2026-11-20T13:42:19.9911839Z  - Enhanced Error and Warning Messages
325:2026-11-20T13:43:00.7848173Z (node:3282) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
375:2026-11-20T13:43:08.4068087Z Gradle distribution 8.11 not found in cache. Will download.
395:2026-11-20T13:43:13.7095910Z  - Java compilation errors at the end of the build output
401:2026-11-20T13:43:13.9089758Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
569:2026-11-20T13:42:05.5330120Z Prepare all required actions
689:2026-11-20T13:42:08.6869985Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
691:2026-11-20T13:42:08.6874692Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
694:2026-11-20T13:42:08.6879430Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
730:2026-11-20T13:42:08.7546659Z   dependency-graph-continue-on-failure: true
746:2026-11-20T13:42:09.4908842Z Gradle User Home cache not found. Will initialize empty.
752:2026-11-20T13:42:13.6617304Z Gradle distribution 8.9 not found in cache. Will download.
781:2026-11-20T13:42:19.9911833Z  - Enhanced Error and Warning Messages
865:2026-11-20T13:43:00.7848082Z (node:3282) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
915:2026-11-20T13:43:08.4068048Z Gradle distribution 8.11 not found in cache. Will download.
935:2026-11-20T13:43:13.7095907Z  - Java compilation errors at the end of the build output
941:2026-11-20T13:43:13.9089229Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
```

### Tail of logs

```text
2026-11-20T13:43:20.7090135Z jars (/home/runner/.gradle/caches/jars-9) removing files not accessed on or after Fri Nov 20 13:42:09 UTC 2026.
2026-11-20T13:43:20.7091678Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 0 files/directories.
2026-11-20T13:43:20.7092759Z jars (/home/runner/.gradle/caches/jars-9) cleaned up in 0.007 secs.
2026-11-20T13:43:20.7118445Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-11-20T13:43:20.7131510Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-11-20T13:43:20.7168243Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Fri Nov 20 13:42:09 UTC 2026.
2026-11-20T13:43:20.7194457Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-11-20T13:43:20.7204349Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-11-20T13:43:20.7227682Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Fri Nov 20 13:42:09 UTC 2026.
2026-11-20T13:43:20.7481625Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-11-20T13:43:20.7495426Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-11-20T13:43:20.7497782Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-11-20T13:43:20.7499157Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.084 secs.
2026-11-20T13:43:20.8611365Z ##[endgroup]
2026-11-20T13:43:20.8612420Z ##[group]Caching Gradle state
2026-11-20T13:43:21.0564374Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-11-20T13:43:21.0937228Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-11-20T13:43:21.2605186Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-11-20T13:43:21.6328981Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-11-20T13:43:21.8129476Z Sent 99918 of 99918 (100.0%), 0.2 MBs/sec
2026-11-20T13:43:21.8483847Z Sent 160655 of 160655 (100.0%), 0.3 MBs/sec
2026-11-20T13:43:22.0665406Z Saved cache entry with key gradle-instrumented-jars-v1-26a05ac3117dbc03c535e482b294578d from /home/runner/.gradle/caches/jars-*/*/ in 1032ms
2026-11-20T13:43:22.0935299Z Saved cache entry with key gradle-groovy-dsl-v1-7178f57a045fa92c4b5e80730807d6c0 from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 1024ms
2026-11-20T13:43:22.8521214Z Sent 19791872 of 90560351 (21.9%), 18.9 MBs/sec
2026-11-20T13:43:23.4772365Z Sent 19267584 of 53347234 (36.1%), 18.4 MBs/sec
2026-11-20T13:43:23.8534487Z Sent 54394880 of 90560351 (60.1%), 25.9 MBs/sec
2026-11-20T13:43:24.4108503Z Sent 53347234 of 53347234 (100.0%), 26.3 MBs/sec
2026-11-20T13:43:24.6639966Z Saved cache entry with key gradle-transforms-v1-548297aae9fe6a46f120779675d1eb32 from /home/runner/.gradle/caches/transforms-4/*/,/home/runner/.gradle/caches/*/transforms/*/ in 3374ms
2026-11-20T13:43:24.9666483Z Sent 90560351 of 90560351 (100.0%), 27.7 MBs/sec
2026-11-20T13:43:25.3264566Z Saved cache entry with key gradle-dependencies-v1-870d1cf1b7f43ef1a0ad94af46ccdb5e from /home/runner/.gradle/caches/modules-*/files-*/*/*/*/* in 4317ms
2026-11-20T13:43:25.4074521Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-11-20T13:43:26.3229686Z Sent 824952 of 824952 (100.0%), 1.2 MBs/sec
2026-11-20T13:43:26.5672093Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-d0bb990d2408794517bc72255ea22fb0f25096ec from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 1175ms
2026-11-20T13:43:26.5693888Z ##[endgroup]
2026-11-20T13:43:26.5695079Z Generating Job Summary
2026-11-20T13:43:26.5710188Z Completed post-action step
﻿2026-11-20T13:43:26.5978805Z Post job cleanup.
2026-11-20T13:43:26.7436984Z (node:3544) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-11-20T13:43:26.7438117Z (Use `node --trace-deprecation ...` to show where the warning was created)
﻿2026-11-20T13:43:26.7694223Z Post job cleanup.
2026-11-20T13:43:26.8643600Z [command]/usr/bin/git version
2026-11-20T13:43:26.8689571Z git version 2.56.1
2026-11-20T13:43:26.8735078Z Temporarily overriding HOME='/home/runner/work/_temp/02608a0d-e14b-4db2-b825-e7a2bb21ccef' before making global git config changes
2026-11-20T13:43:26.8736450Z Adding repository directory to the temporary git global config as a safe directory
2026-11-20T13:43:26.8741872Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-11-20T13:43:26.8793852Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-11-20T13:43:26.8838067Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-11-20T13:43:26.9174604Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-11-20T13:43:26.9211619Z http.https://github.com/.extraheader
2026-11-20T13:43:26.9225198Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-11-20T13:43:26.9269586Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-11-20T13:43:26.9589938Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-11-20T13:43:26.9627724Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
﻿2026-11-20T13:43:27.0094693Z Cleaning up orphan processes
2026-11-20T13:43:27.0491770Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
```

## Run ID: 38040806651

```text
29:2026-10-10T09:16:31.4623738Z Prepare all required actions
149:2026-10-10T09:16:36.1584179Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
151:2026-10-10T09:16:36.1584890Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
154:2026-10-10T09:16:36.1585795Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
190:2026-10-10T09:16:36.2516433Z   dependency-graph-continue-on-failure: true
348:2026-10-10T09:17:05.0889849Z (node:2578) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
414:2026-10-10T09:17:16.3413667Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
```

### Tail of logs

```text
2026-10-10T09:17:20.6405571Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleaned up in 0.0 secs.
2026-10-10T09:17:20.6406503Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) removing files not accessed on or after Sat Oct 10 09:16:36 UTC 2026.
2026-10-10T09:17:20.6408272Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6409909Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleaned up in 0.0 secs.
2026-10-10T09:17:20.6412360Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6432607Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6434142Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Sat Oct 10 09:16:36 UTC 2026.
2026-10-10T09:17:20.6435491Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6436703Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6437989Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Sat Oct 10 09:16:36 UTC 2026.
2026-10-10T09:17:20.6664414Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6694254Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6696054Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T09:17:20.6697252Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.042 secs.
2026-10-10T09:17:20.7563578Z ##[endgroup]
2026-10-10T09:17:20.7564267Z ##[group]Caching Gradle state
2026-10-10T09:17:20.9269333Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T09:17:20.9713112Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T09:17:21.7741611Z Sent 99388 of 99388 (100.0%), 0.3 MBs/sec
2026-10-10T09:17:21.8154617Z Sent 169796 of 169796 (100.0%), 0.4 MBs/sec
2026-10-10T09:17:22.0116334Z Saved cache entry with key gradle-instrumented-jars-v1-bfbefa0ecb674d9d23d4feb204418056 from /home/runner/.gradle/caches/jars-*/*/ in 1110ms
2026-10-10T09:17:22.0284679Z Saved cache entry with key gradle-groovy-dsl-v1-dc0341e07b896e7a9909d94e12d847d3 from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 1093ms
2026-10-10T09:17:22.0878111Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T09:17:22.8223757Z Sent 870989 of 870989 (100.0%), 1.7 MBs/sec
2026-10-10T09:17:23.0262339Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-529eb2b3d3dba51f665a1117e471550d63a284aa from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 949ms
2026-10-10T09:17:23.0264354Z ##[endgroup]
2026-10-10T09:17:23.0270575Z Generating Job Summary
2026-10-10T09:17:23.0283718Z Completed post-action step
2026-10-10T09:17:23.0508477Z Post job cleanup.
2026-10-10T09:17:23.1868684Z (node:2822) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-10T09:17:23.1869786Z (Use `node --trace-deprecation ...` to show where the warning was created)
2026-10-10T09:17:23.2095218Z Post job cleanup.
2026-10-10T09:17:23.3075940Z [command]/usr/bin/git version
2026-10-10T09:17:23.3122620Z git version 2.55.0
2026-10-10T09:17:23.3168921Z Temporarily overriding HOME='/home/runner/work/_temp/ba1f453d-73cd-4db5-b045-b5b00ed826b9' before making global git config changes
2026-10-10T09:17:23.3170781Z Adding repository directory to the temporary git global config as a safe directory
2026-10-10T09:17:23.3175915Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-10T09:17:23.3219610Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-10T09:17:23.3257683Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-10T09:17:23.3511042Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-10T09:17:23.3545121Z http.https://github.com/.extraheader
2026-10-10T09:17:23.3557067Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-10T09:17:23.3592678Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-10T09:17:23.3858014Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-10T09:17:23.3897104Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
2026-10-10T09:17:23.4313416Z Cleaning up orphan processes
2026-10-10T09:17:23.4606158Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
2026-10-10T09:16:29.1680000Z Requested labels: ubuntu-latest
2026-10-10T09:16:29.1680000Z Job defined at: ddogy1212/iloveyounaye/.github/workflows/build-apk.yml@refs/heads/main
2026-10-10T09:16:29.1680000Z Waiting for a runner to pick up this job...
2026-10-10T09:16:29.1670000Z Evaluating apk.if
2026-10-10T09:16:29.1670000Z Evaluating: success()
2026-10-10T09:16:29.1670000Z Result: true
2026-10-10T09:16:29.1690000Z Job is waiting for a hosted runner to come online.
2026-10-10T09:16:29.1700000Z Job is about to start running on the hosted runner: GitHub Actions 1000001022
```
