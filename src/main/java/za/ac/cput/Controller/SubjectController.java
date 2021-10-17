package za.ac.cput.Controller;

import Entity.Subject;
import Factory.SubjectFactory;
import Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Entity.Subject;
import za.ac.cput.Factory.SubjectFactory;

import java.util.Set;

public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping("/create")
public Subject createSubject(@RequestBody Subject subject)
    {
        Subject newSubject = SubjectFactory.createSubject(subject.getSubjectID(),subject.getSubjectName(),subject.getSubjectCredit(),subject.getLecturerID());
        return subjectService.create(newSubject);
    }

    @GetMapping("/read/{id}")
    public Subject getSubject(@PathVariable String id){
        return subjectService.read(id);
    }

    @PostMapping("/update")
    public Subject updateSubject(@RequestBody Subject subject){
        return subjectService.update(subject);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteSubject(@PathVariable String id){
        return subjectService.delete(id);
    }

    @GetMapping("/getAll")
    public Set<Subject> getAllSubjects(){
        return subjectService.getAll();
    }
}
