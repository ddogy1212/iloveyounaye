# APK build error report

37932757221	completed	success
37932221114	completed	success
37926217878	completed	success

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
