package us.bojie.dagger2example.dagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);
}
