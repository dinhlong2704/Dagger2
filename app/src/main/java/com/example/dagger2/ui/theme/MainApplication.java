package com.example.dagger2.ui.theme;

import android.app.Application;
import android.util.Log;

import com.example.dagger2.ui.theme.component.ApplicationComponent;
import com.example.dagger2.ui.theme.component.DaggerApplicationComponent;
import com.example.dagger2.ui.theme.model.Camera;


public class MainApplication extends Application {
    ApplicationComponent component;
    Camera camera1,camera2;
    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder().setMp(64).build();
        camera1 = component.getCamera();
        camera2 = component.getCamera();
        Log.i("dasdsfsdf", "=========Application==========");
        Log.i("dasdsfsdf", "camera1 "+camera1);
        Log.i("dasdsfsdf", "camera2 "+camera2);
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}


