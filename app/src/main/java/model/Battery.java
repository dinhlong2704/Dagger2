package model;

import android.nfc.Tag;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
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
