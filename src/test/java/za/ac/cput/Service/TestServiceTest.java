package za.ac.cput.Service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Test;
import za.ac.cput.Factory.TestFactory;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
class TestServiceTest {
    private static Test test = TestFactory.createTest("001", "ADP3 test");
    private static TestService testService = TestService.getService();

    @org.junit.jupiter.api.Test
    void a_create() {
        Test created = testService.create(test);
        assertEquals(created.getTestId(), test.getTestId());
        System.out.println("Created ID: " + created.getTestId() + "\nTest ID: " + test.getTestId() + "\n");
    }

    @org.junit.jupiter.api.Test
    void b_read() {
        Test read = testService.read(test.getTestId());
        // assertNotNull(read);
        System.out.println("Test Read: " + read + "\n");
    }

    @org.junit.jupiter.api.Test
    void c_update() {
        Test updated = new Test.Builder().copy(test).setLecturerId("001").build();
        // assertNotNull(testService.update(updated));
        System.out.println("Updated (" + updated.getTestId() + "): " + "LecturerID: " + updated.getLecturerId() + " " + "TestInfo: "+updated.getTestInfo()
                + " = Test: (" + test.getTestId() + "): " + "LecturerID: " +test.getLecturerId() +" "+ "TestInfo: "+ test.getTestInfo());
    }

    @org.junit.jupiter.api.Test
    void e_delete() {
        boolean deleted = testService.delete(test.getTestId());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
        d_getAll();
    }

    @org.junit.jupiter.api.Test
    void d_getAll() {
        System.out.println(testService.getAll() + "\n");
    }
}