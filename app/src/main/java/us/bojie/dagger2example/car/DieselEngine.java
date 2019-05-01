package us.bojie.dagger2example.car;

import android.util.Log;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";
    private int horsePower;

    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started. HorsePower: " + horsePower);
    }
}
