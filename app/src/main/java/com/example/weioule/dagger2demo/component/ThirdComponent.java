package com.example.weioule.dagger2demo.component;

import com.example.weioule.dagger2demo.act.ThirdActivity;
import com.example.weioule.dagger2demo.module.ThirdModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * author weioule
 * Create on 2018/6/22.
 */

@Singleton
@Component(modules = ThirdModule.class)
public interface ThirdComponent {
    void inject(ThirdActivity thirdActivity);
}
