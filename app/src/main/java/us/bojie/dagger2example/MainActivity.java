package us.bojie.dagger2example;

import android.os.Bundle;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import us.bojie.dagger2example.car.Car;
import us.bojie.dagger2example.dagger.ActivityComponent;
import us.bojie.dagger2example.dagger.DaggerActivityComponent;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityComponent activityComponent = DaggerActivityComponent.builder()
                .horsePower(120)
                .engineCapacity(1400)
                .appComponent(((ExampleApp) getApplication()).getAppComponent())
                .build();
        activityComponent.inject(this);
        car1.drive();
        car2.drive();
    }
}
