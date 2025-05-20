package model;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {
    private Battery battery;
    private Proccessor proccessor;

    @Inject
    public Mobile(Battery battery, Proccessor proccessor) {
        this.battery = battery;
        this.proccessor = proccessor;
        Log.i("MyMobile", "Mobile");
    }

    public void run() {
        Log.i("MyMobile", "run");
    }
}
