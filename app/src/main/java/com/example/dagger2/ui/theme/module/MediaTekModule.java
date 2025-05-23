package com.example.dagger2.ui.theme.module;

import com.example.dagger2.ui.theme.model.MediaTek;
import com.example.dagger2.ui.theme.model.Proccessor;
import com.example.dagger2.ui.theme.scops.FragmentScope;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MediaTekModule {
    @FragmentScope
    @Binds
    abstract Proccessor provideProccessor(MediaTek mediaTek);
}
