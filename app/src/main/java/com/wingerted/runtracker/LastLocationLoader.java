package com.wingerted.runtracker;

import android.content.Context;
import android.location.Location;

/**
 * Created by Winger on 2014/10/9.
 */
public class LastLocationLoader extends DataLoader<Location> {

    private long mRunId;

    public LastLocationLoader(Context context, long runId) {
        super(context);
        mRunId = runId;
    }

    @Override
    public Location loadInBackground() {
        return RunManager.get(getContext()).getLastLocationForRun(mRunId);
    }
}
