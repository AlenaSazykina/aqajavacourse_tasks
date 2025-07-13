package org.example.javaif;

import com.sun.jdi.PathSearchingVirtualMachine;

/*
Практика Java. Условия #5

Тройной максимум. Дана следующая сигнатура метода:

public static int max3(int x, int y, int z);

Необходимо реализовать метод таким образом, чтобы он возвращал максимальное из трех полученных методом чисел. Подсказка: идеальное решение включает всего две инструкции if и не содержит вложенных if. При реализации метода не использовать методы класса Math.

Пример 1:
x=5  y=7  z=7
результат: 7

Пример 2:
x=8  y=-1   z=4
результат: 8

 */
public class Task5 {
    public static void main (String[] arg){
        System.out.println(max3(-5, 44, 44));
    }
    public static int max3(int x, int y, int z) {
        int max = x; // x — максимум
        if (y > max) {
            max = y; // y больше текущего max
        }
        if (z > max) {
            max = z; // z больше текущего max
        }
        return max;
    }
}
