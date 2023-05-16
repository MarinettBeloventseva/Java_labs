package beloventseva.java.labs.controller;

import beloventseva.java.labs.model.Department;
import beloventseva.java.labs.model.Human;

public class DepartmentCreator {
    public DepartmentCreator() {
    }

    public Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }
}