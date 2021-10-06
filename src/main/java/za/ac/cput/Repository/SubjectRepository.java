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


    @Override
    public Subject create(Subject subject) {
        return null;
    }

    @Override
    public Subject read(String s) {
        return null;
    }

    @Override
    public Subject update(Subject subject) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public Set<Subject> getAll() {
        return null;
    }

}
