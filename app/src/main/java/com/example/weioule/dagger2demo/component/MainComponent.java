package com.example.weioule.dagger2demo.component;

import com.example.weioule.dagger2demo.act.MainActivity;
import com.example.weioule.dagger2demo.module.MainModule;
import com.example.weioule.dagger2demo.base.MyInject;

import dagger.Component;

/**
 * author weioule
 * Create on 2018/6/22.
 */

@MyInject
@Component(modules = MainModule.class, dependencies = BaseComponent.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
