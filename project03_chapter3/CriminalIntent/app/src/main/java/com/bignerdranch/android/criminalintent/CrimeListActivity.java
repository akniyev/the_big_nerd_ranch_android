package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by admin on 30/03/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
