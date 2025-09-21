package org.example.massive;
/*
Практика Java. Массивы #10
Удалить негатив. Дана следующая сигнатура метода:

public static int[] deleteNegative(int[] arr);
Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором записаны все элементы массива arr кроме отрицательных.

Пример:
arr=[1,2,-3,4,-2,2,-5]
результат: [1,2,4,2]
 */
public class Task10 {
public static void main(String[] args) {
    int[] arr = {1, 2, -3, 4, -2, 2, -5};
    int[] filtered = deleteNegative(arr);
    System.out.println(java.util.Arrays.toString(filtered));  // [1, 2, 4, 2]
}

public static int[] deleteNegative(int[] arr) {
    // Считаем количество ненегативных элементов
    int count = 0;
    for (int num : arr) {
        if (num >= 0) {
            count++;
        }
    }

    // Создаем новый массив нужного размера
    int[] result = new int[count];
    int idx = 0;

    // Записываем все ненегативные элементы в новый массив
    for (int num : arr) {
        if (num >= 0) {
            result[idx++] = num;
        }
    }

    return result;
}    
}
