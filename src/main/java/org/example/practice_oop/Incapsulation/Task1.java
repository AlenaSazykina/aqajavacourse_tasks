package org.example.practice_oop.Incapsulation;
import org.example.practice_oop.Incapsulation.Fraction;

public class Task1 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);  // одна треть
        Fraction f2 = new Fraction(2, 5);  // две пятых
        Fraction f3 = new Fraction(7, 8);  // семь восьмых
        // Вычисление: f1 + f2 + f3 - 5
        Fraction result = f1.sum(f2).sum(f3).minus(5);

        System.out.println("Result: " + result); // вывод: результат

        
    }
}
