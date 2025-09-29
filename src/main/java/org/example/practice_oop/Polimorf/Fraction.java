package org.example.practice_oop.Polimorf;


public class Fraction extends Number {
    private int num;    // числитель
    private int denum;  // знаменатель

    public Fraction(int num, int denum) {
        if (denum == 0) {
            throw new ArithmeticException("Знаменатель не может быть нулем");
        }
        this.num = num;
        this.denum = denum;
    }

    @Override
    public String toString() {
        return num + "/" + denum;
    }
    
    // Метод для получения значения как double
    @Override
    public double doubleValue() {
        return (double) num / denum;
    }

    // Метод для получения значения как float
    @Override
    public float floatValue() {
        return (float) num / denum;
    }

    // Метод для получения значения как long
    @Override
    public long longValue() {
        return (long) (num / denum); // целочисленное деление
    }

    // Метод для получения значения как int
    @Override
    public int intValue() {
        return num / denum; // целочисленное деление
    }
}
