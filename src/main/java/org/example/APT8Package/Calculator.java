package org.example.APT8Package;

import java.util.Scanner;

public class Calculator {

    // Метод для возведения числа X (в виде строки) в степень Y (в виде строки)
    public static double computePower(String X, String Y) {
        int base = parseInt(X);
        int exponent = parseInt(Y);
        return pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число (основание):");
        String inputBase = scanner.nextLine();

        System.out.println("Введите второе число (степень):");
        String inputExponent = scanner.nextLine();

        try {
            double result = computePower(inputBase, inputExponent);
            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введены некорректные числа.");
        }

        scanner.close();
    }

    // короткие статические методы для парсинга и возведения
    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }

    public static double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
