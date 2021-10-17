package za.ac.cput.Service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Subject;

import za.ac.cput.Factory.SubjectFactory;


import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class SubjectServiceTest {

    private static SubjectService SubjectService = za.ac.cput.Service.SubjectService.getService();
    private static Subject Subject = SubjectFactory.createSubject("App Theory", "50", "GK3");

    @Test
    void a_create() {
        Subject created = SubjectService.create(Subject);
        assertEquals(created.getSubjectID(), Subject.getSubjectID());
        System.out.println("Created ID: " + created.getSubjectID() + "\nSubject ID: " + Subject.getSubjectID() + "\n");
    }

    @Test
    void b_read() {
        Subject read = SubjectService.read(Subject.getSubjectID());
        assertNotNull(read);
        System.out.println("Subject Read: " + read + "\n");
    }

    @Test
    void c_update() {
        Subject updated = new Subject.Builder().copy(Subject).setSubjectName("App Theory").build();
        assertNotNull(SubjectService.update(updated));
        System.out.println("Updated (" + updated.getSubjectID() + "): " + updated.getSubjectName() + updated.getSubjectCredit()
                + updated.getLecturerID()
                + " = Subject: (" + Subject.getSubjectID() + "): " + Subject.getSubjectName() + Subject.getSubjectCredit()
                + Subject.getLecturerID());
    }

    @Test
    void e_delete() {
        boolean deleted = SubjectService.delete(Subject.getSubjectID());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
        d_getAll();
    }

    @Test
    void d_getAll() {
        System.out.println(SubjectService.getAll() + "\n");
    }

}
