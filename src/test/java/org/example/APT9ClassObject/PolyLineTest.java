package org.example.APT9ClassObject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PolyLineTest {

    @Test
    public void testEquals() {
        Point p1 = new Point(0,0);
        Point p2 = new Point(1,1);
        Point p3 = new Point(2,2);

        PolyLine line1 = new PolyLine(p1, p2, p3);
        PolyLine line2 = new PolyLine(
            new Point(0,0),
            new Point(1,1),
            new Point(2,2)
        );
        PolyLine line3 = new PolyLine(p1, p3);

        assertTrue(line1.equals(line2));
        assertFalse(line1.equals(line3));
        assertFalse(line1.equals(null));
    }

    @Test
    public void testHashCode() {
        Point p1 = new Point(0,0);
        Point p2 = new Point(1,1);

        PolyLine line1 = new PolyLine(p1, p2);
        PolyLine line2 = new PolyLine(
            new Point(0,0),
            new Point(1,1)
        );

        assertEquals(line1.hashCode(), line2.hashCode());
    }

    @Test
    public void testLength() {
        // Точки, формирующие треугольник
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(3, 4);

        PolyLine line = new PolyLine(p1, p2, p3);

        // Расчет ожидаемой длины: 
        // От (0,0) до (3,0) = 3
        // От (3,0) до (3,4) = 4
        // Общая длина = 3 + 4 = 7
        double expectedLength = 7.0;

        assertEquals(expectedLength, line.length(), 1e-9);
    }
}
