package us.bojie.dagger2example.dagger;

import dagger.Binds;
import dagger.Module;
import us.bojie.dagger2example.car.Engine;
import us.bojie.dagger2example.car.PetrolEngine;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
