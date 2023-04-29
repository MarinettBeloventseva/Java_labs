package beloventseva.java.labs.controller;

import beloventseva.java.labs.model.Department;
import beloventseva.java.labs.model.Human;

public class DepartmentCreator {
    public static Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }
}

