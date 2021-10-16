package za.ac.cput.Service;

import za.ac.cput.Entity.Test;

import java.util.Set;

public interface ITestService extends IService <Test, String> {
    public Set<Test> getAll();
}
