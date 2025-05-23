package com.example.dagger2.ui.theme.module;

import com.example.dagger2.ui.theme.model.Camera;
import com.example.dagger2.ui.theme.scops.ApplicationScope;

import javax.inject.Named;


import dagger.Module;
import dagger.Provides;

@Module
public abstract class CameraModule {
    @ApplicationScope
    @Provides
    static Camera getCamera(@Named("pixels") int pixels) {
        return new Camera(pixels);
    }
}
