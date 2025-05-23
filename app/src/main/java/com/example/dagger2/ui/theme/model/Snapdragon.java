package com.example.dagger2.ui.theme.model;

import android.util.Log;

import javax.inject.Inject;

public class Snapdragon implements Proccessor {
    private int clockSpeed ;
    @Inject
    public Snapdragon(int clockSpeed) {
        this.clockSpeed = clockSpeed;
        Log.i("MyMobile", "Snapdragon");
    }

    @Override
    public void start() {
        Log.i("MyMobile", "Snapdragon started: with clock speed " + clockSpeed);
    }
}
