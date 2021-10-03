package za.ac.cput.Repository;

import za.ac.cput.Entity.Faculty;


import java.util.Set;


public interface IFacultyRepository extends IRepository<Faculty, String>{
    public Set<Faculty> getAll();
}
