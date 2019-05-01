package us.bojie.dagger2example;

import android.os.Bundle;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import us.bojie.dagger2example.car.Car;
import us.bojie.dagger2example.dagger.CarComponent;
import us.bojie.dagger2example.dagger.DaggerCarComponent;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent carComponent = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        carComponent.inject(this);
        car.drive();
    }
}
