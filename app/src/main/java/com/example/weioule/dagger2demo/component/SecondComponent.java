package com.example.weioule.dagger2demo.component;

import com.example.weioule.dagger2demo.act.SecondActivity;
import com.example.weioule.dagger2demo.module.SecondModule;
import com.example.weioule.dagger2demo.base.MyInject;

import dagger.Component;

/**
 * author weioule
 * Create on 2018/6/22.
 */

@MyInject
@Component(modules = SecondModule.class, dependencies = BaseComponent.class)
public interface SecondComponent {
    void inject(SecondActivity secondActivity);
}
