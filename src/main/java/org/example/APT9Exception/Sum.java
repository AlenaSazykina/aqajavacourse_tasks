package org.example.APT9Exception;

public class Sum {

    public static void main(String[] args) {
        double total = sumStrings(args);
        System.out.println(total);
    }

    // Метод для суммирования чисел из массива строк
    public static double sumStrings(String[] args) {
        double sum = 0.0;
        for (String arg : args) {
            try {
                sum += Double.parseDouble(arg);
            } catch (NumberFormatException e) {
                // Нечисловой аргумент — считаем 0
            }
        }
        return sum;
    }
}
