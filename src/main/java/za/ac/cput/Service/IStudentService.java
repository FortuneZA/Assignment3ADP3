package za.ac.cput.Service;

import za.ac.cput.Entity.Student;

import java.util.Set;

public interface IStudentService  extends IService <Student, String> {
    public Set<Student> getAll();
}
