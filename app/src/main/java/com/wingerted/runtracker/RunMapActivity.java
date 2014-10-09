package com.wingerted.runtracker;

import android.support.v4.app.Fragment;

/**
 * Created by Winger on 2014/10/10.
 */
public class RunMapActivity extends SingleFragmentActivity {
    // A key for passing a run ID as a long
    public static final String EXTRA_RUN_ID = "com.wingerted.runtracker.run_id";

    @Override
    protected Fragment createFragment() {
        long runId = getIntent().getLongExtra(EXTRA_RUN_ID, -1);
        if (runId != -1) {
            return RunMapFragment.newInstance(runId);
        } else {
            return new RunMapFragment();
        }
    }
}
