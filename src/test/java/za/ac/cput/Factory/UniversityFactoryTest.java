package za.ac.cput.Factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.University;

import static org.junit.jupiter.api.Assertions.*;

class UniversityFactoryTest {

    University university = UniversityFactory.buildUniversity("Cape Peninsula University of Technology", "Cape Town","Hanover St, Zonnebloem, Cape Town, 7925");
    University university1 = UniversityFactory.buildUniversity("Cape Peninsula University of Technology", "Cape Town","Hanover St, Zonnebloem, Cape Town, 7925");

    @Test
    public void ObjectEquality(){
        assertNotEquals(university,university1);
    }

    @Test
    public void ObjectIdentity(){

        assertNotEquals(university,university1);
    }

    @Test
    @Timeout(2)
    public void TimeoutTest()
    {
        ObjectIdentity();
    }

    @Disabled
    @Test
    public void ObjectEquals()
    {
        assertNotEquals(university,university1);
    }
}