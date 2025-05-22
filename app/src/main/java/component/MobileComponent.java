package component;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import model.MainActivity;
import model.MediaTek;
import model.Mobile;
import module.BatteryModule;
import module.MediaTekModule;
import module.SnapdragonModule;

@Component(modules = {BatteryModule.class, MediaTekModule.class})
public interface MobileComponent {
    //Mobile getMobile();
    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder  setClockSpeed(@Named("clockSpeed") int clockSpeed);
        @BindsInstance
        Builder  setCore(@Named("core") int core);

        MobileComponent build();
    }
}
