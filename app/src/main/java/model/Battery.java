package model;

import android.nfc.Tag;
import android.util.Log;

import javax.inject.Inject;

public class Battery {
    @Inject
    public Battery() {
        Log.i("MyMobile", "Battery started");
    }
}
