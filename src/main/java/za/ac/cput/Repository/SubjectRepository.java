package za.ac.cput.Repository;

/* SubjectRepo.java
   Repository for Subject
   Author: Mathew Fortuin- 219069514
   Date: 6 Oct 2021
 */

import za.ac.cput.Entity.Subject;

import java.util.HashSet;
import java.util.Set;

public class SubjectRepository implements ISubjectRepository {

    private static SubjectRepository repository = null;
    private Set<Subject> subjectDB = null;

    private SubjectRepository(){
        subjectDB = new HashSet<Subject>();
    }

    public static SubjectRepository getRepository()
    {
        if(repository == null)
            repository = new SubjectRepository();
        return repository;
    }


    @Override
    public Subject create(Subject subject) {
        boolean success = this.subjectDB.add(subject);
        if(!success)       //If subject was not successfully added
            return null;

        return subject;
    }

    @Override
    public Subject read(String SubjectId) {
       for(Subject subject : this.subjectDB)
       {
           String subjectId;
           if(subject.getSubjectID().equalsIgnoreCase(SubjectId))
               return subject;
       }

       return null;
    }

    @Override
    public Subject update(Subject subject) {
        Subject beforeUpdate = read(subject.getSubjectID());

        if(beforeUpdate!=null)
        {
            this.subjectDB.remove(beforeUpdate);
            this.subjectDB.add(subject);
            return subject;
        }
            return null;
    }

    @Override
    public boolean delete(String subjectId) {

        Subject subjectToDelete = read(subjectId);

        if(subjectToDelete !=null)
        {
            this.subjectDB.remove(subjectToDelete);
            return true;
        }

        return false;
    }

    @Override
    public Set<Subject> getAll() {
        return subjectDB;
    }

}
