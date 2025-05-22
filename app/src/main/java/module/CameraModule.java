package module;

import javax.inject.Named;


import dagger.Module;
import dagger.Provides;
import model.Camera;

@Module
public abstract class CameraModule {
    @Provides
    static Camera getCamera(@Named("pixels") int pixels) {
        return new Camera(pixels);
    }
}
