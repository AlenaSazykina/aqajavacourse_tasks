package org.example.testjavaif;

import org.example.javaif.Task5;


public class TestTask5 {
    public static void main(String[] args) {
        // Массив тестовых данных: каждый элемент — массив из 3 чисел
        int[][] testInputs = {
                {5, 7, 7},     // ожидается 7
                {8, -1, 4}    // ожидается 8

        };

        int [] expectedResults = {
                7,
                8
        };

        for (int i = 0; i < testInputs.length; i++) {
            int x = testInputs[i][0];
            int y = testInputs[i][1];
            int z = testInputs[i][2];

            int result = Task5.max3(x, y, z);
            System.out.printf("sum3(%d, %d, %d) = %d (ожидается: %d)%n", x, y, z, result, expectedResults[i]);

            if (result != expectedResults[i]) {
                System.out.println("Тест не прошел!");
            } else {
                System.out.println("Тест прошел успешно.");
            }
        }
    }
}
