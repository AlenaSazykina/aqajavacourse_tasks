package org.example.javacircul;
/*
Практика Java. Циклы #1

Числа подряд. Дана следующая сигнатура метода:

public static String listNums(int x);

Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все числа от 0 до x (включительно). x может принимать значения от 0 и выше.

Пример:
x=5
результат: “0 1 2 3 4 5”

 */
public class Task1 {
    public static void main(String[] arg){
        System.out.println(listNums(5));
    }
    public static String listNums(int x){
        String res = "";
        for(int i=0; i<=x; i++){
            res+=i +" ";
        }
        return res;
    }
}
