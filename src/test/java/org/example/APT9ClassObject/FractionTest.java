package org.example.APT9ClassObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    @Test
    public void testEquals() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = new Fraction(2, 3);
        Fraction f4 = new Fraction(1, 2);

        // Тестируем равенство одинаковых дробей
        assertTrue(f1.equals(f2));
        assertTrue(f1.equals(f4));

        // Тест на неравенство разных дробей
        assertFalse(f1.equals(f3));

        // Тест сравнения с null
        assertFalse(f1.equals(null));

        // Тест сравнения с объектом другого класса
        assertFalse(f1.equals("string"));
    }

    @Test
    public void testClone() {
        Fraction original = new Fraction(3, 4);
        Fraction clone = original.clone();

        // Проверяем равенство значений
        assertEquals(original, clone);

        // Проверяем, что это разные объекты
        assertNotSame(original, clone);

        // Меняем оригинал и убеждаемся, что клон не меняется
        original.num = 5;
        original.denum = 6;
        assertNotEquals(original, clone);
    }
}
