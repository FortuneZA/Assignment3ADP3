package za.ac.cput.Factory;

import za.ac.cput.Entity.Faculty;
import za.ac.cput.Util.GenericHelper;

/* FacultyFactory.java
   Factory for Faculty
   Author: Caven Fernanda - 218074905
   Date: 10 June 2021
 */
public class FacultyFactory {

    public static Faculty buildFaculty(String name, String phone){
        String facultyID = GenericHelper.generateID();

        Faculty faculty = new Faculty.Builder().withFacultyID(facultyID).withName(name).withPhone(phone).build();

        return faculty;

    }
}