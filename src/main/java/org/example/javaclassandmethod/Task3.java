package org.example.javaclassandmethod;
/*
Практика Java. Классы и методы. #3

Букву в число. Дана следующая сигнатура метода:

Метод принимает символ х, который представляет собой один из “0 1 2 3 4 5 6 7 8 9”. Необходимо реализовать метод таким образом, чтобы он преобразовывал символ в соответствующее число. При реализации метода не использовать методы класса Character. Подсказка: код символа ‘0’ — это число 48

Пример:
x=’3’
результат: 3
*/
public class Task3 {
    public static void main(String[] args) {
        System.out.println(Task3.charToNum('9'));
    }
    public static int charToNum(char x) {
        if ((int)x >= 48 && (int)x <= 57){
            int px = x - '0';
            return px;
        }
        else
        {
            return 500;
        }
    }
}
