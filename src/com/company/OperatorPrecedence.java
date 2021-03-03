package com.company;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int a =1;
        int b = 2;
        int c = a++;
        int d = c +2;

        System.out.println(a);
        System.out.println("d = " + d);
    }
}
