package za.ac.cput.Factory;

import static org.junit.jupiter.api.Assertions.*;

/*
TestFactoryTest.java
Author: Athi Fukama 218328591
Date :11 June 2021
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import za.ac.cput.Entity.Test;

import java.time.Duration;

class TestFactoryTest {

    private Test test1;
    private Test test2;

    public void createTest() {
        Test test1 = TestFactory.createTest("001", "ADP3 test");
        Test test2 = TestFactory.createTest("002", "ADT3 test");

        System.out.println(test1);
        System.out.println(test2);

    }

    @BeforeEach
    void setup() {
        Test test1 = TestFactory.createTest("001", "ADP3 test");
        Test test2 = TestFactory.createTest("002", "ADT3 test");
    }


    @org.junit.jupiter.api.Test
    void testEquality() {
        assertEquals(test1, test2);
    }

    @org.junit.jupiter.api.Test
    void testIdentity() {
        assertSame(test1, test2);
    }

    @org.junit.jupiter.api.Test
    void testTimeouts() {
        assertTimeout(Duration.ofMillis(20), () -> {
            Thread.sleep(1000);
        });
    }

    @Disabled
    @org.junit.jupiter.api.Test
    void disableTest() {
        assertEquals(test1, test2);

    }
}

