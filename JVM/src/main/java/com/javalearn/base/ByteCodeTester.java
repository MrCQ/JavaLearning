package com.javalearn.base;

public class ByteCodeTester {
    public static void main(String[] args) {
        int a = 12;
        int b = 21;
        int c = calc(a, b);
    }

    static int calc(int a, int b) {
        return (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
