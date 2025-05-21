package model;

import android.util.Log;

public class Snapdragon implements Proccessor {
    public Snapdragon()  {
        Log.i("MyMobile", "Snapdragon");
    }

    @Override
    public void start() {
        Log.i("MyMobile", "Snapdragon started");
    }
}
