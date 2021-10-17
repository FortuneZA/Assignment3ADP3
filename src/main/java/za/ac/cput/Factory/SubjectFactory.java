package za.ac.cput.Factory;

import za.ac.cput.Entity.Subject;
import za.ac.cput.Util.GenericHelper;

/**
 * SubjectFactory.java
 * Class for SubjectFactory
 * Author: Mathew Fortuin (219069514)
 * Date: 10/6/21
 *
 */



public class SubjectFactory
{

    public static Subject createSubject(String subjectName,String subjectCredits,String lecturerID )
    {
      String subjectID = GenericHelper.generateID();
      Subject subject = new Subject.Builder()
              .setSubjectID(subjectID)
              .setSubjectName(subjectName)
              .setSubjectCredit(subjectCredits)
              .setLecturerID(lecturerID)
              .build();

      return subject;

    }

}
