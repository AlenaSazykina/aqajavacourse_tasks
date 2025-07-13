package org.example.javaif;
/*
Практика Java. Условия #6

Тройная сумма. Дана следующая сигнатура метода:

public static boolean sum3(int x, int y, int z);

Необходимо реализовать метод таким образом, чтобы он возвращал true, если два любых числа (из трех принятых) можно сложить так, чтобы получить третье.

Пример 1:
x=5  y=7  z=2
результат: true

Пример 2:
x=8  y=-1   z=4
результат: false

 */
public class Task6 {
    public static void main (String[] arg){
        System.out.println(sum3(5,7,2));
        System.out.println(sum3(8,-1,4));
    }
    public static boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }
}
