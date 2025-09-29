package org.example.practice_oop.Polimorf;

public class MathUtils {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(49, 12);
        Fraction f2 = new Fraction(3, 2);      
        Integer i = 3;                      
        Double d = 6.3; 

        Fraction f3 = new Fraction(3, 5);  
        Integer i1 = 2;                     
        Double d1 = 2.3;  
        
        Fraction f4 = new Fraction(1, 3);     
        Integer i2 = 3;                                         

        double result = MathUtils.sumAll(f3, i1, d1);
        double result1 = MathUtils.sumAll(f1, f2, i, d);
        double result2 = MathUtils.sumAll(f4, i2);
        System.out.println("Сумма: " + result); 
        System.out.println("Сумма: " + result1); 
        System.out.println("Сумма: " + result2); 
    }
    /**
     * Считает сумму всех переданных чисел.
     * @param values варьируемое число аргументов Number
     * @return сумма в виде double
     */
    public static double sumAll(Number... values) {
        double sum = 0.0;
        for (Number num : values) {
            if (num != null) {
                sum += num.doubleValue();
            }
        }
        return sum;
    }
}