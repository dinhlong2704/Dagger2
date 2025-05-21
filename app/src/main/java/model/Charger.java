package model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

public class Charger {
    @Inject
    public Charger() {
    }

    public void setCharger(Mobile mobile) {
        Log.i("MyMobile", "Charger");
    }

}
