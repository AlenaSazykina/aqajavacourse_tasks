package org.example.javaclassandmethod;

/*
Большая буква. Дана следующая сигнатура метода:

public static boolean isUpperCase(char x);

Необходимо реализовать метод таким образом, чтобы он принимал символ x и возвращал true если это большая буква в диапазоне от ‘A’ до ‘Z’. При реализации метода не использовать методы класса Character.

Пример 1:
x=’D’
результат: true

Пример 2:
x=’q’
результат: false
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(Task6.isUpperCase('B'));
    }
    public static boolean isUpperCase(char x){
        if ((int)x >= 65 && (int)x <= 92) {
            return true;
        }
        if ((int)x >= 97 && (int)x <= 122){
            return false;
        }
        else{
            return false;
        }
    }
}
