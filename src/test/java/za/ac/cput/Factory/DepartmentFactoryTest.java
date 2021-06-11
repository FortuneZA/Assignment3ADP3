package za.ac.cput.Factory;


/* DepartmentFactoryTest.java
   Test cases for Lecturer
   Author: Sergio Fisher - 217203248
   Date: 10 June 2021
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.Department;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentFactoryTest {
    Department department = DepartmentFactory.build("Information Communication Technology","0213456789",1);


    //Test Object Equality
    @Test
    public void objectEquality()
    {
        Department department2 = DepartmentFactory.build("Information Communication Technology","0213456789",1);

        assertNotEquals(department2,department);
    }

    //Test Object Identity
    @Test
    public void objectIdentity()
    {
        Department department2 = department;

        assertEquals(department2,department);
    }

    //Test Timeout
    @Test
    @Timeout(1)
    public void timeoutTest()
    {
        Department department2 = department;

        assertEquals(department2,department);
    }

    //Disable Test
    @Disabled
    @Test
    public void objectEquals()
    {
        Department department2 = DepartmentFactory.build("Information Communication Technology","0213456789",1);

        assertNotEquals(department2,department);
    }


}
