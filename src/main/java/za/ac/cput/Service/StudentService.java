package za.ac.cput.Service;

import za.ac.cput.Entity.Student;
import za.ac.cput.Repository.StudentRepository;

import java.util.Set;

public class StudentService implements IStudentService{

    private static StudentService studentService = null;
    private StudentRepository studentRepository = null;
    private StudentService(){
        this.studentRepository = StudentRepository.getRepository();
    }

    public static StudentService getService(){
        if(studentService == null)
            studentService = new StudentService();
        return studentService;
    }

    @Override
    public Student create(Student student) {
        return this.studentRepository.create(student);
    }

    @Override
    public Student read(String studentId) {
        return this.studentRepository.read(studentId);
    }

    @Override
    public Student update(Student student) {
        return this.studentRepository.update(student);
    }

    @Override
    public boolean delete(String studentId) {
        return this.studentRepository.delete(studentId);
    }

    @Override
    public Set<Student> getAll() {
        return this.studentRepository.getAll();
    }
}
