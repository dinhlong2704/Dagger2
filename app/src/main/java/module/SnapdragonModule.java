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
    public int getClockSpeed() {
        return clockSpeed;
    }

    @Provides
    Proccessor provideProccessor(Snapdragon snapdragon) {
        return snapdragon;
    }
}
