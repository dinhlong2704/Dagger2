package com.example.dagger2.ui.theme.module;

import com.example.dagger2.ui.theme.model.Proccessor;
import com.example.dagger2.ui.theme.model.Snapdragon;

import dagger.Module;
import dagger.Provides;

@Module
public class SnapdragonModule {
    int clockSpeed;

    public SnapdragonModule(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @Provides
    public int getClockSpeed() {
        return clockSpeed;
    }

    @Provides
    Proccessor provideProccessor(Snapdragon snapdragon) {
        return snapdragon;
    }
}
