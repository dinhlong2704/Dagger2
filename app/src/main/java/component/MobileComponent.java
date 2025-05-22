package component;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import model.MainActivity;
import model.MediaTek;
import model.Mobile;
import module.BatteryModule;
import module.CameraModule;
import module.MediaTekModule;
import module.SnapdragonModule;
@Singleton
@Component(modules = {BatteryModule.class, MediaTekModule.class, CameraModule.class})
public interface MobileComponent {
    //Mobile getMobile();
    void inject(MainActivity mainActivity);
    @Component.Factory
    interface Factory {
        MobileComponent create(@BindsInstance @Named("clockSpeed") int clockSpeed ,
                               @BindsInstance @Named("core") int core,
                               @BindsInstance @Named("pixels") int pixels);
    }
}
