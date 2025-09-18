package org.example.massive;
/*
Практика Java. Массивы #7

Возвратный реверс. Дана следующая сигнатура метода:

public static int[] reverseBack(int[] arr);

Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором значения массива arr записаны задом наперед.

Пример:
arr=[1,2,3,4,5]
результат: [5,4,3,2,1]

 */

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = reverseBack(arr);

        // Выводим результат
        System.out.println(Arrays.toString(result));
    }

        public static int[] reverseBack(int[] arr) {
        int length = arr.length;
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = arr[length - 1 - i];
        }
        return reversed;
    }
}
