# APK build error report

37926113217	completed	failure
37925726640	completed	failure
37925655819	completed	failure

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

## Run ID: 37925655819

```text
29:2026-10-09T11:45:07.4197651Z Prepare all required actions
151:2026-10-09T11:45:10.8750104Z Found preinstalled sdkmanager in /usr/local/lib/android/sdk/cmdline-tools/latest with following source.properties:
156:2026-10-09T11:45:10.8751672Z Wrong version in preinstalled sdkmanager
160:2026-10-09T11:45:12.1316135Z [command]/usr/local/lib/android/sdk/cmdline-tools/16.0/bin/sdkmanager --licenses
241:2026-10-09T11:45:16.2659998Z 3.3 Except to the extent required by applicable third party licenses, you may not copy (except for backup purposes), modify, adapt, redistribute, decompile, reverse engineer, disassemble, or create derivative works of the Google TV Add-on or any part of the Google TV
307:2026-10-09T11:45:16.2796836Z (B) Google is required to do so by law; or
387:2026-10-09T11:45:16.2844544Z 3.4 You may not use the SDK for any purpose not expressly permitted by the License Agreement. Except to the extent required by applicable third party licenses, you may not (a) copy (except for backup purposes), modify, adapt, redistribute, decompile, reverse engineer
447:2026-10-09T11:45:16.2890691Z 9.3 Google may at any time, terminate the License Agreement with you if: (A) you have breached any provision of the License Agreement; or (B) Google is required to do so by law; or (C) the partner with whom Google offered certain parts of SDK (such as APIs) to you ha
524:2026-10-09T11:45:16.2935803Z 3.4 You may not use the SDK for any purpose not expressly permitted by the License Agreement. Except to the extent required by applicable third party licenses, you may not copy (except for backup purposes), modify, adapt, redistribute, decompile, reverse engineer, di
586:2026-10-09T11:45:16.2978779Z 9.3 Google may at any time, terminate the License Agreement with you if: (A) you have breached any provision of the License Agreement; or (B) Google is required to do so by law; or (C) the partner with whom Google offered certain parts of SDK (such as APIs) to you ha
637:2026-10-09T11:45:16.3015051Z To get started with the Android SDK Preview, you must agree to the following terms and conditions. As described below, please note that this is a preview version of the Android SDK, subject to change, that you use at your own risk. The Android SDK Preview is not a st
665:2026-10-09T11:45:16.3033991Z 3.3 You may not use the Preview for any purpose not expressly permitted by the License Agreement. Except to the extent required by applicable third party licenses, you may not: (a) copy (except for backup purposes), modify, adapt, redistribute, decompile, reverse eng
735:2026-10-09T11:45:16.3087033Z 10.2 YOUR USE OF THE PREVIEW AND ANY MATERIAL DOWNLOADED OR OTHERWISE OBTAINED THROUGH THE USE OF THE PREVIEW IS AT YOUR OWN DISCRETION AND RISK AND YOU ARE SOLELY RESPONSIBLE FOR ANY DAMAGE TO YOUR COMPUTER SYSTEM OR OTHER DEVICE OR LOSS OF DATA THAT RESULTS FROM SU
805:2026-10-09T11:45:16.3137674Z 3.3 You may not use the GDK for any purpose not expressly permitted by this License Agreement. Except to the extent required by applicable third party licenses, you may not: (a) copy (except for backup purposes), modify, adapt, redistribute, decompile, reverse engine
870:2026-10-09T11:45:16.3197700Z 9.3 Google may at any time, terminate this License Agreement with you if: (A) you have breached any provision of this License Agreement; or (B) Google is required to do so by law; or (C) the partner with whom Google offered certain parts of GDK (such as APIs) to you 
942:2026-10-09T11:45:16.3272034Z 3.4 You may not use the SDK for any purpose not expressly permitted by the License Agreement. Except to the extent required by applicable third party licenses, you may not (a) copy (except for backup purposes), modify, adapt, redistribute, decompile, reverse engineer
996:2026-10-09T11:45:16.3342660Z 9.3 Google may at any time, terminate the License Agreement with you if: (A) you have breached any provision of the License Agreement; or (B) Google is required to do so by law; or (C) the partner with whom Google offered certain parts of SDK (such as APIs) to you ha
1076:2026-10-09T11:45:16.3443867Z 10.1 Controlling Law. This Agreement shall be governed by California law excluding its choice of law rules. With the exception of MIPS’ rights to enforce its intellectual property rights and any confidentiality obligations under this Agreement or any licenses dist
1086:2026-10-09T11:45:16.3467841Z 10.6 Export Regulations / Export Control. Recipient shall not export, either directly or indirectly, any product, service or technical data or system incorporating the Evaluation Materials without first obtaining any required license or other necessary approval from
1088:2026-10-09T11:45:16.3474391Z 10.7 Special Terms for Pre-Release Materials. If so indicated in the description of the Evaluation Software, the Evaluation Software may contain Pre-Release Materials. Recipient hereby understands, acknowledges and agrees that: (i) Pre-Release Materials may not be f
1096:2026-10-09T11:45:16.3483681Z [command]/usr/local/lib/android/sdk/cmdline-tools/16.0/bin/sdkmanager tools
1111:2026-10-09T11:45:17.5273641Z Warning: Failed to find package 'tools'
1113:2026-10-09T11:45:17.7378546Z                 error = new Error(`The process '${this.toolPath}' failed with exit code ${this.processExitCode}`);
1116:2026-10-09T11:45:17.7379740Z Error: The process '/usr/local/lib/android/sdk/cmdline-tools/16.0/bin/sdkmanager' failed with exit code 1
1180:2026-10-09T11:45:07.4197618Z Prepare all required actions
1302:2026-10-09T11:45:10.8750048Z Found preinstalled sdkmanager in /usr/local/lib/android/sdk/cmdline-tools/latest with following source.properties:
1307:2026-10-09T11:45:10.8751601Z Wrong version in preinstalled sdkmanager
1311:2026-10-09T11:45:12.1316126Z [command]/usr/local/lib/android/sdk/cmdline-tools/16.0/bin/sdkmanager --licenses
1392:2026-10-09T11:45:16.2659947Z 3.3 Except to the extent required by applicable third party licenses, you may not copy (except for backup purposes), modify, adapt, redistribute, decompile, reverse engineer, disassemble, or create derivative works of the Google TV Add-on or any part of the Google T
1458:2026-10-09T11:45:16.2796835Z (B) Google is required to do so by law; or
1538:2026-10-09T11:45:16.2844445Z 3.4 You may not use the SDK for any purpose not expressly permitted by the License Agreement. Except to the extent required by applicable third party licenses, you may not (a) copy (except for backup purposes), modify, adapt, redistribute, decompile, reverse enginee
1598:2026-10-09T11:45:16.2890686Z 9.3 Google may at any time, terminate the License Agreement with you if: (A) you have breached any provision of the License Agreement; or (B) Google is required to do so by law; or (C) the partner with whom Google offered certain parts of SDK (such as APIs) to you h
1675:2026-10-09T11:45:16.2935801Z 3.4 You may not use the SDK for any purpose not expressly permitted by the License Agreement. Except to the extent required by applicable third party licenses, you may not copy (except for backup purposes), modify, adapt, redistribute, decompile, reverse engineer, d
1737:2026-10-09T11:45:16.2978769Z 9.3 Google may at any time, terminate the License Agreement with you if: (A) you have breached any provision of the License Agreement; or (B) Google is required to do so by law; or (C) the partner with whom Google offered certain parts of SDK (such as APIs) to you h
1788:2026-10-09T11:45:16.3015047Z To get started with the Android SDK Preview, you must agree to the following terms and conditions. As described below, please note that this is a preview version of the Android SDK, subject to change, that you use at your own risk. The Android SDK Preview is not a s
1816:2026-10-09T11:45:16.3033987Z 3.3 You may not use the Preview for any purpose not expressly permitted by the License Agreement. Except to the extent required by applicable third party licenses, you may not: (a) copy (except for backup purposes), modify, adapt, redistribute, decompile, reverse en
1886:2026-10-09T11:45:16.3087028Z 10.2 YOUR USE OF THE PREVIEW AND ANY MATERIAL DOWNLOADED OR OTHERWISE OBTAINED THROUGH THE USE OF THE PREVIEW IS AT YOUR OWN DISCRETION AND RISK AND YOU ARE SOLELY RESPONSIBLE FOR ANY DAMAGE TO YOUR COMPUTER SYSTEM OR OTHER DEVICE OR LOSS OF DATA THAT RESULTS FROM S
1956:2026-10-09T11:45:16.3137660Z 3.3 You may not use the GDK for any purpose not expressly permitted by this License Agreement. Except to the extent required by applicable third party licenses, you may not: (a) copy (except for backup purposes), modify, adapt, redistribute, decompile, reverse engin
2021:2026-10-09T11:45:16.3197693Z 9.3 Google may at any time, terminate this License Agreement with you if: (A) you have breached any provision of this License Agreement; or (B) Google is required to do so by law; or (C) the partner with whom Google offered certain parts of GDK (such as APIs) to you
2093:2026-10-09T11:45:16.3272019Z 3.4 You may not use the SDK for any purpose not expressly permitted by the License Agreement. Except to the extent required by applicable third party licenses, you may not (a) copy (except for backup purposes), modify, adapt, redistribute, decompile, reverse enginee
2147:2026-10-09T11:45:16.3342655Z 9.3 Google may at any time, terminate the License Agreement with you if: (A) you have breached any provision of the License Agreement; or (B) Google is required to do so by law; or (C) the partner with whom Google offered certain parts of SDK (such as APIs) to you h
2227:2026-10-09T11:45:16.3443842Z 10.1 Controlling Law. This Agreement shall be governed by California law excluding its choice of law rules. With the exception of MIPS’ rights to enforce its intellectual property rights and any confidentiality obligations under this Agreement or any licenses dist
2237:2026-10-09T11:45:16.3467814Z 10.6 Export Regulations / Export Control. Recipient shall not export, either directly or indirectly, any product, service or technical data or system incorporating the Evaluation Materials without first obtaining any required license or other necessary approval from
2239:2026-10-09T11:45:16.3474382Z 10.7 Special Terms for Pre-Release Materials. If so indicated in the description of the Evaluation Software, the Evaluation Software may contain Pre-Release Materials. Recipient hereby understands, acknowledges and agrees that: (i) Pre-Release Materials may not be f
2247:2026-10-09T11:45:16.3483679Z [command]/usr/local/lib/android/sdk/cmdline-tools/16.0/bin/sdkmanager tools
2262:2026-10-09T11:45:17.5273638Z Warning: Failed to find package 'tools'
2264:2026-10-09T11:45:17.7378540Z                 error = new Error(`The process '${this.toolPath}' failed with exit code ${this.processExitCode}`);
2267:2026-10-09T11:45:17.7379735Z Error: The process '/usr/local/lib/android/sdk/cmdline-tools/16.0/bin/sdkmanager' failed with exit code 1
```

### Tail of logs

```text
2026-10-09T11:45:16.3478326Z ANY PRE-RELEASE MATERIALS ARE NON-QUALIFIED AND, AS SUCH, ARE PROVIDED “AS IS” AND “AS AVAILABLE”, POSSIBLY WITH FAULTS, AND WITHOUT REPRESENTATION OR WARRANTY OF ANY KIND.
2026-10-09T11:45:16.3478910Z 
2026-10-09T11:45:16.3480584Z 10.8 Open Source Software. In the event Open Source software is included with Evaluation Software, such Open Source software is licensed pursuant to the applicable Open Source software license agreement identified in the Open Source software comments in the applicable so
2026-10-09T11:45:16.3483046Z ---------------------------------------
2026-10-09T11:45:16.3483298Z Accept? (y/N): All SDK package licenses accepted
2026-10-09T11:45:16.3483466Z 
2026-10-09T11:45:16.3483679Z [command]/usr/local/lib/android/sdk/cmdline-tools/16.0/bin/sdkmanager tools
2026-10-09T11:45:16.9140165Z Loading package information...                                                  
2026-10-09T11:45:16.9890760Z Loading local repository...                                                     
2026-10-09T11:45:16.9891908Z [                                       ] 3% Loading local repository...        
2026-10-09T11:45:16.9962785Z [                                       ] 3% Fetch remote repository...         
2026-10-09T11:45:17.2566423Z [=                                      ] 3% Fetch remote repository...         
2026-10-09T11:45:17.3172489Z [=                                      ] 4% Fetch remote repository...         
2026-10-09T11:45:17.3435643Z [=                                      ] 5% Fetch remote repository...         
2026-10-09T11:45:17.3860316Z [==                                     ] 5% Fetch remote repository...         
2026-10-09T11:45:17.4385011Z [==                                     ] 6% Fetch remote repository...         
2026-10-09T11:45:17.5166573Z [==                                     ] 7% Fetch remote repository...         
2026-10-09T11:45:17.5185443Z [==                                     ] 7% Computing updates...               
2026-10-09T11:45:17.5255408Z [===                                    ] 8% Computing updates...               
2026-10-09T11:45:17.5272400Z [===                                    ] 10% Computing updates...              
2026-10-09T11:45:17.5273135Z                                                                                 
2026-10-09T11:45:17.5273638Z Warning: Failed to find package 'tools'
2026-10-09T11:45:17.7377652Z /home/runner/work/_actions/android-actions/setup-android/v3/dist/index.js:1823
2026-10-09T11:45:17.7378540Z                 error = new Error(`The process '${this.toolPath}' failed with exit code ${this.processExitCode}`);
2026-10-09T11:45:17.7379142Z                         ^
2026-10-09T11:45:17.7379319Z 
2026-10-09T11:45:17.7379735Z Error: The process '/usr/local/lib/android/sdk/cmdline-tools/16.0/bin/sdkmanager' failed with exit code 1
2026-10-09T11:45:17.7380617Z     at ExecState._setResult (/home/runner/work/_actions/android-actions/setup-android/v3/dist/index.js:1823:25)
2026-10-09T11:45:17.7381556Z     at ExecState.CheckComplete (/home/runner/work/_actions/android-actions/setup-android/v3/dist/index.js:1806:18)
2026-10-09T11:45:17.7382514Z     at ChildProcess.<anonymous> (/home/runner/work/_actions/android-actions/setup-android/v3/dist/index.js:1700:27)
2026-10-09T11:45:17.7382963Z     at ChildProcess.emit (node:events:509:28)
2026-10-09T11:45:17.7383231Z     at maybeClose (node:internal/child_process:1141:16)
2026-10-09T11:45:17.7383551Z     at ChildProcess._handle.onexit (node:internal/child_process:306:5)
2026-10-09T11:45:17.7383769Z 
2026-10-09T11:45:17.7383844Z Node.js v24.19.0
2026-10-09T11:45:17.7449475Z [===                                    ] 10% Computing updates...              
﻿2026-10-09T11:45:17.7709531Z Post job cleanup.
2026-10-09T11:45:17.8833548Z (node:2293) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
2026-10-09T11:45:17.8834490Z (Use `node --trace-deprecation ...` to show where the warning was created)
﻿2026-10-09T11:45:17.9887609Z Post job cleanup.
2026-10-09T11:45:18.0655352Z [command]/usr/bin/git version
2026-10-09T11:45:18.0677889Z git version 2.55.0
2026-10-09T11:45:18.0710241Z Temporarily overriding HOME='/home/runner/work/_temp/d33378f6-9796-4e04-8df1-8876ab22f38d' before making global git config changes
2026-10-09T11:45:18.0711400Z Adding repository directory to the temporary git global config as a safe directory
2026-10-09T11:45:18.0714703Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/iloveyounaye/iloveyounaye
2026-10-09T11:45:18.1042359Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2026-10-09T11:45:18.1078213Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2026-10-09T11:45:18.1336294Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2026-10-09T11:45:18.1352508Z http.https://github.com/.extraheader
2026-10-09T11:45:18.1367043Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2026-10-09T11:45:18.2080100Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2026-10-09T11:45:18.2291734Z [command]/usr/bin/git config --local --name-only --get-regexp ^includeIf\.gitdir:
2026-10-09T11:45:18.2321831Z [command]/usr/bin/git submodule foreach --recursive git config --local --show-origin --name-only --get-regexp remote.origin.url
﻿2026-10-09T11:45:18.2719955Z Cleaning up orphan processes
2026-10-09T11:45:18.2968652Z ##[warning]Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24: actions/checkout@v4, actions/setup-java@v4, android-actions/setup-android@v3. For more information see: https://github.blog/changelog/2025-09-19-deprec
```
