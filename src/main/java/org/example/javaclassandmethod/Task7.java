package org.example.javaclassandmethod;

/*
Практика Java. Классы и методы. #7(и здесь нужно подумать)

Диапазон. Дана следующая сигнатура метода:

public static boolean isInRange(int a, int b, int num);

Метод принимает левую и правую границу [a и b] некоторого числового диапазона.
Необходимо реализовать метод таким образом, чтобы он возвращал true,
если num входит в указанный диапазон (включая границы).
Обратите внимание, что отношение a и b заранее неизвестно (неясно кто из них больше, а кто меньше)

Пример 1:
a=5 b=1 num=3
результат: true

Пример 2:
a=2 b=15 num=33
результат: false
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(Task7.isInRange(2, 15, 33));
    }
    public static boolean isInRange(int a, int b, int num) {
        // Определяем минимальное и максимальное значение границ
        int min = Integer.min(a,b);
        int max = Integer.max(a,b);
        if (num >= min && num <= max) {
            // Проверяем, входит ли num в диапазон [min, max]
            return true;
        }
        else {
            return false;
        }
    }
}
