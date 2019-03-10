package com.box.kotlin

abstract class Box(private val mLength: Float, private val mWidth: Float, private val mHeight: Float) {
    fun validBox(length: Float, width: Float, height: Float): Boolean =
        !(length > mLength || width > mWidth || height > mHeight);

    abstract fun boxName(): String;
}

class Box3 : Box(23f, 14f, 13f) {
    override fun boxName(): String {
        return "Box3";
    }
}

class Box5 : Box(39.5f, 27.5f, 23f) {
    override fun boxName(): String {
        return "Box5";
    }
}