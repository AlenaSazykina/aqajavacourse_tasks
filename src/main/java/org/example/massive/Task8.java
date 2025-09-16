package org.example.massive;
/*
Практика Java. Массивы #8

Объединение. Дана следующая сигнатура метода:

public static int[] concat(int[] arr1, int[] arr2);

Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором сначала идут элементы первого массива (arr1), а затем второго (arr2).

Пример:
arr1=[1,2,3]
arr2=[7,8,9]
результат: [1,2,3,7,8,9]

 */
public class Task8 {
public static void main(String[] args) {
    int[] arr1 = {1, 2, 3};
    int[] arr2 = {7, 8, 9};
    
    int[] merged = concat(arr1, arr2);
    System.out.println(java.util.Arrays.toString(merged)); // Выведет: [1, 2, 3, 7, 8, 9]
}

public static int[] concat(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length];
    
    // Копируем элементы из arr1 в результат
    for (int i = 0; i < arr1.length; i++) {
        result[i] = arr1[i];
    }
    
    // Копируем элементы из arr2, начиная с позиции arr1.length в результате
    for (int i = 0; i < arr2.length; i++) {
        result[arr1.length + i] = arr2[i];
    }
    
    return result;
}
}
