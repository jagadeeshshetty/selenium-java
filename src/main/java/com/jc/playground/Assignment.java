package com.jc.playground;

public class Assignment {
    public static void main(String[] args) {
        assignment1();
    }

    static void assignment1() {
        int a = 5;
        int b = 12;
        int c = 15;

        // c is bigger
        if (a > b && a > c) {
            System.out.println("a is bigger.");
        } else if (b > a && b > c) {
            System.out.println("b is bigger");
        } else {
            System.out.println("c is bigger.");
        }
    }
}
