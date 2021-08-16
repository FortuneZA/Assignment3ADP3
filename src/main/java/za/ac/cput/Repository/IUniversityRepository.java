package za.ac.cput.Repository;

import java.util.Set;
import za.ac.cput.Entity.University;

public interface IUniversityRepository extends IRepository<University, String>{

    public Set<University> getAll();
}
