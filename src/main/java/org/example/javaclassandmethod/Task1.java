package org.example.javaclassandmethod;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
Задания по автоматизации тестирования
Практика Java. Классы и методы. #1

Дробная часть. Дана следующая сигнатура метода:

public static double fraction(double x);

Необходимо реализовать метод таким образом, чтобы он возвращал только дробную часть числа х. При выводе результата необходимо обеспечить точность вычислений — три знака после запятой Подсказка: вещественное число может быть преобразовано к целому путем отбрасывания дробной части.

Пример:
x=5,3
результат: 0,3

 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(Task1.fraction(5.3));
    }
    public static double fraction(double x) {
        double y = (int) x;
        double z = x % y;
        int scale = 3; // количество знаков после запятой
        BigDecimal bd = new BigDecimal(z);
        bd = bd.setScale(scale, RoundingMode.HALF_UP); // округление до ближайшего числа с указанной точностью
        return bd.doubleValue();
    }
}
