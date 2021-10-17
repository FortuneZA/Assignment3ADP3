package za.ac.cput.Factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.Lecturer;
import za.ac.cput.Entity.Student;
import za.ac.cput.Entity.Subject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Subject Test.java
 * Subject Test class
 * Author: Mathew Fortuin (219069514)
 * Date: 6/6/21
 *
 */

class SubjectFactoryTest
{

    private String subject1;
    private String subject2;

    public void createSubject() {
        Subject subject1 = SubjectFactory.createSubject("Architecture Practices","36","KB12");
        Subject subject2 = SubjectFactory.createSubject("Business Management","26","RB06");

        System.out.println(subject1);
        System.out.println(subject2);

    }

    @BeforeEach
    void setUp() {
        Subject subject1 = SubjectFactory.createSubject("Architecture Practices","36","KB12");
        Subject subject2 = SubjectFactory.createSubject("Business Management","26","RB06");
    }

    @Test
    void testEquality() {
        assertEquals(subject1, subject2);

    }

    @Test
    void testIdentity() {

        assertSame(subject1, subject2);

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
        assertEquals(subject1, subject2);

    }

}