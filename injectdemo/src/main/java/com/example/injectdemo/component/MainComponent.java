package com.example.injectdemo.component;

import com.example.injectdemo.act.MainActivity;
import com.example.injectdemo.scope.MainActivityScope;
import com.example.injectdemo.module.MainModule;

import dagger.Component;

/**
 * author weioule
 * Create on 2018/6/25.
 */

@MainActivityScope
@Component(modules = MainModule.class, dependencies = ActivityComponent.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);

    MainFragmentComponent getMainFragmentComponent();

}
