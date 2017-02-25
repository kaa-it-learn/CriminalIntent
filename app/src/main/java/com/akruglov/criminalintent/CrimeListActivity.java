package com.akruglov.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by akruglov on 2/25/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
