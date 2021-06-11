package za.ac.cput.Entity;

/* Lecturer.java
   Entity for Lecturer
   Author: Ridhaa Flanders - 218204191
   Date: 05 June 2021
 */

public class Lecturer {
    private String firstName, lastName, lecturerEmail;
    private int id;

    private Lecturer(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.lecturerEmail = builder.lecturerEmail;
        this.id = builder.id;
    }

    //builder class
    public static class Builder {
        private String firstName, lastName, lecturerEmail;
        private int id;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder lecturerEmail(String lecturerEmail) {
            this.lecturerEmail = lecturerEmail;
            return this;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Lecturer build() {
            return new Lecturer(this);
        }
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lecturerEmail='" + lecturerEmail + '\'' +
                ", id=" + id +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLecturerEmail() {
        return lecturerEmail;
    }

    public int getId() {
        return id;
    }

    public String getLecturerInfo(){
        return this.toString();
    }
}
