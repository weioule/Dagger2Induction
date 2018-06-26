package com.example.injectdemo.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * author weioule
 * Create on 2018/6/25.
 */
public class ToastUtil {
    private Context context;

    public ToastUtil(Context context) {
        this.context = context;
    }

    public void showToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
