package org.example.javaif;

import org.jetbrains.annotations.NotNull;

/*
Практика Java. Условия #10

Возраст. Дана следующая сигнатура метода:

public static String age(int x);

Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой сначала будет число х, а затем одно из слов:

    год
    года
    лет

Слово “год” добавляется, если число х заканчивается на 1, кроме чисел оканчивающихся на 11.
lastNumber
twolastNumber

Слово “года” добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел оканчивающихся на 12, 13, 14.

Слово “лет” добавляется во всех остальных случаях.

Подсказка: оператор % позволяет получить остаток от деления.

Пример 1:
x=5
результат: “5 лет”

Пример 2:
x=31
результат: “31 год”

Пример 3:
x=44
результат: “44 года”
 */
public class Task10 {
    public static void main (String[] arg){
        System.out.println(age(5));
    }
    public static @NotNull String age(int x){
        int lastNumber = lastNumber(x);
        int twolastNumber = twolastNumber(x);
        if (lastNumber == 1 || twolastNumber == 11){
            return x + " год";
        }
        else if (lastNumber == 2 || twolastNumber == 12) {
            return x + " годa";
        }
        else if (lastNumber == 3 || twolastNumber == 13) {
            return x + " годa";
        }
        else if (lastNumber == 4 || twolastNumber == 14) {
            return x + " годa";
        }
        return x + " лет";

    }
    public static int lastNumber(int x){
        return x % 10;
    }

    public static int twolastNumber(int x){
        return x % 100;
    }

}
