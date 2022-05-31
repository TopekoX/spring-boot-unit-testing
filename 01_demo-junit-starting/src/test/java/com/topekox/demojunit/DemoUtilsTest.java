package com.topekox.demojunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DemoUtilsTest {

    @Test
    void testEqualsAndNotEquals() {
        DemoUtils demoUtils = new DemoUtils();

        assertEquals(6, demoUtils.add(1, 5), "1 + 5 must be 6");
        assertNotEquals(9, demoUtils.add(5, 1), "5 + 1 must be not 6");
    }

    @Test
    void testNullAndNotNull() {
        DemoUtils demoUtils = new DemoUtils();

        String a = null;
        String b = "topekox";

        assertNull(demoUtils.checkNull(a));
        assertNotNull(demoUtils.checkNull(b));
    }

}
