package us.bojie.dagger2example;

import android.app.Application;

import us.bojie.dagger2example.dagger.AppComponent;
import us.bojie.dagger2example.dagger.DaggerAppComponent;

public class ExampleApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
