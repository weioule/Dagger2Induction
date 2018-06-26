package com.example.injectdemo.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * author weioule
 * Create on 2018/6/25.
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface MainActivityScope {
}
