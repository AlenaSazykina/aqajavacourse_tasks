package org.example.javaclassandmethod;
/*    Практика Java. Классы и методы. #2(Нужно подумать)

Сумма знаков. Дана следующая сигнатура метода:

public static int sumLastNums(int x);

Необходимо реализовать метод таким образом, чтобы он возвращал результат сложения двух последних знаков числа х, предполагая, что знаков в числе не менее двух. Подсказки:

int x=123%10; // х будет иметь значение 3
int у=123/10; // у будет иметь значение 12

Пример:
x=4568
результат: 14
*/
public class Task2 {
    public static void main(String[] args) {
        System.out.println(Task2.sumLastNums(1789));
    }
    public static int sumLastNums(int x) {
        // Получаем последние две цифры числа
        int lastDigit = Math.abs(x) % 10; // абсолютное значение, чтобы учесть отрицательные числа
        int secondLastDigit = (Math.abs(x) / 10) % 10;

        // Возвращаем сумму двух последних цифр
        return lastDigit + secondLastDigit;
    }
}
