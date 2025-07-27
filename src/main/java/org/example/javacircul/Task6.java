package org.example.javacircul;
/*
Практика Java. Циклы #6

Одинаковость. Дана следующая сигнатура метода:

public static boolean equalNum(int x);

Необходимо реализовать метод таким образом, чтобы он возвращал true, если все знаки числа одинаковы, и false в ином случае.

Подсказки:

int x=123%10; // х будет иметь значение 3

int у=123/10; // у будет иметь значение 12

Пример 1:
x=1111
результат: true

Пример 2:
x=1211
результат: false

 */
public class Task6 {
    public static void main(String[] arg){
        System.out.println(equalNum(1111111111));
    }
    public static boolean equalNum(int x){
        int lenx = String.valueOf(x).length();
        int digit = (int) (x/Math.pow(10, lenx-1))%10;
        int count = 1;
        for (int i = 0; i < lenx; i++){
            int digit1 = (int) (x/Math.pow(10, lenx-2-i))%10;
            if (digit == digit1){
                count += 1;
            }
            else{
                count += 0;
            }
            digit = digit1;
        }
        return count == lenx;
    }
}
