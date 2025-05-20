package component;

import dagger.Component;
import model.Mobile;

@Component
public interface MobileComponent {
    Mobile getMobile();
}
