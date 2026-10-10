# APK build error report

38035852067	completed	success
37933929937	completed	success
37932757221	completed	success

## Run ID: 38035852067

```text
29:2026-10-10T07:51:20.1312491Z Prepare all required actions
149:2026-10-10T07:51:23.1272761Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
151:2026-10-10T07:51:23.1273563Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
154:2026-10-10T07:51:23.1274914Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
190:2026-10-10T07:51:23.2486413Z   dependency-graph-continue-on-failure: true
349:2026-10-10T07:51:55.3364323Z (node:2583) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
415:2026-10-10T07:52:07.2273863Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
548:2026-10-10T07:51:20.1312469Z Prepare all required actions
668:2026-10-10T07:51:23.1272757Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
670:2026-10-10T07:51:23.1273529Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
673:2026-10-10T07:51:23.1274906Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
709:2026-10-10T07:51:23.2486410Z   dependency-graph-continue-on-failure: true
868:2026-10-10T07:51:55.3364273Z (node:2583) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
934:2026-10-10T07:52:07.2273793Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
```

### Tail of logs

```text
2026-10-10T07:52:11.4360950Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleanup deleted 2 files/directories.
2026-10-10T07:52:11.4362418Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleaned up in 0.011 secs.
2026-10-10T07:52:11.4364288Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 0 files/directories.
2026-10-10T07:52:11.4366073Z jars (/home/runner/.gradle/caches/jars-9) removing files not accessed on or after Sat Oct 10 07:51:24 UTC 2026.
2026-10-10T07:52:11.4367175Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 3 files/directories.
2026-10-10T07:52:11.4368041Z jars (/home/runner/.gradle/caches/jars-9) cleaned up in 0.012 secs.
2026-10-10T07:52:11.4369285Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) removing files not accessed on or after Sat Oct 10 07:51:24 UTC 2026.
2026-10-10T07:52:11.4370853Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleanup deleted 0 files/directories.
2026-10-10T07:52:11.4372045Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleaned up in 0.0 secs.
2026-10-10T07:52:11.4372965Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) removing files not accessed on or after Sat Oct 10 07:51:24 UTC 2026.
2026-10-10T07:52:11.4373995Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleanup deleted 0 files/directories.
2026-10-10T07:52:11.4375332Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleaned up in 0.0 secs.
2026-10-10T07:52:11.4376267Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T07:52:11.4377150Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T07:52:11.4378346Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Sat Oct 10 07:51:24 UTC 2026.
2026-10-10T07:52:11.4379550Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T07:52:11.4380618Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T07:52:11.4381772Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Sat Oct 10 07:51:24 UTC 2026.
2026-10-10T07:52:11.4382955Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T07:52:11.4384008Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-10-10T07:52:11.4385258Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T07:52:11.4385948Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.037 secs.
2026-10-10T07:52:11.5841662Z ##[endgroup]
2026-10-10T07:52:11.5842571Z ##[group]Caching Gradle state
2026-10-10T07:52:11.7588931Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T07:52:11.7972102Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T07:52:12.7371401Z Sent 99707 of 99707 (100.0%), 0.2 MBs/sec
2026-10-10T07:52:12.7893798Z Sent 165148 of 165148 (100.0%), 0.3 MBs/sec
2026-10-10T07:52:13.0130157Z Saved cache entry with key gradle-instrumented-jars-v1-097f066d7e57f12e8479aff9ecbad472 from /home/runner/.gradle/caches/jars-*/*/ in 1279ms
2026-10-10T07:52:13.0382218Z Saved cache entry with key gradle-groovy-dsl-v1-c89ad4d53713ce44a37f6181bf25661a from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 1274ms
2026-10-10T07:52:13.0921512Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T07:52:13.9935916Z Sent 864161 of 864161 (100.0%), 1.3 MBs/sec
2026-10-10T07:52:14.2489970Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-7643a18a6d05c6e83e51a16750346e73524a0495 from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 1167ms
2026-10-10T07:52:14.2491984Z ##[endgroup]
2026-10-10T07:52:14.2497732Z Generating Job Summary
2026-10-10T07:52:14.2510486Z Completed post-action step
﻿2026-10-10T07:52:14.2763636Z Post job cleanup.
2026-10-10T07:52:14.4082638Z (node:2824) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-10T07:52:14.4083651Z (Use `node --trace-deprecation ...` to show where the warning was created)
﻿2026-10-10T07:52:14.4284306Z Post job cleanup.
2026-10-10T07:52:14.5152659Z [command]/usr/bin/git version
2026-10-10T07:52:14.5197197Z git version 2.55.0
2026-10-10T07:52:14.5233972Z Temporarily overriding HOME='/home/runner/work/_temp/6ad813fc-568f-44fe-9335-e7b3f4563efe' before making global git config changes
2026-10-10T07:52:14.5236046Z Adding repository directory to the temporary git global config as a safe directory
2026-10-10T07:52:14.5240123Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-10T07:52:14.5285779Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-10T07:52:14.5313436Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-10T07:52:14.5561395Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-10T07:52:14.5587961Z http.https://github.com/.extraheader
2026-10-10T07:52:14.5601055Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-10T07:52:14.5638942Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-10T07:52:14.5909306Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-10T07:52:14.5949446Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
﻿2026-10-10T07:52:14.6387426Z Cleaning up orphan processes
2026-10-10T07:52:14.6707353Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
```

## Run ID: 37933929937

```text
29:2026-10-09T13:01:26.3961076Z Prepare all required actions
149:2026-10-09T13:01:30.5973082Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
151:2026-10-09T13:01:30.5973812Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
154:2026-10-09T13:01:30.5974747Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
190:2026-10-09T13:01:30.6940659Z   dependency-graph-continue-on-failure: true
348:2026-10-09T13:02:03.5293324Z (node:2547) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
413:2026-10-09T13:02:13.8873733Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
```

### Tail of logs

```text
2026-10-09T13:02:18.6840610Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleaned up in 0.0 secs.
2026-10-09T13:02:18.6842404Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) removing files not accessed on or after Fri Oct 09 13:01:32 UTC 2026.
2026-10-09T13:02:18.6844287Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6846086Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleaned up in 0.0 secs.
2026-10-09T13:02:18.6847672Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6849429Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6851805Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Fri Oct 09 13:01:32 UTC 2026.
2026-10-09T13:02:18.6854108Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6856935Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6859241Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Fri Oct 09 13:01:32 UTC 2026.
2026-10-09T13:02:18.6861424Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6863436Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6865392Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-09T13:02:18.6866572Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.031 secs.
2026-10-09T13:02:18.7601098Z ##[endgroup]
2026-10-09T13:02:18.7601652Z ##[group]Caching Gradle state
2026-10-09T13:02:18.9400545Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T13:02:18.9834484Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T13:02:19.7869494Z Sent 99634 of 99634 (100.0%), 0.4 MBs/sec
2026-10-09T13:02:19.8200326Z Sent 162781 of 162781 (100.0%), 0.6 MBs/sec
2026-10-09T13:02:19.9773005Z Saved cache entry with key gradle-instrumented-jars-v1-1b8dbcc50017c037f5bddec2313a3d20 from /home/runner/.gradle/caches/jars-*/*/ in 1064ms
2026-10-09T13:02:20.0070584Z Saved cache entry with key gradle-groovy-dsl-v1-7431745c1d49acef815cbd7928a26a25 from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 1059ms
2026-10-09T13:02:20.0812461Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T13:02:20.5877474Z Sent 863291 of 863291 (100.0%), 2.7 MBs/sec
2026-10-09T13:02:20.7540853Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-83b43dc0b0ff58f555880e4c2fe3953e5f92c89d from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 686ms
2026-10-09T13:02:20.7542478Z ##[endgroup]
2026-10-09T13:02:20.7549727Z Generating Job Summary
2026-10-09T13:02:20.7563154Z Completed post-action step
2026-10-09T13:02:20.7809680Z Post job cleanup.
2026-10-09T13:02:20.9219526Z (node:2787) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-09T13:02:20.9220528Z (Use `node --trace-deprecation ...` to show where the warning was created)
2026-10-09T13:02:20.9403392Z Post job cleanup.
2026-10-09T13:02:21.0381730Z [command]/usr/bin/git version
2026-10-09T13:02:21.0432685Z git version 2.55.0
2026-10-09T13:02:21.0506617Z Temporarily overriding HOME='/home/runner/work/_temp/1bbca2fa-45bf-4d92-a94d-2ff79907393a' before making global git config changes
2026-10-09T13:02:21.0508172Z Adding repository directory to the temporary git global config as a safe directory
2026-10-09T13:02:21.0513549Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-09T13:02:21.0561515Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-09T13:02:21.0604040Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-09T13:02:21.0881038Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-09T13:02:21.0915780Z http.https://github.com/.extraheader
2026-10-09T13:02:21.0935028Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-09T13:02:21.0970444Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-09T13:02:21.1231965Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-09T13:02:21.1280681Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
2026-10-09T13:02:21.1701413Z Cleaning up orphan processes
2026-10-09T13:02:21.2000485Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
2026-10-09T13:01:23.7670000Z Evaluating apk.if
2026-10-09T13:01:23.7670000Z Evaluating: success()
2026-10-09T13:01:23.7670000Z Result: true
2026-10-09T13:01:23.9360000Z Job is waiting for a hosted runner to come online.
2026-10-09T13:01:23.9350000Z Job is about to start running on the hosted runner: GitHub Actions 1000000966
2026-10-09T13:01:23.9340000Z Requested labels: ubuntu-latest
2026-10-09T13:01:23.9340000Z Job defined at: ddogy1212/iloveyounaye/.github/workflows/build-apk.yml@refs/heads/main
2026-10-09T13:01:23.9340000Z Waiting for a runner to pick up this job...
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
```

### Tail of logs

```text
2026-10-09T12:51:49.7488862Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleaned up in 0.0 secs.
2026-10-09T12:51:49.7490615Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) removing files not accessed on or after Fri Oct 09 12:51:09 UTC 2026.
2026-10-09T12:51:49.7492692Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7494327Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleaned up in 0.0 secs.
2026-10-09T12:51:49.7495760Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7497483Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7499743Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Fri Oct 09 12:51:09 UTC 2026.
2026-10-09T12:51:49.7502005Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7504327Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7506565Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Fri Oct 09 12:51:09 UTC 2026.
2026-10-09T12:51:49.7766524Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7783931Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7793850Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-09T12:51:49.7803903Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.045 secs.
2026-10-09T12:51:49.8966577Z ##[endgroup]
2026-10-09T12:51:49.8967104Z ##[group]Caching Gradle state
2026-10-09T12:51:50.0787865Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T12:51:50.1165099Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T12:51:50.2276943Z Sent 99467 of 99467 (100.0%), 2.4 MBs/sec
2026-10-09T12:51:50.2397524Z Sent 161693 of 161693 (100.0%), 5.7 MBs/sec
2026-10-09T12:51:50.6037789Z Saved cache entry with key gradle-instrumented-jars-v1-77cb8bc0ad538db4f3d8a0a8af81655c from /home/runner/.gradle/caches/jars-*/*/ in 550ms
2026-10-09T12:51:50.6217448Z Saved cache entry with key gradle-groovy-dsl-v1-6ecc6e1b0dac4630a57806bc98af82c7 from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 537ms
2026-10-09T12:51:50.6703110Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T12:51:50.8165382Z Sent 861276 of 861276 (100.0%), 17.5 MBs/sec
2026-10-09T12:51:50.9051462Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-db98aca526444bd5883a0799a63f5f8242a780cd from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 245ms
2026-10-09T12:51:50.9053483Z ##[endgroup]
2026-10-09T12:51:50.9059082Z Generating Job Summary
2026-10-09T12:51:50.9072717Z Completed post-action step
2026-10-09T12:51:50.9307335Z Post job cleanup.
2026-10-09T12:51:51.0646260Z (node:2835) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-09T12:51:51.0647469Z (Use `node --trace-deprecation ...` to show where the warning was created)
2026-10-09T12:51:51.0869563Z Post job cleanup.
2026-10-09T12:51:51.1782142Z [command]/usr/bin/git version
2026-10-09T12:51:51.1828591Z git version 2.55.0
2026-10-09T12:51:51.1872463Z Temporarily overriding HOME='/home/runner/work/_temp/423753e4-1f6b-4b6b-ab21-f9a8a6046445' before making global git config changes
2026-10-09T12:51:51.1874054Z Adding repository directory to the temporary git global config as a safe directory
2026-10-09T12:51:51.1879608Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-09T12:51:51.1918096Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-09T12:51:51.1953834Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-09T12:51:51.2200911Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-09T12:51:51.2234794Z http.https://github.com/.extraheader
2026-10-09T12:51:51.2252901Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-09T12:51:51.2301724Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-09T12:51:51.2645719Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-09T12:51:51.2696684Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
2026-10-09T12:51:51.3150496Z Cleaning up orphan processes
2026-10-09T12:51:51.3449168Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
2026-10-09T12:51:04.3910000Z Evaluating apk.if
2026-10-09T12:51:04.3910000Z Evaluating: success()
2026-10-09T12:51:04.3910000Z Result: true
2026-10-09T12:51:04.3960000Z Job is about to start running on the hosted runner: GitHub Actions 1000000964
2026-10-09T12:51:04.3910000Z Requested labels: ubuntu-latest
2026-10-09T12:51:04.3910000Z Job defined at: ddogy1212/iloveyounaye/.github/workflows/build-apk.yml@refs/heads/main
2026-10-09T12:51:04.3910000Z Waiting for a runner to pick up this job...
2026-10-09T12:51:04.3960000Z Job is waiting for a hosted runner to come online.
```
