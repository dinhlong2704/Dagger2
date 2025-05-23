package com.example.dagger2.ui.theme.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;


public class Battery {
    private Lithium lithium;
    private Cobalt cobalt;

    @Inject
    public Battery(Lithium lithium, Cobalt cobalt) {
        this.lithium = lithium;
        this.cobalt = cobalt;
        Log.i("MyMobile", "Battery started");
    }
}
