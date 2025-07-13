package org.example.javaif;

import static java.lang.String.*;

/*
Практика Java. Условия #4

Строка сравнения. Дана следующая сигнатура метода:

public static String makeDecision(int x, int y);

Необходимо реализовать метод таким образом, чтобы он возвращал строку, которая включает два принятых методом числа и корректно выставленный знак операции сравнения (больше, меньше, или равно).

Пример 1:
x=5  y=7
результат: “5 < 7”

Пример 2:
x=8  y=-1
результат: “8 > -1”

Пример 3:
x=4  y=4
результат: “4 == 4”

 */
public class Task4 {
    public static void main (String[] arg){
        System.out.println(makeDecision(9, 90));
    }
    public static String makeDecision(int x, int y) {
        if (x > y) {
            String more = x + " > " + y;
            return more;
        } else if (x == y) {
            String equal = x + " = " + y;
            return equal;
        }
        String less = x + " < " + y;
        return less;
    }
}
