package za.ac.cput.Service;

import za.ac.cput.Entity.Test;
import java.util.Set;

public class TestService implements ITestService{

    private static TestService testService = null;
    private za.ac.cput.Repository.TestRepository testRepository = null;
    private TestService(){
        this.testRepository = za.ac.cput.Repository.TestRepository.getRepository();
    }

    public static TestService getService(){
        if(testService == null)
            testService = new TestService();
        return testService;
    }

    @Override
    public Test create(Test test) {
        return this.testRepository.create(test);
    }

    @Override
    public Test read(String testId) {
        return this.testRepository.read(testId);
    }

    @Override
    public Test update(Test test) {
        return this.testRepository.update(test);
    }

    @Override
    public boolean delete(String testId) {
        return this.testRepository.delete(testId);
    }

    @Override
    public Set<Test> getAll() {
        return this.testRepository.getAll();
    }
}
