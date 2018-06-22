package com.example.weioule.dagger2demo.act;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.TextView;

import com.example.weioule.dagger2demo.R;
import com.example.weioule.dagger2demo.component.DaggerThirdComponent;
import com.example.weioule.dagger2demo.mode.Cloth;
import com.example.weioule.dagger2demo.mode.Clothes;
import com.example.weioule.dagger2demo.mode.Shoce;
import com.example.weioule.dagger2demo.mode.Shoces;
import com.example.weioule.dagger2demo.module.ThirdModule;

import javax.inject.Inject;
import javax.inject.Named;


/**
 * author weioule
 * Create on 2018/6/22.
 * 单个Activity的注入及注解的用法
 */
public class ThirdActivity extends AppCompatActivity {

    @Inject
    Cloth mRedCloth;
    @Inject
    @Named("blue")
    Cloth mBlueCloths;
    @Inject
    Clothes mClothes;
    @Inject
    Shoce mShoce;
    @Inject
    Shoces mShoces;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = (TextView) findViewById(R.id.tv1);
        TextView textView2 = (TextView) findViewById(R.id.tv2);
        textView2.setGravity(Gravity.LEFT);
        ((TextView) findViewById(R.id.title)).setText(getLocalClassName());

        DaggerThirdComponent.builder().thirdModule(new ThirdModule()).build().inject(this);

        textView1.setText("我现在有  " + mRedCloth + "  和  " + mBlueCloths + "  与  " + mClothes);
        textView2.setText("mRedCloth = mClothes中的cloth吗?:" + (mRedCloth == mClothes.getCloth()));
    }

}
