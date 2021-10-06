package za.ac.cput.Entity;

/* Subject.java
   Entity for Subject
   Author: Mathew Fortuin- 219069514
   Date: 23 June 2021
 */
public class Subject
{
    private final String subjectName,subjectCredit,subjectID,lecturerID;




//Builder Constructor

    private Subject(Builder builder)
    {
        this.subjectName= builder.subjectName;
        this.subjectCredit= builder.subjectCredit;
        this.subjectID= builder.subjectID;
        this.lecturerID= builder.lecturerID;
    }


//Builder Class

    public static class Builder
    {
        private String subjectName,subjectCredit,subjectID,lecturerID;



        public Builder(){}

        public Builder subjectName(String subjectName)
        {
            this.subjectName=subjectName;
            return this;
        }

        public Builder subjectCredit(String subjectCredit)
        {
            this.subjectCredit=subjectCredit;
            return this;
        }

        public Builder subjectID(String subjectID)
        {
            this.subjectID=subjectID;
            return this;
        }

        public Builder lecturerID(String lecturerID)
        {
            this.lecturerID=lecturerID;
            return this;
        }

        public Subject build()
        {
            return new Subject(this);
        }



    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectCredit='" + subjectCredit + '\'' +
                ", subjectID=" + subjectID +
                ", lecturerID=" + lecturerID +
                '}';
    }

    //METHODS

    public String getSubjectName() {
        return subjectName;
    }

    public String getSubjectCredit() {
        return subjectCredit;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public String getlecturerID() {
        return lecturerID;
    }



    public String getSubjectInformation()
    {

          return this.toString();
    }

    public void getSubjectCredits()
    {
        String.format("Subject Credits: %S",getSubjectCredit());
    }

    public void addSubject()
    {
        Builder obj = new Builder();
        obj.build();
    }



}
