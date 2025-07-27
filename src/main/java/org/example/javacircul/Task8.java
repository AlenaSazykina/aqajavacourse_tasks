package org.example.javacircul;
/*
Практика Java. Циклы #8

Левый треугольник. Дана следующая сигнатура метода:

public static void leftTriangle(int x);

Необходимо реализовать метод таким образом, чтобы он выводил на экран треугольник из символов ‘*’ у которого х символов в высоту, а количество символов в ряду совпадает с номером строки.

Пример 1:
x=2
результат:
*
**

Пример 2:
x=4
результат:
*
**
***
****

 */
public class Task8 {
    public static void main(String[] arg){
        leftTriangle(4);
    }
    public static void leftTriangle(int len){
        for(int i = 0;i < len; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
                }
            System.out.println();
        }
    }
}
