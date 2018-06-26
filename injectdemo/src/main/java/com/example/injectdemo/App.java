package com.example.injectdemo;

import android.app.Application;

import com.example.injectdemo.component.AppComponent;
import com.example.injectdemo.component.DaggerAppComponent;
import com.example.injectdemo.module.AppModule;

/**
 * author weioule
 * Create on 2018/6/25.
 */
public class App extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
