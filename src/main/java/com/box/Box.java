package com.box;

public abstract class Box {

    private float mLength;
    private float mWidth;
    private float mHeight;

    public Box(float length, float width, float height) {
        this.mLength = length;
        this.mWidth = width;
        this.mHeight = height;
    }

    abstract String BoxName();

    /**
     * 箱子是否能容納
     *
     * @param length
     * @param width
     * @param height
     * @return
     */
    public boolean validate(float length, float width, float height) {
        return !(length > mLength || width > mWidth || height > mHeight);
    }

}
