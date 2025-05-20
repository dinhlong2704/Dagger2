package component;

import dagger.Component;
import model.MainActivity;
import model.Mobile;

@Component
public interface MobileComponent {
    //Mobile getMobile();
    void inject(MainActivity mainActivity);
}
