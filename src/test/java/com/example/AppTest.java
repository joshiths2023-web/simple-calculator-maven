package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    App app = new App();

    @Test
    public void testAdd() {
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, app.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, app.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, app.divide(4, 2));
    }
}
