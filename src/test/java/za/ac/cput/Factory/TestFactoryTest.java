package za.ac.cput.Factory;

import static org.junit.jupiter.api.Assertions.*;

/*
TestFactoryTest.java
Author: Athi Fukama 218328591
Date :11 June 2021
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Lecturer;
import za.ac.cput.Entity.Student;



import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class TestFactoryTest {

    private Test test1;
    private Test test2;


    @BeforeEach
    void setup() {

        za.ac.cput.Entity.Test test1 = new za.ac.cput.Entity.Test.Builder().setTestID("362S")
                .setLecturerID("2021S")
                .setTestInfo("ADP3 Assignment")
                .build();

        za.ac.cput.Entity.Test test2 = new za.ac.cput.Entity.Test.Builder().setTestID("362S")
                .setLecturerID("2021S")
                .setTestInfo("ADP3 Assignment")
                .build();


    }

    @Test
    void testEquality() {
        assertEquals(test1, test2);

    }

    @Test
    void testIdentity() {

        assertSame(test1, test2);

    }

    @Test
    void testTimeouts() {
        assertTimeout(Duration.ofMillis(20), () -> {
            Thread.sleep(1000);
        });
    }

    @Disabled
    @Test
    void disableTest() {
        assertEquals(test1, test2);

    }
}

