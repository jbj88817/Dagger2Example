package us.bojie.dagger2example.dagger;

import javax.inject.Singleton;

import dagger.Component;
import us.bojie.dagger2example.car.Driver;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    Driver getDriver();
}
