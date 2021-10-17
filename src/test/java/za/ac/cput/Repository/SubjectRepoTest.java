package za.ac.cput.Repository;

import org.junit.jupiter.api.Test;

import za.ac.cput.Entity.Subject;

import za.ac.cput.Factory.SubjectFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubjectRepoTest {

    private static SubjectRepository subjectRepository = SubjectRepository.getRepository();
    private static Subject subject = SubjectFactory.createSubject("Professional practice","45","WR12");
    @Test
    void a_create() {
        Subject created = subjectRepository.create(subject);
        assertEquals(created.getSubjectID(), subject.getSubjectID());
        System.out.println("Created ID: " + created.getSubjectID() + "\nSubject ID: " + subject.getSubjectID() + "\n");
    }

    @Test
    void b_read() {
        //a_create();
        Subject read = subjectRepository.read(subject.getSubjectID());
        //assertNotNull(read);
        System.out.println("Subject Read: " + read + "\n");
    }

    @Test
    void c_update() {
        Subject updated = new Subject.Builder().copy(subject).setSubjectName("ICT Electives").build();

        System.out.println("Updated (" + updated.getSubjectID() + "): " + updated.getSubjectName() + " " + updated.getSubjectCredit()
                + updated.getLecturerID()
                + " " + " = Subject: (" + subject.getSubjectID() + "): " + subject.getSubjectName() + " " + subject.getSubjectCredit()
                + subject.getLecturerID());
    }

    @Test
    void e_delete() {

        boolean deleted = subjectRepository.delete(subject.getSubjectID());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
        d_getAll();

    }

    @Test
    void d_getAll(){
        System.out.println(subjectRepository.getAll() + "\n");
    }
}
