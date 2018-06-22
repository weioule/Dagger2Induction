package com.example.weioule.dagger2demo.base;

import android.app.Application;

import com.example.weioule.dagger2demo.component.BaseComponent;
import com.example.weioule.dagger2demo.component.DaggerBaseComponent;
import com.example.weioule.dagger2demo.module.BaseModule;


/**
 * author weioule
 * Create on 2018/6/22.
 */
public class MyAppliaction extends Application {

    public BaseComponent getBaseComponent() {
        return baseComponent;
    }

    private BaseComponent baseComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        baseComponent = DaggerBaseComponent.builder().baseModule(new BaseModule()).build();
    }
}
