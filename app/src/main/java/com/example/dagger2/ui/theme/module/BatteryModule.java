package com.example.dagger2.ui.theme.module;

import com.example.dagger2.ui.theme.model.Battery;
import com.example.dagger2.ui.theme.model.Cobalt;
import com.example.dagger2.ui.theme.model.Lithium;
import com.example.dagger2.ui.theme.scops.ActivityScope;
import com.example.dagger2.ui.theme.scops.ApplicationScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BatteryModule {

    @Provides
    Cobalt getCobalt(){
        return new Cobalt();
    }
    @Provides
    Lithium getLithium(){
        Lithium lithium = new Lithium();
        lithium.done();
        return lithium;
    }
    @ActivityScope
    @Provides
    Battery getBattery(Lithium lithium, Cobalt cobalt){
        return new Battery(lithium, cobalt);
    }

}
