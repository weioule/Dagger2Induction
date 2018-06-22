package com.example.weioule.dagger2demo.module;

import com.example.weioule.dagger2demo.mode.ClothHandler;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * author weioule
 * Create on 2018/6/22.
 */

@Module
public class BaseModule {

    @Singleton
    @Provides
    public ClothHandler getClothHandler(){
        return new ClothHandler();
    }
}
