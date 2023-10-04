package juint;

import org.junit.jupiter.api.*;

public class FirstJunitTest {

    @BeforeAll
    static void beforeAll () {
        System.out.println("This is method @beforeAll");
    }

    @AfterAll
    static void afterAll () {
        System.out.println("This is method @afterAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    This is method @beforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("    This is method @afterEach");
    }

    @Test
    void firstTest() {
        System.out.println("        This is first test");
    }

    @Test
    void secondTest() {
        System.out.println("        This is second Test");
    }
}
