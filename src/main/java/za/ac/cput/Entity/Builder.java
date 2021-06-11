package za.ac.cput.Entity;

import java.time.LocalDate;

public class Builder {

    public static void main(String[] args) {
        University university = new University.Builder().withUniversityID("15484").withName("Cape Peninsula University of Technology")
                .withCity("Cape Town").withAddress("Corner of Hanover and Tennant Street\n" +
                        "Zonnebloem").build();

        Faculty faculty = new Faculty.Builder().withFacultyID("415477").withName("Informatics and Design").withPhone("021854781")
                .build();

        System.out.println(university);
        System.out.println(faculty);
    }
}
