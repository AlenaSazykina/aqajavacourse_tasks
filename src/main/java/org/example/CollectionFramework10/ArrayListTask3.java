/*
Задача #3. Замена массива на ArrayList
Перед вами код метода, который переставляет числа в массиве в обратном порядке.

public static void reverse(int[] intArray) {
        int n = intArray.length - 1;
        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[n - i];
            intArray[n - i] = temp;
        }
    }
Задача: написать такой же метод для ArrayList<Integer>. 
 */

package org.example.CollectionFramework10;


import java.util.ArrayList;
import java.util.List;

public class ArrayListTask3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println("До: " + list);
        reverse(list);
        System.out.println("После: " + list);
    }

    public static void reverse(List<Integer> list) {
        int n = list.size() - 1;
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(n - i));
            list.set(n - i, temp);
        }
    }
}

