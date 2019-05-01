package us.bojie.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    // if this car having constructor injection, it automatically init the field injection
    @Inject Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }

    public void drive() {
        engine.start();
        Log.d(TAG, "driving...");
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }
}
