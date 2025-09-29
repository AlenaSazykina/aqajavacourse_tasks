package org.example.practice_oop.Polimorf;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FractionTest {

    @Test
    public void testToString() {
        Fraction frac = new Fraction(3, 4);
        assertEquals("3/4", frac.toString());
    }
    
    @Test
    public void testDoubleValue() {
        Fraction frac = new Fraction(1, 2);
        assertEquals(0.5, frac.doubleValue(), 0.0001);
    }
    
    @Test
    public void testFloatValue() {
        Fraction frac = new Fraction(1, 4);
        assertEquals(0.25f, frac.floatValue(), 0.0001f);
    }

    @Test
    public void testLongValue() {
        Fraction frac = new Fraction(7, 3);
        // 7/3 = 2 (целочисленное деление)
        assertEquals(2L, frac.longValue());
    }

    @Test
    public void testIntValue() {
        Fraction frac = new Fraction(10, 3);
        // 10/3 = 3 (целочисленное деление)
        assertEquals(3, frac.intValue());
    }

    @Test
    public void testZeroDenominator() {
        assertThrows(ArithmeticException.class, () -> {
            new Fraction(1, 0);
        });
    }
}
