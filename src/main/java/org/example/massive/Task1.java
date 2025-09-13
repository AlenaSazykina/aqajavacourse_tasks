package org.example.massive;
/*
Практика Java. Массивы #1
Поиск первого значения. Дана следующая сигнатура метода:

public static int findFirst(int[] arr, int x);
Необходимо реализовать метод таким образом, чтобы он возвращал индекс первого вхождения числа x в массив arr. Если число не входит в массив – возвращается -1.

Пример:
arr=[1,2,3,4,2,2,5]
x=2
результат: 1
 */

import org.jetbrains.annotations.NotNull;

public class Task1 {
    public static void main (String [] arg){
        int arr [] = {8,8,3,4,5};
        System.out.println(findFirst(arr, 10));
    }
    public static int findFirst(int @NotNull [] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // возвращаем первый найденный индекс
            }
        }
        return -1; // если элемент не найден
    }
}
