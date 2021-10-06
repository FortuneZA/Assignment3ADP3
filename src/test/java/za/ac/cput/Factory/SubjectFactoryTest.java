package za.ac.cput.Factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.Lecturer;
import za.ac.cput.Entity.Subject;

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

    private Subject.Builder sub1;
    private Subject.Builder sub2;
    private Subject.Builder sub3;


    @BeforeEach
    void setup()
    {

        sub1 = new Subject.Builder().subjectName("PHP");
        sub2 = new Subject.Builder().subjectName("JAVA");
        sub3=sub1;

    }

    //Object Equality
    @Test

    void testObjectEquality()
    {
        //Shallow Comparison (==)
        assertSame(sub1,sub3);
    }

    //Object Identity
    @Test

    void testObjectIdentity()
    {
        //deep Comparison (.equals)
        assertNotEquals(sub1,sub2);
    }

    //Timeout
    @Test
    @Timeout (4)

    void timeoutTest()
    {
        testObjectIdentity();
    }

    //Disabling
    @Disabled("Do not run in alpha version")
    @Test
    void compare()
    {
        assertEquals(sub1,sub2);
    }


    //Testing NULL restriction
    @Test
    public void TestNull()
    {
        Subject sub1 = SubjectFactory.build("Information Systems","N50",5,12);
        assertEquals(sub1,null);
    }

    @Test
    public void TestNull2()
    {
       Subject sub2 = SubjectFactory.build("","N50",12,34);
        assertEquals(sub2,null);
    }

    @Test
    public void TestNull3()
    {
       Subject sub3 = SubjectFactory.build("","",34,103);
        assertEquals(sub3,null);
    }

}