package org.example.javacircul;

/*
Практика Java. Циклы #4

Степень числа. Дана следующая сигнатура метода:

public static int pow(int x, int y);

Необходимо реализовать метод таким образом, чтобы он возвращал результат возведения x в степень y.

Подсказка: для получения степени необходимо умножить единицу на число x,
и сделать это y раз, т.е. два в третьей степени это 1*2*2*2

Пример:
x=2
y=5
результат: 32

 */
public class Task4 {
    public static void main (String[] arg){
        System.out.println(pow(5,2));
    }
    public static int pow(int x, int y){
        int result = 1;
        for(int i=0;i < y;i++){
            result *= x;
        }
        return result;
    }
}
