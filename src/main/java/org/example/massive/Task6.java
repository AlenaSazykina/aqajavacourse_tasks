package org.example.massive;

import java.util.Arrays;

/*
Практика Java. Массивы #6

Реверс. Дана следующая сигнатура метода:

public static void reverse(int[] arr);

Необходимо реализовать метод таким образом, чтобы он изменял массив arr. 
После проведенных изменений массив должен быть записан задом-наперед

Пример:
arr=[1,2,3,4,5]
результат: arr=[5,4,3,2,1]

 */
public class Task6 {
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    reverse(arr);
    System.out.println(Arrays.toString(arr)); // Выведет: [5, 4, 3, 2, 1]
}  


    public static void reverse(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[n - 1 - i];
        arr[n - 1 - i] = temp;
    }
}
}
