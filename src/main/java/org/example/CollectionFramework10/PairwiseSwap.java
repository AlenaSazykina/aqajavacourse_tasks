/*
Задача #1. Попарные перестановки
Задайте лист размерностью N, где N — чётное число, а содержимое — числа от 1 до N.

Поменяйте местами попарно его элементы. То есть первый со вторым, третий с четвёртым и т.д.
 */

package org.example.CollectionFramework10;

import java.util.ArrayList;
import java.util.List;

public class PairwiseSwap {
    public static void main(String[] args) {
        int N = 6; // длина списка
        List<Integer> list = new ArrayList<>();

        // Инициализация списка числами от 1 до N
        for (int i = 0; i < N; i++) {
            list.add(i + 1);
        }

        System.out.println("Исходный список: " + list);

        // Перестановка элементов попарно
        for (int i = 0; i < list.size() - 1; i += 2) {
            int temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }

        System.out.println("Список после перестановки: " + list);
    }
}
