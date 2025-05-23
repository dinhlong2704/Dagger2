package com.example.dagger2.ui.theme;

import android.app.Application;

import com.example.dagger2.ui.theme.component.ApplicationComponent;
import com.example.dagger2.ui.theme.component.DaggerMobileComponent;


public class MainApplication extends Application {
    ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder().build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}


