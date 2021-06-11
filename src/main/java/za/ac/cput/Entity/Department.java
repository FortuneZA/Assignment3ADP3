package za.ac.cput.Entity;

/* Department.java
   Entity for Department
   Author: Sergio Fisher - 217203248
   Date: 05 June 2021
 */

public class Department {
    private String name, phone;
    private int departmentID;

    private Department(Builder builder){
        this.name = builder.name;
        this.phone = builder.phone;
        this.departmentID = builder.departmentID;
    }

    //builder class
    public static class Builder {
        private String name, phone;
        private int departmentID;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder departmentID(int departmentID) {
            this.departmentID = departmentID;
            return this;
        }

        public Department build() {
            return new Department(this);
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "Name ='" + name + '\'' +
                ", Phone ='" + phone + '\'' +
                ", ID =" + departmentID +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public String getDepartmentInfo(){
        return this.toString();
    }

}
