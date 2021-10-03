package za.ac.cput.Repository;

import za.ac.cput.Entity.Faculty;


import java.util.HashSet;
import java.util.Set;

public class FacultyRepository implements IFacultyRepository{

    private static FacultyRepository repository = null;
    private Set<Faculty> facultyDB = null;

    private FacultyRepository(){
        facultyDB = new HashSet<Faculty>();
    }

    @Override
    public Faculty create(Faculty university) {
        return null;
    }

    @Override
    public Faculty read(String s) {
        return null;
    }

    @Override
    public Faculty update(Faculty faculty) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public Set<Faculty> getAll() {
        return null;
    }
}
