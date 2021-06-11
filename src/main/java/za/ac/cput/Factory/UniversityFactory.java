package za.ac.cput.Factory;

import za.ac.cput.Entity.University;
import za.ac.cput.Util.GenericHelper;

/* UniversityFactory.java
   Factory for Lecturer
   Author: Caven Fernanda - 218074905
   Date: 10 June 2021
 */
public class UniversityFactory {

    public static University buildUniversity(String name, String city, String address){
        String universityID = GenericHelper.generateID();

        return new University.Builder().withUniversityID(universityID).withName(name).withCity(city).withAddress(address).build();
    }
}
