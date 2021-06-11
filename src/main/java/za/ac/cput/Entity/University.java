package za.ac.cput.Entity;

/* University.java
   Entity for University
   Author: Caven Fernanda - 218074905
   Date: 05 June 2021
 */
public class University {

    private String universityID;
    private String name;
    private String city;
    private String address;

    private University(Builder builder){
        this.universityID = builder.universityID;
        this.name = builder.name;
        this.city = builder.city;
        this.address = builder.address;
    }

    public String getUniversityID() {
        return universityID;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }


    public static class Builder{
        private String universityID;
        private String name;
        private String city;
        private String address;

        public Builder(){}

        public Builder withUniversityID(String universityID) {
            this.universityID = universityID;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withCity(String city) {
            this.city = city;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public University build(){
            return new University(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "universityID=" + universityID +
                    ", name='" + name + '\'' +
                    ", city='" + city + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }
}
