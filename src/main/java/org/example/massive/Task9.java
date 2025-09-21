package org.example.massive;
/*
 Практика Java. Массивы #9
Все вхождения. Дана следующая сигнатура метода:

public static int[] findAll(int[] arr, int x);
Необходимо реализовать метод таким образом, чтобы
он возвращал новый массив, в котором записаны индексы всех вхождений числа x в массив arr.

Пример:
arr=[1,2,3,8,2,2,9]
x=2
результат: [1,4,5]
 */
import java.util.Arrays;

public class Task9 {

public static void main(String[] args) {
    int[] arr = {1, 2, 3, 8, 2, 2, 9};
    int x = 2;
    int[] indices = findAll(arr, x);
    System.out.println(Arrays.toString(indices)); // [1, 4, 5]
}

public static int[] findAll(int[] arr, int x) {
    // Количество вхождений x
    int count = 0;
    for (int value : arr) {
        if (value == x) {
            count++;
        }
    }
    // Mассив нужного размера
    int[] result = new int[count];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == x) {
            result[index++] = i;
        }
    }
    return result;
}
}

