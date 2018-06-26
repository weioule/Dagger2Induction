package com.example.injectdemo.component;

import android.app.Activity;

import com.example.injectdemo.module.AcvtivityModule;
import com.example.injectdemo.scope.PerActivity;
import com.example.injectdemo.utils.ToastUtil;

import dagger.Component;

/**
 * author weioule
 * Create on 2018/6/25.
 */

@PerActivity
@Component(modules = AcvtivityModule.class, dependencies = AppComponent.class)
public interface ActivityComponent {

    Activity getActivity();

    ToastUtil getToastUtil();

}
