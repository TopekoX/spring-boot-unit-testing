package com.topekox.demojunit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void beforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach di eksekusi sebelum memanggil method test");
    }

    @Test
//    @DisplayName("Equals and Not Equals")
    void test_Equals_And_Not_Equals() {
        assertEquals(6, demoUtils.add(1, 5), "1 + 5 must be 6");
        assertNotEquals(9, demoUtils.add(5, 1), "5 + 1 must be not 6");
    }

    @Test
//    @DisplayName("Null and Not Null")
    void test_Null_And_Not_Null() {
        String a = null;
        String b = "topekox";

        assertNull(demoUtils.checkNull(a));
        assertNotNull(demoUtils.checkNull(b));
    }

//    @AfterEach
//    void afterEach() {
//        System.out.println("@AfterEach di eksekusi sesudah memanggil method test");
//        System.out.println();
//    }
//
//    @BeforeAll
//    static void beforeAll() {
//        System.out.println("@BeforeAll harus static: dipanggil sekali sebelum eksekusi semua method test");
//        System.out.println();
//    }
//
//    @AfterAll
//    static void afterAll() {
//        System.out.println("@AfterAll harus static: dipanggil sekali setelah eksekusi semua method test");
//    }

}
