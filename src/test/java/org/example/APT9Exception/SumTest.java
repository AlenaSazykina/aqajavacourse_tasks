package org.example.APT9Exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SumTest {

    @Test
    public void testSumStrings() {
        // Тест с валидными и невалидными числами
        String[] input = {"10", "3qq4", "1"};
        double result = Sum.sumStrings(input);
        
        assertEquals(11.0, result, 0.0001);
    }

    @Test
    public void testEmptyInput() {
        String[] input = {};
        double result = Sum.sumStrings(input);
        
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testAllInvalid() {
        String[] input = {"abc", "qwe", "!!!"};
        double result = Sum.sumStrings(input);
        
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testNegativeAndDecimal() {
        String[] input = {"-2.5", "3.5"};
        double result = Sum.sumStrings(input);
        
        assertEquals(1.0, result, 0.0001);
    }
}