package com.wingerted.runtracker;

import android.content.Context;

/**
 * Created by Winger on 2014/10/9.
 */
public class RunLoader extends DataLoader<Run> {

    private long mRunId;

    public RunLoader(Context context, long runId) {
        super(context);

        mRunId = runId;
    }

    @Override
    public Run loadInBackground() {
        return RunManager.get(getContext()).getRun(mRunId);
    }
}
