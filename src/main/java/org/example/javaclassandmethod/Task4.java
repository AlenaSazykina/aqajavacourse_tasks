package org.example.javaclassandmethod;

/*
Практика Java. Классы и методы. #4

Есть ли позитив. Дана следующая сигнатура метода:

public static boolean isPositive(int x);

  Необходимо реализовать метод таким образом, чтобы он принимал число x и возвращал true если оно положительное.

Пример 1:
x=3
результат: true

Пример 2:
x=-5
результат: false
 */

public class Task4 {
    public static void main(String[] args) {
        System.out.println(Task4.isPositive(0));
    }
    public static boolean isPositive(int x){
        if (x>0){
            return true;
        }
        else{
            return false;
        }
    }
}
