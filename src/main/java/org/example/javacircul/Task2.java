package org.example.javacircul;
/*
Практика Java. Циклы #2

Числа наоборот. Дана следующая сигнатура метода:

public static String reverseListNums(int x);

Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все числа от x до 0 (включительно). x может принимать значения от 0 и выше.

Пример:
x=5
результат: “5 4 3 2 1 0”

 */
public class Task2 {
    public static void main(String[] arg){
        System.out.println(reverseListNums(5));
    }
    public static String reverseListNums(int x){
        String res = "";
        for(int i=x; i>=0; i--){
            res+= i + " ";
        }
        return res;
    }
}
