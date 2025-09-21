package org.example.CollectionFramework10;
/*
Замена ArrayList на массив
Перед вами код метода: реализации сортировки «пузырьком».

Перепишите код, чтобы вместо списка ArrayList<Integer> intList использовался массив int[] intArray.

public static void bubbleSort(ArrayList<Integer> intList) {
for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int temp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, temp);
                }
            }
        }
}

public static void bubbleSort(int[] intArray) {
	// Реализовать сортировку для массива
}
 */

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмен элементов
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] intArray = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Исходный массив:");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        
        bubbleSort(intArray);
        
        System.out.println("\nОтсортированный массив:");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}


