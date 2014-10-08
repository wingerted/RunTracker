package com.wingerted.runtracker;

import android.content.Context;
import android.location.Location;

/**
 * Created by wingerted on 14/10/8.
 */
public class TrackingLocationReceiver extends LocationReceiver {

    @Override
    protected void onLocationReceived(Context context, Location loc) {
        RunManager.get(context).insertLocation(loc);
    }
}
