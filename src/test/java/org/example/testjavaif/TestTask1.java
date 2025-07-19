package org.example.testjavaif;

import static org.example.javaif.Task1.abs;

public class TestTask1 {
    // Для тестирования
    public static void main(String[] args) {
        System.out.println(abs(5));    // 5
        System.out.println(abs(-5));   // 5
        System.out.println(abs(0));    // 0
        System.out.println(abs(-123));// 123
        System.out.println(abs(-786970));// 786970
    }
}
