package module;

import dagger.Binds;
import dagger.Module;
import model.MediaTek;
import model.Proccessor;

@Module
public abstract class MediaTekModule {
    @Binds
    abstract Proccessor provideProccessor(MediaTek mediaTek);
}
