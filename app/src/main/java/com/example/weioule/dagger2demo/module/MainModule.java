package com.example.weioule.dagger2demo.module;

import com.example.weioule.dagger2demo.base.MyInject;
import com.example.weioule.dagger2demo.mode.Cloth;

import dagger.Module;
import dagger.Provides;

/**
 * author weioule
 * Create on 2018/6/22.
 */

@Module
public class MainModule {

    @MyInject
    @Provides
    public Cloth getRedCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }
}

