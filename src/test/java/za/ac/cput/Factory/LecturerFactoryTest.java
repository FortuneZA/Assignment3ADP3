package za.ac.cput.Factory;

/* LecturerFactoryTest.java
   Test cases for Lecturer
   Author: Ridhaa Flanders - 218204191
   Date: 10 June 2021
 */
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.Lecturer;

import static org.junit.jupiter.api.Assertions.*;

class LecturerFactoryTest {

    Lecturer lecturer = LecturerFactory.build("Robet","House","rhouse@gmail.com");


    //test Object Equality
    @Test
    public void ObjectEquality()
    {
        Lecturer lecturer2 = LecturerFactory.build("Robet","House","rhouse@gmail.com");

        assertNotEquals(lecturer2,lecturer);
    }

    //test Object Identity
    @Test
    public void ObjectIdentity()
    {
        Lecturer lecturer2 = lecturer;

        assertEquals(lecturer2,lecturer);
    }

    //test Timeout
    @Test
    @Timeout(1)
    public void TimeoutTest()
    {
        ObjectIdentity();
    }

    //Disable Test
    @Disabled
    @Test
    public void ObjectEquals()
    {
        Lecturer lecturer2 = LecturerFactory.build("Robet","House","rhouse@gmail.com");

        assertEquals(lecturer2,lecturer);
    }

    //Testing build restrictions
    @Test
    public void TestNull1()
    {
        Lecturer lecturer2 = LecturerFactory.build("Robet","House","rhousegmail.com");
        assertEquals(lecturer2,null);
    }

    @Test
    public void TestNull2()
    {
        Lecturer lecturer3 = LecturerFactory.build("Robet","House","rhouse@gmailcom");
        assertEquals(lecturer3,null);
    }

    @Test
    public void TestNull3()
    {
        Lecturer lecturer4 = LecturerFactory.build("Robet","","rhouse@gmail.com");
        assertEquals(lecturer4,null);
    }

}