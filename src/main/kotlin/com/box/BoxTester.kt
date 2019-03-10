package com.box.kotlin

import java.util.*

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`);
    print("Please enter object's length: ");
    val length = scanner.nextFloat();
    print("Please enter object's width: ");
    val width = scanner.nextFloat();
    print("Please enter object's height: ");
    val height = scanner.nextFloat();

    print(box(length, width, height));
}

fun box(length: Float, width: Float, height: Float): String {
    val box3 = Box3();
    val box5 = Box5();

    var listBox = listOf<Box>(box3, box5);
    var validBox: String = "";
    for (box in listBox) {
        if (box.validBox(length, width, height)) {
            validBox = box.boxName();
            break;
        }
    }
    return validBox;
}
