package org.example.javaif;

/*
Практика Java. Условия #2

Безопасное деление. Дана следующая сигнатура метода:

public static int safeDiv(int x, int y);

Необходимо реализовать метод таким образом, чтобы он возвращал деление x на y, и при этом гарантировал, что не будет выкинута ошибка деления на 0. При делении на 0 следует вернуть из метода число 0. Подсказка: смотри ограничения на операции типов данных.

Пример 1:
x=5  y=0
результат: 0

Пример 2:
x=8  y=2
результат: 4

 */

public class Task2 {
    public static void main(String[] args) {
        System.out.println(safeDiv(8,2));
    }
    public static int safeDiv(int x, int y){
        if (y==0){
            return 0;
        }
        return x/y;
    }
}
