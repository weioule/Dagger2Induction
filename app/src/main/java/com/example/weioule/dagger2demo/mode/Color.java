package com.example.weioule.dagger2demo.mode;

/**
 * author weioule
 * Create on 2018/6/22.
 */
public class Color {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + "布料";
    }
}
