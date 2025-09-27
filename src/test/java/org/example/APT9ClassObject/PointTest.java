package org.example.APT9ClassObject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    @Test
    public void testEquals() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(2, 3);

        assertTrue(p1.equals(p2));
        assertFalse(p1.equals(p3));
        assertFalse(p1.equals(null));
        assertFalse(p1.equals("string")); // другой тип
    }

    @Test
    public void testClone() {
        Point p1 = new Point(5, 10);
        Point p2 = p1.clone();

        assertEquals(p1, p2);
        assertNotSame(p1, p2);

        // Изменяем оригинал и проверяем, что клонированный объект не изменился
        p1.x = 7;
        p1.y = 14;

        assertNotEquals(p1, p2);
    }
}
