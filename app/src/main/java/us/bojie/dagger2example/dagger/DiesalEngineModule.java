package us.bojie.dagger2example.dagger;

import dagger.Binds;
import dagger.Module;
import us.bojie.dagger2example.car.DieselEngine;
import us.bojie.dagger2example.car.Engine;

@Module
public abstract class DiesalEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
