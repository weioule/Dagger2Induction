package com.example.injectdemo.act;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.injectdemo.App;
import com.example.injectdemo.component.ActivityComponent;
import com.example.injectdemo.component.DaggerActivityComponent;
import com.example.injectdemo.module.AcvtivityModule;


/**
 * author weioule
 * Create on 2018/6/25.
 */
public class BaseActivity extends AppCompatActivity {

    private ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivityComponent = DaggerActivityComponent.builder()
                .appComponent(((App) getApplication()).getAppComponent())
                .acvtivityModule(new AcvtivityModule(this))
                .build();
    }

    public ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }
}
