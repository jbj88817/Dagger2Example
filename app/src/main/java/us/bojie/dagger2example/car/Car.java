package us.bojie.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    // if this car having constructor injection, it automatically init the field injection
    @Inject
    Engine engine;
    private Wheels wheels;
    private Driver driver;

    @Inject
    public Car(Wheels wheels, Driver driver) {
        this.wheels = wheels;
        this.driver = driver;
    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver + " drives " + this);
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }
}
