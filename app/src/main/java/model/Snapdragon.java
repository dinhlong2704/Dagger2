package model;

import android.util.Log;

public class Snapdragon implements Proccessor {
    private int clockSpeed ;
    public Snapdragon(int clockSpeed) {
        this.clockSpeed = clockSpeed;
        Log.i("MyMobile", "Snapdragon");
    }

    @Override
    public void start() {
        Log.i("MyMobile", "Snapdragon started: with clock speed " + clockSpeed);
    }
}
