package component;

import dagger.Component;
import model.MainActivity;
import model.Mobile;
import module.BatteryModule;

@Component(modules = {BatteryModule.class})
public interface MobileComponent {
    //Mobile getMobile();
    void inject(MainActivity mainActivity);
}
