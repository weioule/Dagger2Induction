package com.example.weioule.dagger2demo.mode;

/**
 * author weioule
 * Create on 2018/6/22.
 */
public class ClothHandler {

    public Clothes hanlder(Cloth cloth){
        return new Clothes(cloth);
    }
}
