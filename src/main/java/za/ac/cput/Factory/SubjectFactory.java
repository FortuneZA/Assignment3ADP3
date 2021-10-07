package za.ac.cput.Factory;

import za.ac.cput.Entity.Subject;

/**
 * SubjectFactory.java
 * Entity for SubjectFactory
 * Author: Mathew Fortuin (219069514)
 * Date: 10/6/21
 *
 */



public class SubjectFactory
{

    public static Subject build(String subjectName,String subjectCredits,int subjectID,int lecturerID)
    {
        //Condition for the object

        if(subjectName.isEmpty() || subjectCredits.isBlank())
        {
            return new Subject.Builder()
                    .subjectName("PHP Fundamentals")
                    .subjectCredit("NQF36")
                    .build();
        }

        else
        {
            return new Subject.Builder()
                    .subjectID("A12")
                    .lecturerID("krub12")
                    .build();
        }
    }

}
