package org.example.massive;
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
        System.out.println(maxAbs(arr));
    }
    public static int maxAbs(int[] arr){
        int length = arr.length;
        int tempi=0;
        for(int i=0;i< length;i++){
            if (Math.abs(arr[i]) >= Math.abs(tempi)){
                tempi = arr[i];
            }
        }
        return tempi;
    }
}
