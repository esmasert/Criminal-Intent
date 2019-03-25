package com.example.esmasert.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by esmasert on 18.08.2016.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
