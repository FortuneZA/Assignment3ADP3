package za.ac.cput.Factory;

/*
Author: Athi Fukama 218328591
Date :11 June 2021
 */
import za.ac.cput.Entity.Lecturer;
import za.ac.cput.Entity.Student;
import za.ac.cput.Entity.Test;
import za.ac.cput.Util.GenericHelper;


public class TestFactory {
    public static Test build(String lecturerID,String testInfo) {
        {
            if (lecturerID.isEmpty() || testInfo.isEmpty()) {
                return null;
            }
            int max = 100;
            int min = 1;
            int id = (int) (Math.random() * (max - min + 1) + min);

            return new Test.Builder().id(id).setLecturerID(lecturerID).setTestInfo(testInfo).build();
        }
    }



}
