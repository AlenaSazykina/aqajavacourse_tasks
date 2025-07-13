package org.example.javaclassandmethod;

/*
Практика Java. Классы и методы. #9

Равенство. Дана следующая сигнатура метода:

public static boolean isEqual (int a, int b, int c);

Необходимо реализовать метод таким образом,
чтобы он возвращал true если все три полученных методом числа равны

Пример 1:
a=3 b=3 с=3
результат: true

Пример 2:
a=2 b=15 с=2
результат: false
 */

public class Task9 {

    public static void main(String[] args) {
        System.out.println(Task9.isEqual(8,8,8));
    }
    public static boolean isEqual (int a, int b, int c){
        if (a==b && a==c && b==c) {
            return true;
        }
        else{
            return false;
        }
    }
}
