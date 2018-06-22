package com.example.weioule.dagger2demo.act;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.weioule.dagger2demo.R;
import com.example.weioule.dagger2demo.base.MyAppliaction;
import com.example.weioule.dagger2demo.component.DaggerMainComponent;
import com.example.weioule.dagger2demo.mode.Cloth;
import com.example.weioule.dagger2demo.mode.ClothHandler;
import com.example.weioule.dagger2demo.module.MainModule;

import javax.inject.Inject;


/**
 * @author weioule
 *
 * 将ClothHandler注入到了这两个MainActivity和SecondActivity中,并且还实现了单例
 */
public class MainActivity extends AppCompatActivity {

    @Inject
    Cloth mRedCloth;

    @Inject
    ClothHandler mClothHandler;

    protected TextView mTextView1;
    protected TextView mTextView2;
    private TextView mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTitle = (TextView) findViewById(R.id.title);
        mTextView1 = (TextView) findViewById(R.id.tv1);
        mTextView2 = (TextView) findViewById(R.id.tv2);

        init();
        mTitle.setText(getLocalClassName());
        mTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), getClazz()));
            }
        });

    }

    protected void init() {
        DaggerMainComponent
                .builder()
                .baseComponent(((MyAppliaction) getApplication()).getBaseComponent())
                .mainModule(new MainModule())
                .build()
                .inject(this);

        mTextView1.setText(mRedCloth + "加工成了" + mClothHandler.hanlder(mRedCloth) + "\n\nclothHandler地址:\n" + mClothHandler);
    }

    protected Class getClazz() {
        return SecondActivity.class;
    }
}
