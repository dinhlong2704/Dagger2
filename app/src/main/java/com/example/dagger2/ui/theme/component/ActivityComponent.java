package com.example.dagger2.ui.theme.component;

import com.example.dagger2.ui.theme.model.Battery;
import com.example.dagger2.ui.theme.module.BatteryModule;
import com.example.dagger2.ui.theme.module.SnapdragonModule;
import com.example.dagger2.ui.theme.scops.ActivityScope;

import dagger.Component;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = BatteryModule.class)
public interface ActivityComponent {
    Battery getBattery();
    FragmentComponent.Builder getFragmentComponentBuilder();
}
