## 8.3\. Power-Saving Modes

If device implementations include features to improve device power management
that are included in AOSP or extend the features that are included in AOSP,
they:

*   [C-1-1] MUST NOT deviate from the AOSP implementation for the triggering,
    maintenance, wakeup algorithms and the use of global system settings of App
    Standby and Doze power-saving modes.
*   [C-1-2] MUST NOT deviate from the AOSP implementation for the use of global
    settings to manage the throttling of jobs, alarm and network for apps in
    each bucket for App standby.
*   [C-1-3] MUST NOT deviate from the AOSP implementation for the number of the
    [App Standby Buckets](
    https://developer.android.com/topic/performance/appstandby) used for App
    Standby.
*   [C-1-4] MUST implement [App Standby Buckets](
    https://developer.android.com/topic/performance/appstandby) and Doze as
    described in [Power Management](
    https://source.android.com/devices/tech/power/mgmt).
*   [C-1-5] MUST return `true` for [`PowerManager.isPowerSaveMode()`](
    https://developer.android.com/reference/android/os/PowerManager#isPowerSaveMode%28%29)
    when the device is on power save mode.
*   [C-SR] Are STRONGLY RECOMMENDED to provide user affordance to enable and
    disable the battery saver feature.
*   [C-SR] Are STRONGLY RECOMMENDED to provide user affordance to display all
    Apps that are exempted from App Standby and Doze power-saving modes.

In addition to the power-saving modes, Android device implementations MAY
implement any or all of the 4 sleeping power states as defined by the Advanced
Configuration and Power Interface (ACPI).

If device implementations implement S3 and S4 power states as defined by the
ACPI, they:

*   [C-1-1] MUST enter these states only after the user has taken an explicit action
    to put the device in an inactive state (e.g. by closing a lid that is physically
    part of the device or turning off a vehicle or television) and before the user re-activates the
    device (e.g. by opening the lid or turning the vehicle or television back on).