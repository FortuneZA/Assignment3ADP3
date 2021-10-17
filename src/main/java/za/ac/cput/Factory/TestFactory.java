package za.ac.cput.Factory;
/*
Author: Athi Fukama 218328591
Date :11 June 2021
 */

import za.ac.cput.Entity.Test;
import za.ac.cput.Util.GenericHelper;

public class TestFactory {

    public static Test createTest(String lecturerId, String testInfo){

        String testId = GenericHelper.generateID();

        Test test = new Test.Builder()
                .setTestId(testId)
                .setLecturerId(lecturerId)
                .setTestInfo(testInfo)
                .build();

        return test;
    }

}
