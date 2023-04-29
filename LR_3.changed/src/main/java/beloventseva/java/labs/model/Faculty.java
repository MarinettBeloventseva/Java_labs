package beloventseva.java.labs.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty {
    private String name;
    private Human dean;
    private List<Department> departments;

    public Faculty(String name, Human dean) {
        this.name = name;
        this.dean = dean;
        departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Human getDean() {
        return dean;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty faculty)) return false;
        return Objects.equals(getName(), faculty.getName()) && Objects.equals(getDean(), faculty.getDean()) && Objects.equals(getDepartments(), faculty.getDepartments());
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", dean=" + dean +
                ", departments=" + departments +
                '}';
    }
}
