package org.example.javaif;
/*
Практика Java. Условия #8

Тридцать пять. Дана следующая сигнатура метода:

public static boolean is35(int x);

Необходимо реализовать метод таким образом, чтобы он возвращал true, если число x делится нацело на 3 или 5. При этом, если оно делится и на 3, и на 5, то вернуть надо false. Подсказка: оператор % позволяет получить остаток от деления.

Пример 1:
x=5
результат: true

Пример 2:
x=8
результат: false

Пример 3:
x=15
результат: false

 */
public class Task8 {
    public static void main(String[] arg) {
        System.out.println(is35(5));
    }
    public static boolean is35(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return false;
        }
        else if (x % 3 == 0 || x % 5 == 0) {
            return true;
            }
        return false;
        }
    }
