package com.example.weioule.dagger2demo.module;

import com.example.weioule.dagger2demo.mode.Cloth;
import com.example.weioule.dagger2demo.mode.Clothes;
import com.example.weioule.dagger2demo.mode.Color;
import com.example.weioule.dagger2demo.mode.Shoce;
import com.example.weioule.dagger2demo.mode.Shoces;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * author weioule
 * Create on 2018/6/22.
 */

@Module
public class ThirdModule {

    @Provides
    public Color getColor() {
        return new Color();
    }

    @Provides
    public Cloth getRedCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

    @Named("blue")
    @Provides
    public Cloth getBlueCloth(Cloth cloth) {
        cloth.setColor("蓝色");
        return cloth;
    }

    @Provides
    public Clothes getClothes(Cloth cloth) {
        return new Clothes(cloth);
    }

    @Provides
    public Shoces getShoces(Shoce shoce) {
        return new Shoces(shoce);
    }

}
