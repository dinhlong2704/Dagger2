package module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import model.Battery;
import model.Cobalt;
import model.Lithium;

@Module
public class BatteryModule {

    @Provides
    Cobalt getCobalt(){
        return new Cobalt();
    }
    @Provides
    Lithium getLithium(){
        Lithium lithium = new Lithium();
        lithium.done();
        return lithium;
    }
    @Singleton
    @Provides
    Battery getBattery(Lithium lithium, Cobalt cobalt){
        return new Battery(lithium, cobalt);
    }

}
