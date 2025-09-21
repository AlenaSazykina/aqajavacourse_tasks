package org.example.massive;

import java.util.Arrays;

/*
Практика Java. Массивы #12
Добавление массива в
массив. Дана следующая сигнатура метода:

public static int[] add(int[] arr, int[] ins, int pos);
Необходимо реализовать метод таким образом, чтобы
он возвращал новый массив, который будет содержать все элементы массива arr, однако в позицию pos будут вставлены
значения массива ins.

Пример:
arr=[1,2,3,4,5]
ins=[7,8,9]
pos=3
результат: [1,2,3,7,8,9,4,5]
 */
public class Task12 {
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int[] ins = {7, 8, 9};
    int[] result = add(arr, ins, 3);
    System.out.println(Arrays.toString(result)); 
    }
    public static int[] add(int[] arr, int[] ins, int pos){
        int[] newArr = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, newArr, 0, pos);
        System.arraycopy(ins, 0, newArr, pos, ins.length);
        System.arraycopy(arr, pos, newArr, pos + ins.length, arr.length - pos);
        return newArr;
    }

}
