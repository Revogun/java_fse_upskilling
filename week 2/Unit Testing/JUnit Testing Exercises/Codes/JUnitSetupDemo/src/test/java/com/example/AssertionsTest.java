package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // 1. assertEquals
        assertEquals(5, 2 + 3);

        // 2. assertTrue
        assertTrue("Should be true", 5 > 3);

        // 3. assertFalse
        assertFalse("Should be false", 3 > 5);

        // 4. assertNull
        String str = null;
        assertNull("String should be null", str);

        // 5. assertNotNull
        String name = "Revo";
        assertNotNull("Name should not be null", name);
    }
}
