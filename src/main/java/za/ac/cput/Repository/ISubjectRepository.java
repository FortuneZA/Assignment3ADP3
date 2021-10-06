package za.ac.cput.Repository;

/* ISubjectRepo.java
   IRepo for Subject
   Author: Mathew Fortuin- 219069514
   Date: 6 Oct 2021
 */

import za.ac.cput.Entity.Subject;

import java.util.Set;

public interface ISubjectRepository extends IRepository<Subject,String>
{
    public Set<Subject> getAll();

}
