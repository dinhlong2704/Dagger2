package app;

import android.app.Application;

import component.DaggerMobileComponent;
import component.MobileComponent;

public class MainApplication extends Application {
    private MobileComponent mobileComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mobileComponent = DaggerMobileComponent.factory().create(2, 4, 64);
    }

    public MobileComponent getMobileComponent() {
        return mobileComponent;
    }
}


