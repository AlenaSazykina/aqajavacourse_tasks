package org.example.javacircul;
/*
Практика Java. Циклы #5

Длина числа. Дана следующая сигнатура метода:

public static int numLen(long x);

Необходимо реализовать метод таким образом,
чтобы он возвращал количество знаков в числе x.
x может принимать значения от 0 и выше.

Подсказка:
int у=123/10; // у будет иметь значение 12

Пример:
x=12567
результат: 5

 */
public class Task5 {
    public static void main (String[] arg){
        System.out.println(numLen(12567));
    }
    public static int numLen(long x) {
        if (x == 0) {
            return 1; // число 0 имеет 1 цифру
        }
        int count = 0;
        long absX = Math.abs(x); // на случай отрицательных чисел
        while (absX > 0) {
            absX /= 10; // делим число на 10, чтобы убрать последнюю цифру
            count++;
        }
        return count;
    }
}
