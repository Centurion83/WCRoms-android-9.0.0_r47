## 2.4\. Watch Requirements

An **Android Watch device** refers to an Android device implementation intended to
be worn on the body, perhaps on the wrist.

Android device implementations are classified as a Watch if they meet all the
following criteria:

*   Have a screen with the physical diagonal length in the range from 1.1 to 2.5
    inches.
*   Have a mechanism provided to be worn on the body.

The additional requirements in the rest of this section are specific to Android
Watch device implementations.

### 2.4.1\. Hardware

Watch device implementations:

*   [[7.1](#7_1_display-and-graphics).1.1/W-0-1] MUST have a screen with the
physical diagonal size in the range from 1.1 to 2.5 inches.

*   [[7.2](#7_2_input-devices).3/W-0-1] MUST have the Home function available
to the user, and the Back function except for when it is in `UI_MODE_TYPE_WATCH`.

*   [[7.2](#7_2_input-devices).4/W-0-1] MUST support touchscreen input.

*   [[7.3](#7_3_sensors).1/W-SR] Are STRONGLY RECOMMENDED to include a 3-axis
accelerometer.

*   [[7.4](#7_4_data-connectivity).3/W-0-1] MUST support Bluetooth.

*   [[7.6](#7_6_memory-and-storage).1/W-0-1] MUST have at least 1GB of
non-volatile storage available for application private data (a.k.a. "/data" partition)
*   [[7.6](#7_6_memory-and-storage).1/W-0-2] MUST have at least 416MB memory
available to the kernel and userspace.

*   [[7.8](#7_8_audio).1/W-0-1] MUST include a microphone.

*   [[7.8](#7_8_audio).2/W] MAY but SHOULD NOT have audio output.

### 2.4.2\. Multimedia

No additional requirements.

### 2.4.3\. Software

Watch device implementations:

*   [[3](#3_0_intro)/W-0-1] MUST declare the feature
`android.hardware.type.watch`.
*   [[3](#3_0_intro)/W-0-2] MUST support uiMode =
    [UI_MODE_TYPE_WATCH](
    http://developer.android.com/reference/android/content/res/Configuration.html#UI_MODE_TYPE_WATCH).

Watch device implementations:

*   [[3.8](#3_8_user-interface-compatibility).4/W-SR] Are STRONGLY RECOMMENDED
to implement an assistant on the device to handle the [Assist action](
http://developer.android.com/reference/android/content/Intent.html#ACTION_ASSIST).

Watch device implementations that declare the `android.hardware.audio.output`
feature flag:

*   [[3.10](#3_10_accessibility)/W-1-1] MUST support third-party accessibility
services.
*   [[3.10](#3_10_accessibility)/W-SR] Are STRONGLY RECOMMENDED to preload
accessibility services on the device comparable with or exceeding functionality
of the Switch Access and TalkBack (for languages supported by the preloaded
Text-to-speech engine) accessibility services as provided in the
[talkback open source project]( https://github.com/google/talkback).

If Watch device implementations report the feature android.hardware.audio.output,
they:

*   [[3.11](#3_11_text-to-speech)/W-SR] Are STRONGLY RECOMMENDED to include a
TTS engine supporting the languages available on the device.

*   [[3.11](#3_11_text-to-speech)/W-0-1] MUST support installation of
third-party TTS engines.

### 2.4.4\. Performance and Power

If Watch device implementations include features to improve device power
management that are included in AOSP or extend the features that are included
in AOSP, they:

*   [[8.3](#8_3_power-saving-modes)/W-SR] Are STRONGLY RECOMMENDED to provide
    user affordance to display all apps that are exempted from App Standby and
    Doze power-saving modes.
*   [[8.3](#8_3_power-saving-modes)/W-SR] Are STRONGLY RECOMMENDED to provide
    user affordance to enable and disable the battery saver feature.

Watch device implementations:

*    [[8.4](#8_4_power-consumption-accounting)/W-0-1] MUST provide a
per-component power profile that defines the [current consumption value](
http://source.android.com/devices/tech/power/values.html).
for each hardware component and the approximate battery drain caused by the
components over time as documented in the Android Open Source Project site.
*    [[8.4](#8_4_power-consumption-accounting)/W-0-2] MUST report all power
consumption values in milliampere hours (mAh).
*    [[8.4](#8_4_power-consumption-accounting)/W-0-3] MUST report CPU power
consumption per each process's UID. The Android Open Source Project meets the
requirement through the `uid_cputime` kernel module implementation.
*   [[8.4](#8_4_power-consumption-accounting)/W-0-4] MUST make this power usage
available via the [`adb shell dumpsys batterystats`](
http://source.android.com/devices/tech/power/batterystats.html)
shell command to the app developer.
*   [[8.4](#8_4_power-consumption-accounting)/W] SHOULD be attributed to the
hardware component itself if unable to attribute hardware component power usage
to an application.
