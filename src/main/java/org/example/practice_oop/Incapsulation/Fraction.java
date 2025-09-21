package org.example.practice_oop.Incapsulation;
/*
 Практика ООП. Инкапсуляция #1. Дробь
Создайте класс Дробь (Fraction) со следующими особенностями:

Имеет числитель (numerator): целое число
Имеет знаменатель (denominator): целое число
Дробь может быть создана с указанием числителя и знаменателя
Объекты дробей не могут изменять свое состояние
Для числителя задать отрицательное значение можно, в этом случае вся дробь считается отрицательной
Для знаменателя отрицательное значение недопустимо
Может вернуть строковое представление вида “числитель/знаменатель” (toString)
Может выполнять операции сложения, вычитания с другой Дробью или целым числом. Результатом операции должна быть новая Дробь
Затем необходимо выполнить следующие задачи:

Создать несколько экземпляров дробей
Посчитать f1.sum(f2).sum(f3).minus(5), где f1 это одна треть, f2 две пятых, а f3 это семь восьмых
 */
/* 
Давайте реализуем класс Fraction с указанными требованиями, а затем выполним заданную последовательность действий.

Основные моменты реализации:
Иммутабельность: все поля final, изменить состояние объекта нельзя.
Конструктор: принимает числитель и знаменатель, проверяет, чтобы знаменатель был положительным, и соответственно задаёт знак дроби.
Методы: sum, minus, и toString.
Внутренние операции: реализуем приватный метод для сокращения дроби, если нужно.
Реализация класса Fraction
*/

public class Fraction {
    private final int numerator;
    private final int denominator;

    // Конструктор
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть нулём");
        }
        // Знак дроби зависит только от числителя
        if (denominator < 0) {
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Вспомогательный конструктор для создания дроби из целого числа (знаменатель 1)
    public Fraction(int numerator) {
        this(numerator, 1);
    }

    // Метод для сложения с другой дробью
    public Fraction sum(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator).reduce();
    }

    // Метод для сложения с целым числом
    public Fraction sum(int number) {
        return this.sum(new Fraction(number));
    }

    // Метод для вычитания с другой дробью
    public Fraction minus(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator).reduce();
    }

    // Метод для вычитания с целым числом
    public Fraction minus(int number) {
        return this.minus(new Fraction(number));
    }

    // Метод возвращает строковое представление
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Метод для сокращения дроби
    private Fraction reduce() {
        int gcd = gcd(Math.abs(numerator), denominator);
        return new Fraction(numerator / gcd, denominator / gcd);
    }

    // Нахождение НОД (алгоритм Евклида)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
//Использование
//Создадим дроби и выполним заданную цепочку:


/* Итог
Реализован класс Fraction, который инкапсулирует данные и операции над дробью.
Все объекты иммутабельны.
Можно складывать и вычитать дроби и целые числа, получая новые объекты.
Если нужно, я могу дополнительно помочь с примерами или расширенной функциональностью!
*/