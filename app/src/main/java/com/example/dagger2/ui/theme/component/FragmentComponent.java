package com.example.dagger2.ui.theme.component;

import com.example.dagger2.ui.theme.model.MediaTek;
import com.example.dagger2.ui.theme.model.Mobile;
import com.example.dagger2.ui.theme.model.Proccessor;
import com.example.dagger2.ui.theme.module.MediaTekModule;
import com.example.dagger2.ui.theme.module.SnapdragonModule;
import com.example.dagger2.ui.theme.scops.FragmentScope;

import java.util.concurrent.Flow;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@FragmentScope
@Subcomponent(modules = {MediaTekModule.class})
public interface FragmentComponent {
    Proccessor getProcessor();
    Mobile getMobile();



    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        Builder setClockSpeed(@Named("clockSpeed") int clockSpeed);

        @BindsInstance
        Builder setCore(@Named("core") int clockSpeed);

        FragmentComponent build();
    }


}
