package com.example.weioule.dagger2demo.mode;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * author weioule
 * Create on 2018/6/22.
 */

@Singleton
public class Shoce {

    @Inject
    public Shoce() {
    }

    @Override
    public String toString() {
        return "鞋子";
    }
}
