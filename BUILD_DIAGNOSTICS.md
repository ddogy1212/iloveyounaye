# APK build error report

38038836154	completed	success
38038825488	completed	success
38038815601	completed	success

## Run ID: 38038836154

```text
29:2026-10-10T08:42:54.3558855Z Prepare all required actions
149:2026-10-10T08:42:58.9424114Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
151:2026-10-10T08:42:58.9424862Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
154:2026-10-10T08:42:58.9425812Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
190:2026-10-10T08:42:59.0022893Z   dependency-graph-continue-on-failure: true
348:2026-10-10T08:43:27.4246908Z (node:2664) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
413:2026-10-10T08:43:35.7126819Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
546:2026-10-10T08:42:54.3558813Z Prepare all required actions
666:2026-10-10T08:42:58.9424102Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
668:2026-10-10T08:42:58.9424806Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
671:2026-10-10T08:42:58.9425808Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
707:2026-10-10T08:42:59.0022889Z   dependency-graph-continue-on-failure: true
865:2026-10-10T08:43:27.4246794Z (node:2664) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
930:2026-10-10T08:43:35.7126686Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
```

### Tail of logs

```text
2026-10-10T08:43:40.2187162Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleanup deleted 2 files/directories.
2026-10-10T08:43:40.2188198Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleaned up in 0.012 secs.
2026-10-10T08:43:40.2189176Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 0 files/directories.
2026-10-10T08:43:40.2190945Z jars (/home/runner/.gradle/caches/jars-9) removing files not accessed on or after Sat Oct 10 08:42:59 UTC 2026.
2026-10-10T08:43:40.2192244Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 2 files/directories.
2026-10-10T08:43:40.2193127Z jars (/home/runner/.gradle/caches/jars-9) cleaned up in 0.009 secs.
2026-10-10T08:43:40.2194343Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) removing files not accessed on or after Sat Oct 10 08:42:59 UTC 2026.
2026-10-10T08:43:40.2195825Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleanup deleted 0 files/directories.
2026-10-10T08:43:40.2197035Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleaned up in 0.0 secs.
2026-10-10T08:43:40.2198535Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) removing files not accessed on or after Sat Oct 10 08:42:59 UTC 2026.
2026-10-10T08:43:40.2200214Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleanup deleted 0 files/directories.
2026-10-10T08:43:40.2201586Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleaned up in 0.001 secs.
2026-10-10T08:43:40.2203018Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T08:43:40.2204461Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:43:40.2206397Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Sat Oct 10 08:42:59 UTC 2026.
2026-10-10T08:43:40.2208243Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:43:40.2210001Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:43:40.2220000Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Sat Oct 10 08:42:59 UTC 2026.
2026-10-10T08:43:40.2491051Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:43:40.2498582Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-10-10T08:43:40.2500550Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T08:43:40.2501992Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.037 secs.
2026-10-10T08:43:40.3532270Z ##[endgroup]
2026-10-10T08:43:40.3532868Z ##[group]Caching Gradle state
2026-10-10T08:43:40.5046083Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:43:40.5444647Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:43:41.2880418Z Sent 99142 of 99142 (100.0%), 0.3 MBs/sec
2026-10-10T08:43:41.3700043Z Sent 166567 of 166567 (100.0%), 0.4 MBs/sec
2026-10-10T08:43:41.4733550Z Saved cache entry with key gradle-instrumented-jars-v1-285df4aff17cafafe828e6270b39ee32 from /home/runner/.gradle/caches/jars-*/*/ in 994ms
2026-10-10T08:43:41.5616298Z Saved cache entry with key gradle-groovy-dsl-v1-87ffb1e32e0973bcc7a2bb1148923bd8 from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 1049ms
2026-10-10T08:43:41.6110652Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:43:42.2845943Z Sent 865434 of 865434 (100.0%), 1.9 MBs/sec
2026-10-10T08:43:42.4779443Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-1c440aa7e89a0c1d13e554fde59a33746168f051 from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 877ms
2026-10-10T08:43:42.4780846Z ##[endgroup]
2026-10-10T08:43:42.4787486Z Generating Job Summary
2026-10-10T08:43:42.4800279Z Completed post-action step
﻿2026-10-10T08:43:42.5028446Z Post job cleanup.
2026-10-10T08:43:42.6493853Z (node:2906) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-10T08:43:42.6494778Z (Use `node --trace-deprecation ...` to show where the warning was created)
﻿2026-10-10T08:43:42.6738295Z Post job cleanup.
2026-10-10T08:43:42.7675850Z [command]/usr/bin/git version
2026-10-10T08:43:42.7722168Z git version 2.55.0
2026-10-10T08:43:42.7759651Z Temporarily overriding HOME='/home/runner/work/_temp/6302395d-ec11-49c4-be65-ec09c6cb3796' before making global git config changes
2026-10-10T08:43:42.7761100Z Adding repository directory to the temporary git global config as a safe directory
2026-10-10T08:43:42.7766865Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-10T08:43:42.7810748Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-10T08:43:42.7853159Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-10T08:43:42.8126861Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-10T08:43:42.8160167Z http.https://github.com/.extraheader
2026-10-10T08:43:42.8174111Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-10T08:43:42.8218488Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-10T08:43:42.8523241Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-10T08:43:42.8595796Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
﻿2026-10-10T08:43:42.8990601Z Cleaning up orphan processes
2026-10-10T08:43:42.9331425Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
```

## Run ID: 38038825488

```text
29:2026-10-10T08:42:43.3376017Z Prepare all required actions
149:2026-10-10T08:42:45.8386340Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
151:2026-10-10T08:42:45.8388885Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
154:2026-10-10T08:42:45.8392858Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
190:2026-10-10T08:42:45.9073440Z   dependency-graph-continue-on-failure: true
345:2026-10-10T08:43:07.3415409Z (node:2368) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
409:2026-10-10T08:43:14.8795222Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
542:2026-10-10T08:42:43.3375973Z Prepare all required actions
662:2026-10-10T08:42:45.8386335Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
664:2026-10-10T08:42:45.8388811Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
667:2026-10-10T08:42:45.8392850Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
703:2026-10-10T08:42:45.9073434Z   dependency-graph-continue-on-failure: true
858:2026-10-10T08:43:07.3415363Z (node:2368) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
922:2026-10-10T08:43:14.8795114Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
```

### Tail of logs

```text
2026-10-10T08:43:18.0808448Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleanup deleted 2 files/directories.
2026-10-10T08:43:18.0809435Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleaned up in 0.011 secs.
2026-10-10T08:43:18.0810312Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 0 files/directories.
2026-10-10T08:43:18.0811566Z jars (/home/runner/.gradle/caches/jars-9) removing files not accessed on or after Sat Oct 10 08:42:47 UTC 2026.
2026-10-10T08:43:18.0812573Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 2 files/directories.
2026-10-10T08:43:18.0813390Z jars (/home/runner/.gradle/caches/jars-9) cleaned up in 0.01 secs.
2026-10-10T08:43:18.0814448Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) removing files not accessed on or after Sat Oct 10 08:42:47 UTC 2026.
2026-10-10T08:43:18.0815740Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleanup deleted 0 files/directories.
2026-10-10T08:43:18.0816788Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleaned up in 0.0 secs.
2026-10-10T08:43:18.0817855Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) removing files not accessed on or after Sat Oct 10 08:42:47 UTC 2026.
2026-10-10T08:43:18.0819030Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleanup deleted 0 files/directories.
2026-10-10T08:43:18.0819679Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleaned up in 0.0 secs.
2026-10-10T08:43:18.0820235Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T08:43:18.0820901Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:43:18.0821783Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Sat Oct 10 08:42:47 UTC 2026.
2026-10-10T08:43:18.0822655Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:43:18.0823435Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:43:18.0824274Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Sat Oct 10 08:42:47 UTC 2026.
2026-10-10T08:43:18.1176407Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:43:18.1179098Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-10-10T08:43:18.1180628Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T08:43:18.1181704Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.029 secs.
2026-10-10T08:43:18.1979971Z ##[endgroup]
2026-10-10T08:43:18.1980536Z ##[group]Caching Gradle state
2026-10-10T08:43:18.3249338Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:43:18.3565905Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:43:18.4464095Z Sent 166519 of 166519 (100.0%), 5.7 MBs/sec
2026-10-10T08:43:18.4568839Z Sent 99132 of 99132 (100.0%), 1.6 MBs/sec
2026-10-10T08:43:18.6115644Z Saved cache entry with key gradle-groovy-dsl-v1-6ee3d61a268a92d1745d859e68fcbe8b from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 281ms
2026-10-10T08:43:18.6246819Z Saved cache entry with key gradle-instrumented-jars-v1-2102cabd77165d45395528683ca1ff73 from /home/runner/.gradle/caches/jars-*/*/ in 319ms
2026-10-10T08:43:18.6383120Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:43:18.8037252Z Sent 864097 of 864097 (100.0%), 9.5 MBs/sec
2026-10-10T08:43:18.8785351Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-a7a68530d3bcf470e6a5e0c14d520cb819d5c2df from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 249ms
2026-10-10T08:43:18.8786658Z ##[endgroup]
2026-10-10T08:43:18.8792429Z Generating Job Summary
2026-10-10T08:43:18.8803059Z Completed post-action step
﻿2026-10-10T08:43:18.9004898Z Post job cleanup.
2026-10-10T08:43:19.0084940Z (node:2607) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-10T08:43:19.0085647Z (Use `node --trace-deprecation ...` to show where the warning was created)
﻿2026-10-10T08:43:19.0258572Z Post job cleanup.
2026-10-10T08:43:19.0964269Z [command]/usr/bin/git version
2026-10-10T08:43:19.0998883Z git version 2.55.0
2026-10-10T08:43:19.1028007Z Temporarily overriding HOME='/home/runner/work/_temp/25451bf3-d4c4-470e-a47e-3e7ea2f2a202' before making global git config changes
2026-10-10T08:43:19.1029100Z Adding repository directory to the temporary git global config as a safe directory
2026-10-10T08:43:19.1032681Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-10T08:43:19.1065853Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-10T08:43:19.1096258Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-10T08:43:19.1302531Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-10T08:43:19.1327154Z http.https://github.com/.extraheader
2026-10-10T08:43:19.1342944Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-10T08:43:19.1365666Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-10T08:43:19.1575480Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-10T08:43:19.1608055Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
﻿2026-10-10T08:43:19.1950807Z Cleaning up orphan processes
2026-10-10T08:43:19.2193854Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
```

## Run ID: 38038815601

```text
29:2026-10-10T08:42:34.0005111Z Prepare all required actions
149:2026-10-10T08:42:39.6544632Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
151:2026-10-10T08:42:39.6545564Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
154:2026-10-10T08:42:39.6546670Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
190:2026-10-10T08:42:39.7073655Z   dependency-graph-continue-on-failure: true
348:2026-10-10T08:43:04.7123045Z (node:2494) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
414:2026-10-10T08:43:13.1427024Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
547:2026-10-10T08:42:34.0005075Z Prepare all required actions
667:2026-10-10T08:42:39.6544628Z [36;1m  SDKMGR="$SDK_DIR/cmdline-tools/latest/bin/sdkmanager"[0m
669:2026-10-10T08:42:39.6545430Z [36;1m    SDKMGR="$SDK_DIR/cmdline-tools/16.0/bin/sdkmanager"[0m
672:2026-10-10T08:42:39.6546665Z [36;1m    echo "::error::Android SDK manager missing from $SDK_DIR/cmdline-tools"[0m
708:2026-10-10T08:42:39.7073651Z   dependency-graph-continue-on-failure: true
866:2026-10-10T08:43:04.7122963Z (node:2494) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
932:2026-10-10T08:43:13.1426953Z Starting process 'Gradle build daemon'. Working directory: /home/runner/.gradle/daemon/8.11 Command: /usr/lib/jvm/temurin-17-jdk-amd64/bin/java --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.u
```

### Tail of logs

```text
2026-10-10T08:43:16.9496547Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleanup deleted 2 files/directories.
2026-10-10T08:43:16.9497829Z groovy-dsl (/home/runner/.gradle/caches/8.11/groovy-dsl) cleaned up in 0.009 secs.
2026-10-10T08:43:16.9499886Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 0 files/directories.
2026-10-10T08:43:16.9501222Z jars (/home/runner/.gradle/caches/jars-9) removing files not accessed on or after Sat Oct 10 08:42:40 UTC 2026.
2026-10-10T08:43:16.9502579Z jars (/home/runner/.gradle/caches/jars-9) cleanup deleted 2 files/directories.
2026-10-10T08:43:16.9503694Z jars (/home/runner/.gradle/caches/jars-9) cleaned up in 0.007 secs.
2026-10-10T08:43:16.9505189Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) removing files not accessed on or after Sat Oct 10 08:42:40 UTC 2026.
2026-10-10T08:43:16.9506982Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleanup deleted 0 files/directories.
2026-10-10T08:43:16.9509032Z Artifact transforms cache (/home/runner/.gradle/caches/8.11/transforms) cleaned up in 0.0 secs.
2026-10-10T08:43:16.9510826Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) removing files not accessed on or after Sat Oct 10 08:42:40 UTC 2026.
2026-10-10T08:43:16.9512982Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleanup deleted 0 files/directories.
2026-10-10T08:43:16.9514695Z dependencies-accessors (/home/runner/.gradle/caches/8.11/dependencies-accessors) cleaned up in 0.0 secs.
2026-10-10T08:43:16.9516123Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T08:43:16.9517845Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:43:16.9520235Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] removing files not accessed on or after Sat Oct 10 08:42:40 UTC 2026.
2026-10-10T08:43:16.9522478Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/resources-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:43:16.9524647Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:43:16.9527393Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] removing files not accessed on or after Sat Oct 10 08:42:40 UTC 2026.
2026-10-10T08:43:16.9953363Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/files-2.1] cleanup deleted 0 files/directories.
2026-10-10T08:43:16.9960020Z artifact cache (/home/runner/.gradle/caches/modules-2) [subdir: /home/runner/.gradle/caches/modules-2/metadata-2.107] cleanup deleted 0 files/directories.
2026-10-10T08:43:16.9989889Z artifact cache (/home/runner/.gradle/caches/modules-2) cleanup deleted 0 files/directories.
2026-10-10T08:43:16.9991074Z artifact cache (/home/runner/.gradle/caches/modules-2) cleaned up in 0.051 secs.
2026-10-10T08:43:17.0756320Z ##[endgroup]
2026-10-10T08:43:17.0757084Z ##[group]Caching Gradle state
2026-10-10T08:43:17.2011144Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:43:17.2333498Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:43:17.8392184Z Sent 98942 of 98942 (100.0%), 0.3 MBs/sec
2026-10-10T08:43:17.9593674Z Sent 166069 of 166069 (100.0%), 0.4 MBs/sec
2026-10-10T08:43:18.0846006Z Saved cache entry with key gradle-instrumented-jars-v1-63cb12b177a3a446868ef53cdae696e7 from /home/runner/.gradle/caches/jars-*/*/ in 904ms
2026-10-10T08:43:18.1747656Z Saved cache entry with key gradle-groovy-dsl-v1-b3ffc4823782133d3b34f50cec017ffe from /home/runner/.gradle/caches/*/groovy-dsl/*/ in 968ms
2026-10-10T08:43:18.2083016Z [command]/usr/bin/tar --posix -cf cache.tzst --exclude cache.tzst -P -C /home/runner/work/iloveyounaye/iloveyounaye --files-from manifest.txt --use-compress-program zstdmt
2026-10-10T08:43:18.9362573Z Sent 864396 of 864396 (100.0%), 1.7 MBs/sec
2026-10-10T08:43:19.1524008Z Saved cache entry with key gradle-home-v1|Linux-X64|apk[e080f0fdc288b6f0c5023fd4b86f7a10]-0f5664998118d0b7305c25768ef8c88645335bdc from /home/runner/.gradle/caches,/home/runner/.gradle/notifications,/home/runner/.gradle/.setup-gradle in 952ms
2026-10-10T08:43:19.1525488Z ##[endgroup]
2026-10-10T08:43:19.1533083Z Generating Job Summary
2026-10-10T08:43:19.1547706Z Completed post-action step
﻿2026-10-10T08:43:19.1723599Z Post job cleanup.
2026-10-10T08:43:19.3072743Z (node:2738) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-10T08:43:19.3074063Z (Use `node --trace-deprecation ...` to show where the warning was created)
﻿2026-10-10T08:43:19.3229736Z Post job cleanup.
2026-10-10T08:43:19.4114699Z [command]/usr/bin/git version
2026-10-10T08:43:19.4152367Z git version 2.55.0
2026-10-10T08:43:19.4187136Z Temporarily overriding HOME='/home/runner/work/_temp/f2a5a156-856d-4b86-99d9-4ee51cb3398e' before making global git config changes
2026-10-10T08:43:19.4188961Z Adding repository directory to the temporary git global config as a safe directory
2026-10-10T08:43:19.4199348Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-10T08:43:19.4229416Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-10T08:43:19.4262662Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-10T08:43:19.4453366Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-10T08:43:19.4479939Z http.https://github.com/.extraheader
2026-10-10T08:43:19.4491184Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-10T08:43:19.4523203Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-10T08:43:19.4722782Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-10T08:43:19.4755130Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
﻿2026-10-10T08:43:19.5128690Z Cleaning up orphan processes
2026-10-10T08:43:19.5383613Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, actions/upload-artifact@v4, gradle/actions/setup-gradle@v4, softprops/action-gh-release@v2. For more inform
```
