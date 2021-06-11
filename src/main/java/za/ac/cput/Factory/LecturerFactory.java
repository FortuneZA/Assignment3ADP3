package za.ac.cput.Factory;
import za.ac.cput.Entity.Lecturer;

/* LecturerFactory.java
   Factory for Lecturer
   Author: Ridhaa Flanders - 218204191
   Date: 10 June 2021
 */
public class LecturerFactory {

    public static  Lecturer build(String firstName, String lastName, String email)
    {
        if(firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || !email.contains("@") || !email.contains("."))
        {
            return null;
        }
        int max = 10000;
        int min = 1;
        int id = (int)(Math.random()*(max-min+1)+min);

        return new Lecturer.Builder().id(id).firstName(firstName).lastName(lastName).lecturerEmail(email).build();
    }
}
