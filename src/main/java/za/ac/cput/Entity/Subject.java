package za.ac.cput.Entity;

import java.io.Serializable;



/* Subject.java
   Entity for Subject
   Author: Mathew Fortuin- 219069514
   Date: 23 June 2021
 */
@Entity
public class Subject implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String subjectID;
    private  String subjectName;
    private  String subjectCredit;
    private  String lecturerID;




//Builder Constructor

    private Subject(Builder builder)
    {
        this.subjectName= builder.subjectName;
        this.subjectCredit= builder.subjectCredit;
        this.subjectID= builder.subjectID;
        this.lecturerID= builder.lecturerID;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectID='" + subjectID + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectCredit='" + subjectCredit + '\'' +
                ", lecturerID='" + lecturerID + '\'' +
                '}';
    }

    public String getSubjectID() {
        return subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getSubjectCredit() {
        return subjectCredit;
    }

    public String getLecturerID() {
        return lecturerID;
    }

    //Builder Class

    public static class Builder
    {
        private String subjectName,subjectCredit,subjectID,lecturerID;



        public Builder(){}

        public Builder setSubjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }

        public Builder setSubjectCredit(String subjectCredit) {
            this.subjectCredit = subjectCredit;
            return this;
        }

        public Builder setSubjectID(String subjectID) {
            this.subjectID = subjectID;
            return this;
        }

        public Builder setLecturerID(String lecturerID) {
            this.lecturerID = lecturerID;
            return this;
        }

        public Subject build()
        {
            return new Subject(this);
        }

    }
    public Builder copy(Subject subject){
        this.subjectID= subject.subjectID;
        this.subjectName=subject.subjectName;
        this.subjectCredit = subject.subjectCredit;
        this.lecturerID = subject.lecturerID;

        return this;

    }

}
