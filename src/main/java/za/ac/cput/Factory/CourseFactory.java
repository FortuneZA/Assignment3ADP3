package za.ac.cput.Factory;

/*Course.java
  Factory class for Course
  Author: Tyreeq Engel - 218252005
  Date: 09/06/21

 */

import za.ac.cput.Entity.Course;
import za.ac.cput.Util.GenericHelper;

public class CourseFactory
{
    public static Course createCourse(int courseID, String courseName, String courseDesc, int courseCredits) {
        String courseTest = GenericHelper.generateID();
        Course course = new Course.Builder()
                .withCourseID(123)
                .withCourseName("App Dev")
                .withCourseDesc("Coding Fundamentals")
                .withCourseCredits(999)
                .build();

        return course;
    }
}

