package com.example.dagger2.ui.theme.model;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {
    private Battery battery;
    private Proccessor proccessor;
    private Camera camera;

    @Inject
    public Mobile(Battery battery, Proccessor proccessor,Camera camera) {
        this.battery = battery;
        this.proccessor = proccessor;
        this.camera = camera;

        Log.i("Singleton", "Mobile "+battery.toString()+ proccessor.toString()+ this.toString());
    }

    public void run() {
        proccessor.start();
        Log.i("MyMobile", "run");
    }

//    @Inject
//    public void connectCharger(Charger charger) {
//        charger.setCharger(this);
//    }
}
