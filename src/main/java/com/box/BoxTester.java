package com.box;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoxTester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter object's length: ");
        float length = scanner.nextFloat();
        System.out.print("Please enter object's width: ");
        float width = scanner.nextFloat();
        System.out.print("Please enter object's height: ");
        float height = scanner.nextFloat();

        System.out.println(box(length, width, height));

    }

    public static String box(float length, float width, float height) {
        Box box3 = new Box3();
        Box box5 = new Box5();

        List<Box> listBox = new ArrayList<>();
        listBox.add(box3);
        listBox.add(box5);

        String validBox = "";
        for (Box box : listBox) {
            if (box.validate(length, width, height)) {
                validBox += box.BoxName();
                break;
            }
        }

        return validBox;
    }

}
