package module;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import model.MediaTek;
import model.Proccessor;

@Module
public abstract class MediaTekModule {
    @Singleton
    @Binds
    abstract Proccessor provideProccessor(MediaTek mediaTek);
}
