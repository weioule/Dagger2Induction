package com.example.weioule.dagger2demo.mode;

/**
 * author weioule
 * Create on 2018/6/22.
 */
public class Clothes {

    private Cloth cloth;

    public Clothes(Cloth cloth) {
        this.cloth = cloth;
    }

    public Cloth getCloth() {
        return cloth;
    }

    @Override
    public String toString() {
        return cloth.getColor() + "衣服";
    }
}
