package org.example.javaif;
/*
Практика Java. Условия #11

День недели. Дана следующая сигнатура метода:

public static String day(int x);

Метод принимает число x, обозначающее день недели.
Необходимо реализовать метод таким образом, чтобы он возвращал строку,
которая будет обозначать текущий день недели, где 1- это понедельник, а 7 – воскресенье.
Если число не от 1 до 7 то верните текст “это не день недели”.
Вместо if в данной задаче используйте switch.

Пример:
x=5
результат: “пятница”

 */
public class Task11 {
    public static void main(String[] arg){
        System.out.println(day(7));
    }
    public static String day(int x){
        switch(x) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресение";
            default:
                return "это не день недели";
        }
    }
}
