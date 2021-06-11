package za.ac.cput.Entity;

/*Course.java
  Entity for Course
  Author: Tyreeq Engel - 218252005
  Date: 09/06/21

 */
public class Course
{
    private final int  courseID;
    private final String courseName;
    private final String courseDesc;
    private final int courseCredits;


    public Course(Builder builder)
    {
        this.courseID = builder.courseID;
        this.courseName = builder.courseName;
        this.courseDesc = builder.courseDesc;
        this.courseCredits = builder.courseCredits;
    }

    public int getCourseID()
    {
        return courseID;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public String getCourseDesc()
    {
        return courseDesc;
    }

    public int getCourseCredits()
    {
        return courseCredits;
    }

    public static class Builder
    {
        private int courseID;
        private String courseName;
        private String courseDesc;
        private int courseCredits;

        public Builder()
        {

        }

        public Builder withCourseID(int courseID)
        {
            this.courseID = courseID;
            return this;
        }

        public Builder withCourseName(String courseName)
        {
            this.courseName = courseName;
            return this;
        }

        public Builder withCourseDesc(String courseDesc)
        {
            this.courseDesc = courseDesc;
            return this;
        }

        public Builder withCourseCredits(int courseCredits)
        {
            this.courseCredits = courseCredits;
            return this;
        }

        public Course build()
        {
            return new Course(this) ;
        }
    }

    public void addCourse()
    {
        Builder C = new Builder();
        C.build();
    }

    public void deleteCourse()
    {

    }

    public void editSubject()
    {

    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", courseName='" + courseName + '\'' +
                ", courseDesc='" + courseDesc + '\'' +
                ", courseCredits=" + courseCredits +
                '}';
    }
}

