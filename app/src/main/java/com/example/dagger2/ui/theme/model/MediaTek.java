package com.example.dagger2.ui.theme.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;


public class MediaTek implements Proccessor{
    int clockSpeed;
    int cores;
    @Inject
    public MediaTek(@Named("clockSpeed") int clockSpeed,@Named("core") int cores) {
        this.clockSpeed = clockSpeed;
        this.cores = cores;
        Log.i("MyMobile", "MediaTek");
    }

    @Override
    public void start() {
        Log.i("MyMobile", "MediaTek start with clock speed " + clockSpeed+" cores "+cores);
    }
}
