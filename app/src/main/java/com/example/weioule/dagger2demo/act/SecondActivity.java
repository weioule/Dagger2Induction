package com.example.weioule.dagger2demo.act;

import com.example.weioule.dagger2demo.base.MyAppliaction;
import com.example.weioule.dagger2demo.component.DaggerSecondComponent;
import com.example.weioule.dagger2demo.mode.Cloth;
import com.example.weioule.dagger2demo.mode.ClothHandler;
import com.example.weioule.dagger2demo.module.SecondModule;

import javax.inject.Inject;

/**
 * author weioule
 * Create on 2018/6/22.
 */
public class SecondActivity extends MainActivity {

    @Inject
    public Cloth mBlueCloth;

    @Inject
    public ClothHandler mClothHandler;

    @Override
    protected void init() {
        DaggerSecondComponent
                .builder()
                .baseComponent(((MyAppliaction) getApplication()).getBaseComponent())
                .secondModule(new SecondModule())
                .build()
                .inject(this);

        mTextView1.setText(mBlueCloth + "加工成了" + mClothHandler.hanlder(mBlueCloth) + "\n\nclothHandler地址:\n" + mClothHandler);
    }

    @Override
    protected Class getClazz() {
        return ThirdActivity.class;
    }
}
