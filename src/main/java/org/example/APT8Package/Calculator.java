package org.example.APT8Package;

public class Calculator {

    // Метод для возведения числа X (в виде строки) в степень Y (в виде строки)
    public static double computePower(String X, String Y) {
        // короткие имена методов
        int base = parseInt(X);
        int exponent = parseInt(Y);
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        double result = computePower(args[0], args[1]);
        System.out.println("Результат: " + result);
    }

    // короткие статические методы для парсинга и возведения
    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }

    public static double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}