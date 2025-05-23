package com.example.dagger2.ui.theme.component;

import com.example.dagger2.ui.theme.model.Camera;
import com.example.dagger2.ui.theme.module.BatteryModule;
import com.example.dagger2.ui.theme.module.CameraModule;
import com.example.dagger2.ui.theme.scops.ApplicationScope;


import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@ApplicationScope
@Component(modules = {CameraModule.class})
public interface ApplicationComponent {
    Camera getCamera();

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder setMp(@Named("pixels") int pixels);
        ApplicationComponent build();
    }
}
