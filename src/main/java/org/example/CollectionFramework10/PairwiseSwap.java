package org.example.CollectionFramework10;

import java.util.Arrays;

public class PairwiseSwap {
    public static void main(String[] args) {
        int N = 6; 
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        for (int i = 0; i < N; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        System.out.println("Массив после перестановки: " + Arrays.toString(arr));
    }
}
