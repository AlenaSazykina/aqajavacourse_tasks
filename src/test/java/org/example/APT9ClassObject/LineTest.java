package org.example.APT9ClassObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LineTest {

    @Test
    public void testEquals() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(0, 0);
        Point p4 = new Point(1, 1);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);
        Line line3 = new Line(new Point(2, 2), new Point(3, 3));

        assertTrue(line1.equals(line2));
        assertFalse(line1.equals(line3));
        assertFalse(line1.equals(null));
        assertFalse(line1.equals("string")); // проверка типа
    }

    @Test
    public void testClone() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line line1 = new Line(p1, p2);
        Line cloneLine = line1.clone();

        // Проверка равенства
        assertEquals(line1, cloneLine);
        // Объекты не должны быть одинаковыми
        assertNotSame(line1, cloneLine);
        // Также точки внутри линий должны быть разными объектами
        assertNotSame(line1.start, cloneLine.start);
        assertNotSame(line1.end, cloneLine.end);

        // Изменяем оригинальные точки
        line1.start.x = 10;
        line1.start.y = 20;

        // Клон должен остаться неизменным
        assertNotEquals(line1.start, cloneLine.start);
    }
}