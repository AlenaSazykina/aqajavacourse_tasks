package org.example.massive;
/*
Практика Java. Массивы #4

Подсчет позитива. Дана следующая сигнатура метода:

public static int countPositive(int[] arr);

Необходимо реализовать метод таким образом, чтобы он возвращал количество положительных элементов массива arr.

Пример:
arr=[1,-2,-7,4,2,2,5]
результат: 5

 */
public class Task4 {
    public static void main (String[] arg){
        int [] arr = {1,-2,-7,2,2,2,5};
        System.out.println(countPositive(arr));
    }
    public static int countPositive(int[] arr){
        int length = arr.length;
        int count = 0;
        for (int i = 0; i < length; i++ ){
            if (arr[i] > 0){
                count +=1;
            }
        }
        return count;
    }
}
