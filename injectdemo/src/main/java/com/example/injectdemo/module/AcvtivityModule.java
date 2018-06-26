package com.example.injectdemo.module;

import android.app.Activity;

import com.example.injectdemo.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * author weioule
 * Create on 2018/6/25.
 */

@Module
public class AcvtivityModule {
    private Activity activity;

    @PerActivity
    @Provides
    public Activity getActivity() {
        return activity;
    }

    public AcvtivityModule(Activity activity) {
        this.activity = activity;
    }
}
