package module;

import dagger.Module;
import dagger.Provides;
import model.Proccessor;
import model.Snapdragon;

@Module
public class SnapdragonModule {
    int clockSpeed;

    public SnapdragonModule(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @Provides
    Proccessor provideProccessor(){
        return new Snapdragon(clockSpeed);
    }
}
