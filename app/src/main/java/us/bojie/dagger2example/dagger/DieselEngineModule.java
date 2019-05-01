package us.bojie.dagger2example.dagger;

import dagger.Module;
import dagger.Provides;
import us.bojie.dagger2example.car.DieselEngine;
import us.bojie.dagger2example.car.Engine;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine() {
        return new DieselEngine(horsePower);
    }
}
