package org.example.massive;
/*
Практика Java. Массивы #2

Поиск последнего значения. Дана следующая сигнатура метода:

public static int findLast(int[] arr, int x);

Необходимо реализовать метод таким образом, чтобы он возвращал индекс последнего вхождения числа x в массив arr. Если число не входит в массив – возвращается -1.

Пример:
arr=[1,2,3,4,2,2,5]
x=2
результат: 5

 */
public class Task2 {
    public static void main(String[] arg){
        int arr[] ={1,2,3,4,2,2,5};
        System.out.println(findLast(arr,11));
    }
    public static int findLast(int [] arr, int x) {
        int length = arr.length;
        for (int i = length-1;i <= length && i > -1; i--) {
            if (arr[i] == x) {
                return i; // возвращаем последний найденный индекс
            }
        }
        return -1; // если элемент не найден
    }
}
