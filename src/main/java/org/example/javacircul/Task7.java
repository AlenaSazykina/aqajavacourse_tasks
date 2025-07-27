package org.example.javacircul;
/*
Практика Java. Циклы #7

<b>Квадрат. </b>Дана следующая сигнатура метода:

public static void square(int x);

Необходимо реализовать метод таким образом, чтобы он выводил на экран квадрат из символов ‘*’ размером <b>х</b>, у которого <b>х</b> символов в ряд и <b>х</b> символов в высоту. Подсказка: метод System.out.print выводит без перехода на следующую строку, в то время как System.out.println выводит с переходом.

Пример 1:
x=2
результат:
**
**

Пример 2:
x=4
результат:
****
****
****
****

 */
public class Task7 {
    public static void main(String[] arg){
        square(4);
    }
    public static void square(int len){
        for(int i=0;i < len; i++){
            for(int j = 0; j < len; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
