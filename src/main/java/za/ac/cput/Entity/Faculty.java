package za.ac.cput.Entity;

/* Faculty.java
   Entity for Faculty
   Author: Caven Fernanda - 218074905
   Date: 05 June 2021
 */
public class Faculty {

    private final String facultyID;
    private final String name;
    private final String phone;

    private Faculty(Builder builder) {
        this.facultyID = builder.facultyID;
        this.name = builder.name;
        this.phone = builder.phone;
    }

    public String getFacultyID() {
        return facultyID;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public static class Builder {

        private String facultyID;
        private String name;
        private String phone;

        public Faculty build(){
            return new Faculty(this);
        }

        public Builder withFacultyID(String facultyID) {
            this.facultyID = facultyID;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }
    }


    @Override
    public String toString() {
        return "Faculty{" +
                "facultyID=" + facultyID +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
