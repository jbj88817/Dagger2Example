package us.bojie.dagger2example.dagger;

import dagger.Component;
import us.bojie.dagger2example.MainActivity;
import us.bojie.dagger2example.car.Car;

@Component(modules = {WheelsModule.class, DiesalEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
