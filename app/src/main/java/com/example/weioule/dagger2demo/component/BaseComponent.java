package com.example.weioule.dagger2demo.component;

import com.example.weioule.dagger2demo.mode.ClothHandler;
import com.example.weioule.dagger2demo.module.BaseModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * author weioule
 * Create on 2018/6/22.
 */

@Singleton
@Component(modules = BaseModule.class)
public interface BaseComponent {
    ClothHandler getClothHandlers();
}
