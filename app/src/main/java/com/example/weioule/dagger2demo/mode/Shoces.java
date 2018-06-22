package com.example.weioule.dagger2demo.mode;

/**
 * author weioule
 * Create on 2018/6/22.
 */
public class Shoces {

    private Shoce shoce;

    public Shoces(Shoce shoce) {
        this.shoce = shoce;
    }

    public Shoce getShoce() {
        return shoce;
    }

    @Override
    public String toString() {
        return "运动" + shoce;
    }
}
