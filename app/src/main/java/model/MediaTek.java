package model;

import android.util.Log;

import javax.inject.Inject;

public class MediaTek implements Proccessor{
    @Inject
    public MediaTek() {
        Log.i("MyMobile", "MediaTek");
    }

    @Override
    public void start() {
        Log.i("MyMobile", "MediaTek started");
    }
}
