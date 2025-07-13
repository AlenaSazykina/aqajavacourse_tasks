package org.example.testjavaif;

import org.example.javaif.Task6;

import static org.example.javaif.Task6.sum3;

public class TestTask6 {
    public static void main(String[] args) {
        // Массив тестовых данных: каждый элемент — массив из 3 чисел
        int[][] testInputs = {
                {1, 2, 3},     // ожидается true
                {5, 5, 10},    // ожидается true
                {2, 4, 7},     // ожидается false
                {0, 0, 0},     // ожидается true
                {-1, -2, -3},  // ожидается true
                {10, -10, 0},  // ожидается true
                {1, 4, 5},     // ожидается true
                {2, 2, 5}      // ожидается false
        };

        boolean[] expectedResults = {
                true,
                true,
                false,
                true,
                true,
                true,
                true,
                false
        };

        for (int i = 0; i < testInputs.length; i++) {
            int x = testInputs[i][0];
            int y = testInputs[i][1];
            int z = testInputs[i][2];

            boolean result = Task6.sum3(x, y, z);
            System.out.printf("sum3(%d, %d, %d) = %b (ожидается: %b)%n", x, y, z, result, expectedResults[i]);

            if (result != expectedResults[i]) {
                System.out.println("Тест не прошел!");
            } else {
                System.out.println("Тест прошел успешно.");
            }
        }
    }
}