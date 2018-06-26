package com.example.injectdemo.component;

import com.example.injectdemo.scope.MainActivityScope;
import com.example.injectdemo.fm.MainFragment;

import dagger.Subcomponent;

/**
 * author weioule
 * Create on 2018/6/25.
 */

@MainActivityScope
@Subcomponent
public interface MainFragmentComponent {
    void inject(MainFragment mainFragment);
}
