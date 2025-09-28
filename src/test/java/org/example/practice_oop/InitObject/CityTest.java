package org.example.practice_oop.InitObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class CityTest {

    private City A, B, C, D, E, F;

    @BeforeEach
    public void setUp() {
        A = new City("A");
        B = new City("B");
        C = new City("C");
        D = new City("D");
        E = new City("E");
        F = new City("F");

        B.addPath(C, 20);
        B.addPath(A, 10);

        C.addPath(F, 25);
        C.addPath(E, 15);

        A.addPath(B, 10);
        A.addPath(D, 20);

        F.addPath(A, 5);
    }

    @Test
    public void testAddPathAndToString() {
        String expectedB = "B -> [C: 20, A: 10]";
        assertEquals(expectedB, B.toString());

        String expectedA = "A -> [B: 10, D: 20]";
        assertEquals(expectedA, A.toString());
    }

    @Test
    public void testTravelByOneStep() {
        City result = B.travelBy(1);
        assertNotNull(result);
        assertEquals("C", result.getName());
    }

    @Test
    public void testTravelByMultipleSteps() {
        City result2 = B.travelBy(2);
        assertNotNull(result2);
        assertEquals("F", result2.getName());

        City result3 = B.travelBy(3);
        assertNotNull(result3);
        assertEquals("A", result3.getName());
    }

    @Test
    public void testTravelByNoPaths() {
        // D и E не имеют путей
        assertNull(D.travelBy(1));
        assertNull(E.travelBy(1));
    }

    @Test
    public void testTravelByZeroSteps() {
        // Путь из города в себя при 0 переходов
        assertEquals("B", B.travelBy(0).getName());
        assertEquals("D", D.travelBy(0).getName());
    }
}
