package com.jc;

public class Test {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        if (a == 5) {
            System.out.println(b + c); // 25
            System.out.println("Hi"); // 25
        }

        if (a != 5) {
            System.out.println(b - c); // 5
        }
    }
}
