package org.example.javaclassandmethod;

/*
Практика Java. Классы и методы. #5

Двузначное. Дана следующая сигнатура метода:

public static boolean is2Digits(int x);

Необходимо реализовать метод таким образом,
чтобы он принимал положительное число x и возвращал true если оно двузначное.

Пример 1:
x=32
результат: true

Пример 2:
x=516
результат: false
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println(Task5.is2Digits(32));
    }
    public static boolean is2Digits(int x){
        if (x>0){
            if (String.valueOf(x).length()==2) {
                return true;
            }
            else{
                return false;
                }
        }
        else{
            return false;
        }
    }
}
