package ru.intellisys.nerdlauncher;

import android.support.v4.app.Fragment;
import android.os.Bundle;

public class NerdLauncherActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return NerdLauncherFragment.newInsance();
    }
}
