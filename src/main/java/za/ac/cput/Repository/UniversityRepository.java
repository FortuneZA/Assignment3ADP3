package za.ac.cput.Repository;

import za.ac.cput.Entity.University;
import java.util.HashSet;
import java.util.Set;

public class UniversityRepository implements IUniversityRepository{

    private static UniversityRepository repository = null;
    private Set<University> uniDB = null;

    private UniversityRepository(){
        uniDB = new HashSet<University>();
    }


    @Override
    public University create(University university) {
        return null;
    }

    @Override
    public University read(String s) {
        return null;
    }

    @Override
    public University update(University university) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public Set<University> getAll() {
        return null;
    }
}
