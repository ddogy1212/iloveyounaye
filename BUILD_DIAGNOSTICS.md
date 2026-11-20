# APK build error report

44746598528	completed	success
38040806651	completed	success
38039465030	completed	success

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

## Run ID: 38039465030

```text
29:2026-10-10T08:53:47.7930437Z Prepare all required actions
149:2026-10-10T08:53:53.1339803Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
151:2026-10-10T08:53:53.1340615Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
154:2026-10-10T08:53:53.1341611Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
190:2026-10-10T08:53:53.1807547Z   dependency-graph-continue-on-failure: true
348:2026-10-10T08:54:13.7478455Z (node:2352) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
413:2026-10-10T08:54:24.5306620Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
```

### Tail of logs

```text
2026-10-10T08:54:27.7290680Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleaned up in 0.0 secs.
2026-10-10T08:54:27.7292355Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) removing files not accessed on or after Sat Oct 10 08:53:53 UTC 2026.
2026-10-10T08:54:27.7294467Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7295813Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleaned up in 0.0 secs.
2026-10-10T08:54:27.7297397Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7298818Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7300626Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Sat Oct 10 08:53:53 UTC 2026.
2026-10-10T08:54:27.7302608Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7304269Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7306078Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Sat Oct 10 08:53:53 UTC 2026.
2026-10-10T08:54:27.7307816Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7309544Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7310986Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T08:54:27.7312049Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.029 secs.
2026-10-10T08:54:27.7967992Z ##[endgroup]
2026-10-10T08:54:27.7969357Z ##[group]Caching Gradle state
2026-10-10T08:54:27.9291319Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:54:27.9555631Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:54:28.7610829Z Sent 98890 of 98890 (100.0%), 0.3 MBs/sec
2026-10-10T08:54:28.7715700Z Sent 167353 of 167353 (100.0%), 0.4 MBs/sec
2026-10-10T08:54:28.9749550Z Saved cache entry with key gradle-instrumented-jars-v1-845c103436a6d9ff36ac3b7c9205b599 from /home/runner/.gradle/caches/jars-*/*/ in 1068ms
2026-10-10T08:54:29.0282815Z Saved cache entry with key gradle-groovy-dsl-v1-dfe65cdb668e7e7c0226520e2f9bee13 from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 1096ms
2026-10-10T08:54:29.0952398Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:54:29.5694637Z Sent 865551 of 865551 (100.0%), 3.4 MBs/sec
2026-10-10T08:54:29.7903396Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-22cc37688fb34a2509f7b907f4bebc699f9dfdce from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 704ms
2026-10-10T08:54:29.7904621Z ##[endgroup]
2026-10-10T08:54:29.7909782Z Generating Job Summary
2026-10-10T08:54:29.7920298Z Completed post-action step
2026-10-10T08:54:29.8083951Z Post job cleanup.
2026-10-10T08:54:29.9265527Z (node:2614) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-10T08:54:29.9266316Z (Use `node --trace-deprecation ...` to show where the warning was created)
2026-10-10T08:54:29.9415717Z Post job cleanup.
2026-10-10T08:54:30.0151872Z [command]/usr/bin/git version
2026-10-10T08:54:30.0187544Z git version 2.55.0
2026-10-10T08:54:30.0217833Z Temporarily overriding HOME='/home/runner/work/_temp/d92c130e-f76e-4530-9777-3632c066c830' before making global git config changes
2026-10-10T08:54:30.0219148Z Adding repository directory to the temporary git global config as a safe directory
2026-10-10T08:54:30.0222797Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-10T08:54:30.0251932Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-10T08:54:30.0280264Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-10T08:54:30.0476650Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-10T08:54:30.0501663Z http.https://github.com/.extraheader
2026-10-10T08:54:30.0511065Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-10T08:54:30.0542443Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-10T08:54:30.0738426Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-10T08:54:30.0767822Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
2026-10-10T08:54:30.1098194Z Cleaning up orphan processes
2026-10-10T08:54:30.1306179Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
2026-10-10T08:53:45.5580000Z Evaluating apk.if
2026-10-10T08:53:45.5580000Z Evaluating: success()
2026-10-10T08:53:45.5580000Z Result: true
2026-10-10T08:53:45.5590000Z Requested labels: ubuntu-latest
2026-10-10T08:53:45.5590000Z Job defined at: ddogy1212/iloveyounaye/.github/workflows/build-apk.yml@refs/heads/main
2026-10-10T08:53:45.5590000Z Waiting for a runner to pick up this job...
2026-10-10T08:53:45.5600000Z Job is waiting for a hosted runner to come online.
2026-10-10T08:53:45.5630000Z Job is about to start running on the hosted runner: GitHub Actions 1000001019
```
