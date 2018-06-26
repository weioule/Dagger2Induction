package com.example.injectdemo.act;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.injectdemo.R;
import com.example.injectdemo.component.DaggerMainComponent;
import com.example.injectdemo.component.MainComponent;
import com.example.injectdemo.fm.MainFragment;
import com.example.injectdemo.module.MainModule;

/**
 * author weioule
 * Create on 2018/6/25.
 */
public class MainActivity extends BaseActivity {

    private MainComponent mMainComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.main_fl, new MainFragment()).commit();

        mMainComponent = DaggerMainComponent.builder()
                .activityComponent(getActivityComponent())
                .mainModule(new MainModule())
                .build();
        mMainComponent.inject(this);
    }

    public MainComponent getMainComponent() {
        return mMainComponent;
    }
}
