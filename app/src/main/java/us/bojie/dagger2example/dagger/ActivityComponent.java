package us.bojie.dagger2example.dagger;

import dagger.Subcomponent;
import us.bojie.dagger2example.MainActivity;
import us.bojie.dagger2example.car.Car;

@PerActivity
@Subcomponent(modules = {WheelsModule.class, DieselEngineModule.class})
public interface ActivityComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        Builder horsePower(@Named("horse power") int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
//
//        Builder appComponent(AppComponent appComponent);
//
//        ActivityComponent build();
//    }
}
