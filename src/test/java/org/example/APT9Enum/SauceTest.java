package org.example.APT9Enum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SauceTest {

    @Test
    public void testGetName() {
        Sauce sauce = new Sauce("Mayo", Sauce.Spiciness.NOT_SPICY);
        assertEquals("Mayo", sauce.getName());
    }

    @Test
    public void testToString() {
        Sauce sauce = new Sauce("Sweet", Sauce.Spiciness.NOT_SPICY);
        assertEquals("Соус Sweet: не острый", sauce.toString());
    }

    @Test
    public void testGetSpiciness() {
        Sauce sauce = new Sauce("HotSauce", Sauce.Spiciness.VERY_SPICY);
        assertEquals(Sauce.Spiciness.VERY_SPICY, sauce.getSpiciness());
    }

    @Test
    public void testCreateSauce() {
        Sauce sauce = new Sauce("Tomato", Sauce.Spiciness.SPICY);
        assertEquals("Соус Tomato: острый", sauce.toString());
    }

    @Test
    public void testCreateSauceWithVerySpicy() {
        Sauce sauce = new Sauce("Chili", Sauce.Spiciness.VERY_SPICY);
        assertEquals("Соус Chili: очень острый", sauce.toString());
    }

    @Test
    public void testCreateSauceWithNotSpicy() {
        Sauce sauce = new Sauce("Mild", Sauce.Spiciness.NOT_SPICY);
        assertEquals("Соус Mild: не острый", sauce.toString());
    }

    @Test
    public void testCreateSauceWithEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Sauce("", Sauce.Spiciness.SPICY);
        });
    }

    @Test
    public void testCreateSauceWithNullName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Sauce(null, Sauce.Spiciness.SPICY);
        });
    }
}
