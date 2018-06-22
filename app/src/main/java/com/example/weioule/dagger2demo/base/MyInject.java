package com.example.weioule.dagger2demo.base;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * author weioule
 * Create on 2018/6/22.
 *
 * 自定义注解  作用：声明作用范围  ---> 在同一个作用范围内,Provide方法提供的依赖对象就会变成单例
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface MyInject {
}
