package org.example.javaif;
/*
Практика Java. Условия #3

Максимум. Дана следующая сигнатура метода:

public static int max(int x, int y);

Необходимо реализовать метод таким образом, чтобы он возвращал максимальное значение из двух полученных методом чисел. При реализации метода не использовать методы класса Math.

Пример 1:
x=5  y=7
результат: 7

Пример 2:
x=8  y=-1
результат: 8

 */
public class Task3 {
    public static void main (String[] arg){
        System.out.println(max(8,-1));
    }
    public static int max(int x, int y){
        if (x > y){
            return x;
        }
        return y;
    }
}
