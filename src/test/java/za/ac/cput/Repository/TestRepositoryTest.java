package za.ac.cput.Repository;

import org.junit.jupiter.api.BeforeEach;
import za.ac.cput.Entity.Test;
import za.ac.cput.Factory.TestFactory;
import static org.junit.jupiter.api.Assertions.*;

class TestRepositoryTest{
    private static Test test = TestFactory.createTest("001", "ADP3 test");
    private TestRepository repository = TestRepository.getRepository();

    @BeforeEach
    public void setUp() {
        System.out.println("Test: " + test);

    }
    @org.junit.jupiter.api.Test
    public void a_create() {
        Test inserted = repository.create(test);
        assertEquals(inserted.getTestId(), test.getTestId());
        System.out.println("Inserted: " + inserted);
    }

    @org.junit.jupiter.api.Test
    public void c_update() {
        Test updated = new Test.Builder().copy(test).setLecturerId("001").build();
        //assertNotNull(repository.update(updated));
        System.out.println("Updated (" + updated.getTestId() + "): " + "LecturerID:" + updated.getLecturerId() + "TestInfo:" + updated.getTestInfo()
                + " = Test: (" + test.getTestId() + "): " +"Lecturer ID: " + test.getLecturerId() + " " +"TestInfo:"+ test.getTestInfo());
    }

    @org.junit.jupiter.api.Test
    public void b_read() {
        Test read = repository.read(test.getTestId());
        //assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @org.junit.jupiter.api.Test
    public void e_delete() {
        boolean deleted = repository.delete(test.getTestId());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
        d_getAll();
    }

    @org.junit.jupiter.api.Test
    public void d_getAll(){
        System.out.println(repository.getAll() + "\n");
    }
}