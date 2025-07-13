package org.example.javaclassandmethod;

/*
Практика Java. Классы и методы. #8

Делитель. Дана следующая сигнатура метода:

public static boolean isDivisor (int a, int b);

Необходимо реализовать метод таким образом,
чтобы он возвращал true если любое из принятых чисел делит другое нацело.

Пример 1:
a=3 b=6
результат: true

Пример 2:
a=2 b=15
результат: false
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(Task8.isDivisor(2,15));
    }
    public static boolean isDivisor (int a, int b){
        if (a%b==0 || b%a==0){
            return true;
        }
        else{
            return false;
        }
    }
}
