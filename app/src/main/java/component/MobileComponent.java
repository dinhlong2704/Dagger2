package component;

import dagger.Component;
import model.MainActivity;
import model.MediaTek;
import model.Mobile;
import module.BatteryModule;
import module.MediaTekModule;
import module.SnapdragonModule;

@Component(modules = {BatteryModule.class, SnapdragonModule.class})
public interface MobileComponent {
    //Mobile getMobile();
    void inject(MainActivity mainActivity);
}
