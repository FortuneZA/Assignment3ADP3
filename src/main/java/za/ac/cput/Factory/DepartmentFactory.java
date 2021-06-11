package za.ac.cput.Factory;

import za.ac.cput.Entity.Department;


/**
 * Subject.java
 * Entity for Department
 * Author: Sergio Fisher (217203248)
 * Date: 10/6/21
 *
 */

public class DepartmentFactory {

    public static Department build(String name, String phone, int departmentID) {
        //Condition for the object

        if (name.isEmpty() || phone.isBlank()){

            return null;
        }

        return new Department.Builder()
                .name("Information Communication Technology")
                .phone("0213456789")
                .departmentID(1)
                .build();
    }
}
