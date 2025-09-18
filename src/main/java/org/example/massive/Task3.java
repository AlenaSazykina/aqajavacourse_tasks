package org.example.massive;

import java.util.Arrays;

/*
Практика Java. Массивы #3

Поиск максимального. Дана следующая сигнатура метода:

public static int maxAbs(int[] arr);

Необходимо реализовать метод таким образом, чтобы он возвращал наибольшее по модулю (то есть без учета знака) значение массива arr.

Пример:
arr=[1,-2,-7,4,2,2,5]
результат: -7

 */
public class Task3 {
    public static void main (String [] arg){
        int [] arr = {1,-2,-7,4,2,2,-100};
        int maxAbsElement = maxAbs(arr);
        System.out.println(maxAbsElement);
    }
    public static int maxAbs(int[] arr) {
    int maxAbsValue = Math.abs(arr[0]);
        int result = arr[0]; // элемент массива с max по модулю

        for (int i = 1; i < arr.length; i++) {
            int currentAbs = Math.abs(arr[i]);
            if (currentAbs > maxAbsValue) {
                maxAbsValue = currentAbs;
                result = arr[i]; // сохраняем элемент, не модуль!
            }
        }
        return result; // возвращаем элемент массива
    }
}
