package za.ac.cput.Entity;

/*
Student.java
Entity for Student
Author: Athi Fukama 218328591
Date :11 June 2021
 */
public class Student {
    private String studentNumber;
    private String firstName;
    private String lastName;
    private String studentEmail;
    private String courseID;

    private Student(Builder builder){
        this.studentNumber = builder.studentNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.studentEmail = builder.studentEmail;
        this.courseID = builder.courseID;

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber=" + studentNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", courseID='" + courseID + '\'' +
                '}';
    }
    // Builder Class
    public static class Builder {
        private String studentNumber;
        private String firstName;
        private String lastName;
        private String studentEmail;
        private String courseID;

        public Builder setStudentNumber(String studentNumber) {
            this.studentNumber = studentNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;

        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setStudentEmail(String studentEmail) {
            this.studentEmail = studentEmail;
            return this;
        }

        public Builder setCourseID(String courseID) {
            this.courseID = courseID;
            return this;
        }
        public Student build(){
            return new Student(this);


        }

        public Builder copy(Student student){
            this.studentNumber = student.studentNumber;
            this.firstName = student.firstName;
            this.lastName = student.lastName;
            this.studentEmail = student.studentEmail;
            this.courseID = student.courseID;

            return this;
        }

        public String getStudentNumber() {
            return studentNumber;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getStudentEmail() {
            return studentEmail;
        }

        public String getCourseID() {
            return courseID;
        }

    }
}
