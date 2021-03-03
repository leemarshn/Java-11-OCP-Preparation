package com.company;

public class StringTest {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Lee");
        StringBuilder secName = new StringBuilder(name.append(" N"));
//        name = name.append(" N");

        System.out.println(name);
    }
}
