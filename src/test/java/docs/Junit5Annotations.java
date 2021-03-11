package docs;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Junit5Annotations {

    @BeforeAll
    static void setup() {
        System.out.println("Setting up!");
    }

    @BeforeEach
    void beforEach() {
        System.out.println("Before each here!");
    }

    @Test
    @DisplayName("Some test")
    void someTest() {
        System.out.println("           someTest here");
        assertTrue(true);
    }

    @Test
    @DisplayName("Another Test")
    void anotherTest() {
        System.out.println("           anotherTest here");
        assertTrue(true);
    }


//    setup here
//    beforeEach1 here
//    beforeEach here
//    anotherTest here
//    afterEach here
//    beforeEach1 here
//    beforeEach here
//    someTest here
//    afterEach here
//    shutdown here
}