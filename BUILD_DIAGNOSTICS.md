# APK build error report

37926217878	completed	success
37926113217	completed	failure
37925726640	completed	failure

## Run ID: 37926217878

```text
29:2026-10-09T11:50:37.2448018Z Prepare all required actions
149:2026-10-09T11:50:42.1822422Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
151:2026-10-09T11:50:42.1823553Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
154:2026-10-09T11:50:42.1824755Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
190:2026-10-09T11:50:42.2416859Z   dependency-graph-continue-on-failure: true
206:2026-10-09T11:50:45.6395977Z Gradle User Home cache not found. Will initialize empty.
212:2026-10-09T11:50:59.6877059Z Gradle distribution 8.9 not found in cache. Will download.
241:2026-10-09T11:51:04.8442641Z  - Enhanced Error and Warning Messages
325:2026-10-09T11:51:54.1339629Z (node:2758) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
373:2026-10-09T11:52:01.3790244Z Gradle distribution 8.11 not found in cache. Will download.
392:2026-10-09T11:52:06.6017481Z  - Java compilation errors at the end of the build output
398:2026-10-09T11:52:06.7035202Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
565:2026-10-09T11:50:37.2447974Z Prepare all required actions
685:2026-10-09T11:50:42.1822419Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
687:2026-10-09T11:50:42.1823402Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
690:2026-10-09T11:50:42.1824751Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
726:2026-10-09T11:50:42.2416819Z   dependency-graph-continue-on-failure: true
742:2026-10-09T11:50:45.6395911Z Gradle User Home cache not found. Will initialize empty.
748:2026-10-09T11:50:59.6877003Z Gradle distribution 8.9 not found in cache. Will download.
777:2026-10-09T11:51:04.8442636Z  - Enhanced Error and Warning Messages
861:2026-10-09T11:51:54.1339534Z (node:2758) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
909:2026-10-09T11:52:01.3790199Z Gradle distribution 8.11 not found in cache. Will download.
928:2026-10-09T11:52:06.6017473Z  - Java compilation errors at the end of the build output
934:2026-10-09T11:52:06.7034685Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
```

### Tail of logs

```text
2026-10-09T11:52:12.8170929Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 0 files/directories.
2026-10-09T11:52:12.8172333Z jars (/home/runner/.gradle/caches/jars-9) removing files not accessed on or after Fri Oct 09 11:50:45 UTC 2026.
2026-10-09T11:52:12.8200957Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 0 files/directories.
2026-10-09T11:52:12.8210897Z jars (/home/runner/.gradle/caches/jars-9) cleaned up in 0.009 secs.
2026-10-09T11:52:12.8230412Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-09T11:52:12.8263073Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-09T11:52:12.8309469Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Fri Oct 09 11:50:45 UTC 2026.
2026-10-09T11:52:12.8312200Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-09T11:52:12.8343222Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-09T11:52:12.8361811Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Fri Oct 09 11:50:45 UTC 2026.
2026-10-09T11:52:12.8707058Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-09T11:52:12.8732136Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-10-09T11:52:12.8733841Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-09T11:52:12.8735115Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.066 secs.
2026-10-09T11:52:12.9649018Z ##[endgroup]
2026-10-09T11:52:12.9650062Z ##[group]Caching Gradle state
2026-10-09T11:52:13.1202066Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T11:52:13.1521638Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T11:52:13.2841507Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T11:52:13.5544142Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T11:52:13.7061231Z Sent 161247 of 161247 (100.0%), 0.4 MBs/sec
2026-10-09T11:52:13.7087474Z Sent 100289 of 100289 (100.0%), 0.3 MBs/sec
2026-10-09T11:52:13.9207292Z Saved cache entry with key gradle-instrumented-jars-v1-bbc6e71b897b09dfadc6b2949a588b44 from /home/runner/.gradle/caches/jars-*/*/ in 820ms
2026-10-09T11:52:13.9451715Z Saved cache entry with key gradle-groovy-dsl-v1-11bfb4b6be52d10d04542b89e0184ac9 from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 825ms
2026-10-09T11:52:14.9071139Z Sent 33030144 of 90559706 (36.5%), 31.5 MBs/sec
2026-10-09T11:52:15.3552833Z Sent 53356498 of 53356498 (100.0%), 50.9 MBs/sec
2026-10-09T11:52:15.7162044Z Saved cache entry with key gradle-transforms-v1-8f89919c4729f54bb880bdaae63f5c56 from /home/runner/.gradle/caches/transforms-4/*/,/home/runner/.gradle/caches/*/transforms/*/ in 2400ms
2026-10-09T11:52:16.0685127Z Sent 77398016 of 90559706 (85.5%), 34.1 MBs/sec
2026-10-09T11:52:16.3626161Z Sent 90559706 of 90559706 (100.0%), 35.1 MBs/sec
2026-10-09T11:52:16.5903286Z Saved cache entry with key gradle-dependencies-v1-870d1cf1b7f43ef1a0ad94af46ccdb5e from /home/runner/.gradle/caches/modules-*/files-*/*/*/*/* in 3505ms
2026-10-09T11:52:16.6715690Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-09T11:52:17.4110304Z Sent 820778 of 820778 (100.0%), 1.6 MBs/sec
2026-10-09T11:52:17.6432957Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-5af2be1f0a423f5edd2621e8a0a1ec1dea795374 from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 985ms
2026-10-09T11:52:17.6434764Z ##[endgroup]
2026-10-09T11:52:17.6441667Z Generating Job Summary
2026-10-09T11:52:17.6453754Z Completed post-action step
﻿2026-10-09T11:52:17.6654537Z Post job cleanup.
2026-10-09T11:52:17.8008651Z (node:3023) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-09T11:52:17.8010033Z (Use `node --trace-deprecation ...` to show where the warning was created)
﻿2026-10-09T11:52:17.8149407Z Post job cleanup.
2026-10-09T11:52:17.9021768Z [command]/usr/bin/git version
2026-10-09T11:52:17.9060489Z git version 2.55.0
2026-10-09T11:52:17.9094268Z Temporarily overriding HOME='/home/runner/work/_temp/596e6b43-ae42-4a6f-a8ce-5bdf32a13053' before making global git config changes
2026-10-09T11:52:17.9095752Z Adding repository directory to the temporary git global config as a safe directory
2026-10-09T11:52:17.9100640Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-09T11:52:17.9140032Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-09T11:52:17.9171711Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-09T11:52:17.9390235Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-09T11:52:17.9415128Z http.https://github.com/.extraheader
2026-10-09T11:52:17.9427918Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-09T11:52:17.9461329Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-09T11:52:17.9662571Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-09T11:52:17.9701991Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
﻿2026-10-09T11:52:18.0061608Z Cleaning up orphan processes
2026-10-09T11:52:18.0305153Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
```

## Run ID: 37926113217

```text
29:2026-10-09T11:49:35.8216213Z Prepare all required actions
140:2026-10-09T11:49:39.8578881Z ##[group]Run sdkmanager 'platforms;android-35' 'build-tools;35.0.0'
141:2026-10-09T11:49:39.8579448Z [36;1msdkmanager 'platforms;android-35' 'build-tools;35.0.0'[0m
147:2026-10-09T11:49:39.8914567Z /home/runner/work/_temp/eb723003-a7b2-4f31-b21b-6f516f1708f0.sh: line 1: sdkmanager: command not found
148:2026-10-09T11:49:39.8921389Z ##[error]Process completed with exit code 127.
203:2026-10-09T11:49:35.8216197Z Prepare all required actions
314:﻿2026-10-09T11:49:39.8578826Z ##[group]Run sdkmanager 'platforms;android-35' 'build-tools;35.0.0'
315:2026-10-09T11:49:39.8579444Z [36;1msdkmanager 'platforms;android-35' 'build-tools;35.0.0'[0m
321:2026-10-09T11:49:39.8914537Z /home/runner/work/_temp/eb723003-a7b2-4f31-b21b-6f516f1708f0.sh: line 1: sdkmanager: command not found
322:2026-10-09T11:49:39.8921372Z ##[error]Process completed with exit code 127.
```

### Tail of logs

```text
2026-10-09T11:49:39.7101055Z   java-version: 17
2026-10-09T11:49:39.7101174Z   java-package: jdk
2026-10-09T11:49:39.7101294Z   check-latest: false
2026-10-09T11:49:39.7101413Z   server-id: github
2026-10-09T11:49:39.7101536Z   server-username: GITHUB_ACTOR
2026-10-09T11:49:39.7101685Z   server-password: GITHUB_TOKEN
2026-10-09T11:49:39.7101835Z   overwrite-settings: true
2026-10-09T11:49:39.7101972Z   job-status: success
2026-10-09T11:49:39.7103573Z   token: ***
2026-10-09T11:49:39.7103696Z ##[endgroup]
2026-10-09T11:49:39.8233380Z ##[warning]setup-java v4 is deprecated and will no longer receive updates. Please migrate to actions/setup-java@v5.
2026-10-09T11:49:39.8240080Z ##[group]Installed distributions
2026-10-09T11:49:39.8263783Z Resolved Java 17.0.20+1 from tool-cache
2026-10-09T11:49:39.8264109Z Setting Java 17.0.20+1 as the default
2026-10-09T11:49:39.8270565Z (node:2084) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-09T11:49:39.8271190Z (Use `node --trace-deprecation ...` to show where the warning was created)
2026-10-09T11:49:39.8272805Z Creating toolchains.xml for JDK version 17 from temurin
2026-10-09T11:49:39.8332826Z Writing to /home/runner/.m2/toolchains.xml
2026-10-09T11:49:39.8333275Z 
2026-10-09T11:49:39.8333366Z Java configuration:
2026-10-09T11:49:39.8333594Z   Distribution: temurin
2026-10-09T11:49:39.8333844Z   Version: 17.0.20+1
2026-10-09T11:49:39.8334140Z   Path: /opt/hostedtoolcache/Java_Temurin-Hotspot_jdk/17.0.20-1/x64
2026-10-09T11:49:39.8334346Z 
2026-10-09T11:49:39.8334668Z ##[endgroup]
2026-10-09T11:49:39.8345313Z Creating settings.xml with server-id: github
2026-10-09T11:49:39.8404321Z Writing to /home/runner/.m2/settings.xml
﻿2026-10-09T11:49:39.8578826Z ##[group]Run sdkmanager 'platforms;android-35' 'build-tools;35.0.0'
2026-10-09T11:49:39.8579444Z [36;1msdkmanager 'platforms;android-35' 'build-tools;35.0.0'[0m
2026-10-09T11:49:39.8820242Z shell: /usr/bin/bash -e {0}
2026-10-09T11:49:39.8820689Z env:
2026-10-09T11:49:39.8820893Z   JAVA_HOME: /opt/hostedtoolcache/Java_Temurin-Hotspot_jdk/17.0.20-1/x64
2026-10-09T11:49:39.8821186Z   JAVA_HOME_17_X64: /opt/hostedtoolcache/Java_Temurin-Hotspot_jdk/17.0.20-1/x64
2026-10-09T11:49:39.8821403Z ##[endgroup]
2026-10-09T11:49:39.8914537Z /home/runner/work/_temp/eb723003-a7b2-4f31-b21b-6f516f1708f0.sh: line 1: sdkmanager: command not found
2026-10-09T11:49:39.8921372Z ##[error]Process completed with exit code 127.
﻿2026-10-09T11:49:39.9002502Z Post job cleanup.
2026-10-09T11:49:39.9897348Z (node:2101) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-09T11:49:39.9898117Z (Use `node --trace-deprecation ...` to show where the warning was created)
﻿2026-10-09T11:49:40.0077094Z Post job cleanup.
2026-10-09T11:49:40.0686866Z [command]/usr/bin/git version
2026-10-09T11:49:40.0719153Z git version 2.55.0
2026-10-09T11:49:40.0743036Z Temporarily overriding HOME='/home/runner/work/_temp/52ff4606-1741-4a34-a8b1-4a8f2acc3a6d' before making global git config changes
2026-10-09T11:49:40.0743810Z Adding repository directory to the temporary git global config as a safe directory
2026-10-09T11:49:40.0746939Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-09T11:49:40.0780670Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-09T11:49:40.0808293Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-09T11:49:40.1010191Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-09T11:49:40.1041419Z http.https://github.com/.extraheader
2026-10-09T11:49:40.1046155Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-09T11:49:40.1079633Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-09T11:49:40.1276952Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-09T11:49:40.1307888Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
﻿2026-10-09T11:49:40.1596213Z Cleaning up orphan processes
2026-10-09T11:49:40.1782591Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4. For more information see: https://github.blog/changelog/2025-09-19-deprecation-of-node-20-on-github-actions
```

## Run ID: 37925726640

```text
29:2026-10-09T11:45:47.4092220Z Prepare all required actions
140:2026-10-09T11:45:51.2311920Z ##[group]Run sdkmanager 'platforms;android-35' 'build-tools;35.0.0'
141:2026-10-09T11:45:51.2313049Z [36;1msdkmanager 'platforms;android-35' 'build-tools;35.0.0'[0m
147:2026-10-09T11:45:51.2753667Z /home/runner/work/_temp/3f0fb417-a400-4b72-9212-3a263e145320.sh: line 1: sdkmanager: command not found
148:2026-10-09T11:45:51.2762207Z ##[error]Process completed with exit code 127.
203:2026-10-09T11:45:47.4092166Z Prepare all required actions
314:﻿2026-10-09T11:45:51.2311866Z ##[group]Run sdkmanager 'platforms;android-35' 'build-tools;35.0.0'
315:2026-10-09T11:45:51.2313030Z [36;1msdkmanager 'platforms;android-35' 'build-tools;35.0.0'[0m
321:2026-10-09T11:45:51.2753628Z /home/runner/work/_temp/3f0fb417-a400-4b72-9212-3a263e145320.sh: line 1: sdkmanager: command not found
322:2026-10-09T11:45:51.2762182Z ##[error]Process completed with exit code 127.
```

### Tail of logs

```text
2026-10-09T11:45:50.9965194Z   java-version: 17
2026-10-09T11:45:50.9965471Z   java-package: jdk
2026-10-09T11:45:50.9965743Z   check-latest: false
2026-10-09T11:45:50.9966026Z   server-id: github
2026-10-09T11:45:50.9966303Z   server-username: GITHUB_ACTOR
2026-10-09T11:45:50.9966633Z   server-password: GITHUB_TOKEN
2026-10-09T11:45:50.9966948Z   overwrite-settings: true
2026-10-09T11:45:50.9967256Z   job-status: success
2026-10-09T11:45:50.9970107Z   token: ***
2026-10-09T11:45:50.9970376Z ##[endgroup]
2026-10-09T11:45:51.1762633Z ##[warning]setup-java v4 is deprecated and will no longer receive updates. Please migrate to actions/setup-java@v5.
2026-10-09T11:45:51.1770414Z ##[group]Installed distributions
2026-10-09T11:45:51.1958286Z Resolved Java 17.0.20+1 from tool-cache
2026-10-09T11:45:51.1959174Z Setting Java 17.0.20+1 as the default
2026-10-09T11:45:51.1971002Z (node:2305) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-09T11:45:51.1973031Z (Use `node --trace-deprecation ...` to show where the warning was created)
2026-10-09T11:45:51.1975769Z Creating toolchains.xml for JDK version 17 from temurin
2026-10-09T11:45:51.2056751Z Writing to /home/runner/.m2/toolchains.xml
2026-10-09T11:45:51.2057472Z 
2026-10-09T11:45:51.2057793Z Java configuration:
2026-10-09T11:45:51.2058430Z   Distribution: temurin
2026-10-09T11:45:51.2058864Z   Version: 17.0.20+1
2026-10-09T11:45:51.2059343Z   Path: /opt/hostedtoolcache/Java_Temurin-Hotspot_jdk/17.0.20-1/x64
2026-10-09T11:45:51.2059739Z 
2026-10-09T11:45:51.2060281Z ##[endgroup]
2026-10-09T11:45:51.2078605Z Creating settings.xml with server-id: github
2026-10-09T11:45:51.2110862Z Writing to /home/runner/.m2/settings.xml
﻿2026-10-09T11:45:51.2311866Z ##[group]Run sdkmanager 'platforms;android-35' 'build-tools;35.0.0'
2026-10-09T11:45:51.2313030Z [36;1msdkmanager 'platforms;android-35' 'build-tools;35.0.0'[0m
2026-10-09T11:45:51.2631953Z shell: /usr/bin/bash -e {0}
2026-10-09T11:45:51.2632684Z env:
2026-10-09T11:45:51.2633176Z   JAVA_HOME: /opt/hostedtoolcache/Java_Temurin-Hotspot_jdk/17.0.20-1/x64
2026-10-09T11:45:51.2633924Z   JAVA_HOME_17_X64: /opt/hostedtoolcache/Java_Temurin-Hotspot_jdk/17.0.20-1/x64
2026-10-09T11:45:51.2634503Z ##[endgroup]
2026-10-09T11:45:51.2753628Z /home/runner/work/_temp/3f0fb417-a400-4b72-9212-3a263e145320.sh: line 1: sdkmanager: command not found
2026-10-09T11:45:51.2762182Z ##[error]Process completed with exit code 127.
﻿2026-10-09T11:45:51.2909250Z Post job cleanup.
2026-10-09T11:45:51.4349663Z (node:2320) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-09T11:45:51.4351521Z (Use `node --trace-deprecation ...` to show where the warning was created)
﻿2026-10-09T11:45:51.4616041Z Post job cleanup.
2026-10-09T11:45:51.5635065Z [command]/usr/bin/git version
2026-10-09T11:45:51.5681735Z git version 2.55.0
2026-10-09T11:45:51.5724471Z Temporarily overriding HOME='/home/runner/work/_temp/f3368fd9-247b-41ba-b42c-7970f066433a' before making global git config changes
2026-10-09T11:45:51.5725985Z Adding repository directory to the temporary git global config as a safe directory
2026-10-09T11:45:51.5733714Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-09T11:45:51.5784484Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-09T11:45:51.5836918Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-09T11:45:51.6129064Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-09T11:45:51.6161564Z http.https://github.com/.extraheader
2026-10-09T11:45:51.6176782Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-09T11:45:51.6257460Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-09T11:45:51.6594246Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-09T11:45:51.6638176Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
﻿2026-10-09T11:45:51.7161535Z Cleaning up orphan processes
2026-10-09T11:45:51.7494726Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4. For more information see: https://github.blog/changelog/2025-09-19-deprecation-of-node-20-on-github-actions
```
