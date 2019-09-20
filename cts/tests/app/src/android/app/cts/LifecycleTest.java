/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.app.cts;

import android.app.stubs.ActivityTestsBase;
import android.app.stubs.LaunchpadActivity;
import android.app.stubs.LaunchpadTabActivity;
import android.content.ComponentName;
import android.content.Intent;

public class LifecycleTest extends ActivityTestsBase {
    private Intent mTopIntent;
    private Intent mTabIntent;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mTopIntent = mIntent;
        mTabIntent = new Intent(mContext, LaunchpadTabActivity.class);
        mTabIntent.putExtra("tab", new ComponentName(mContext, LaunchpadActivity.class));
    }

    public void testTabDialog() {
        mIntent = mTabIntent;
        runLaunchpad(LaunchpadActivity.LIFECYCLE_DIALOG);
    }

    public void testDialog() {
        mIntent = mTopIntent;
        runLaunchpad(LaunchpadActivity.LIFECYCLE_DIALOG);
    }

    public void testTabScreen() {
        mIntent = mTabIntent;
        runLaunchpad(LaunchpadActivity.LIFECYCLE_SCREEN);
    }

    public void testScreen() {
        mIntent = mTopIntent;
        runLaunchpad(LaunchpadActivity.LIFECYCLE_SCREEN);
    }

    public void testTabBasic() {
        mIntent = mTabIntent;
        runLaunchpad(LaunchpadActivity.LIFECYCLE_BASIC);
    }

    public void testBasic() {
        mIntent = mTopIntent;
        runLaunchpad(LaunchpadActivity.LIFECYCLE_BASIC);
    }
}
