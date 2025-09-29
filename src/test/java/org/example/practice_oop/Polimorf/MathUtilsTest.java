package org.example.practice_oop.Polimorf;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    
    @Test
    public void testSumAll1() {
        Fraction f1 = new Fraction(3, 5);  
        Integer i = 2;                     
        Double d = 2.3;                     

        double result = MathUtils.sumAll(f1, i, d);
        assertEquals(4.9, result, 0.0001);
    }

    @Test
    public void testSumAll2() {
        Fraction f1 = new Fraction(49, 12);
        Fraction f2 = new Fraction(3, 2);      
        Integer i = 3;                      
        Double d = 6.3;                     

        double result = MathUtils.sumAll(f1,f2, i, d);
        assertEquals(14.883333333333333, result, 0.0001);
    }

    @Test
    public void testSumAll3() {
        Fraction f1 = new Fraction(1, 3);     
        Integer i = 3;                                         

        double result = MathUtils.sumAll(f1, i);
        assertEquals(3.333333333333333, result, 0.0001);
    }

    @Test
    public void testSumAllWithNulls() {
        Fraction f1 = new Fraction(1, 2);
        Double d = null; // пропускается
        double result = MathUtils.sumAll(f1, d);
        assertEquals(0.5, result, 0.0001);
    }
    
    @Test
    public void testSumAllEmpty() {
        assertEquals(0.0, MathUtils.sumAll(), 0.0001);
    }
}
