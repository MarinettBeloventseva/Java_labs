package beloventseva.java.labs.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty extends UniversityStructure{
    private String name;
    private Human headmaster;
    private List<Department> departments;

    public Faculty(String name, Human headmaster) {
        this.name = name;
        this.headmaster = headmaster;
        this.departments = new ArrayList();
    }

    public void setHeadmaster(Human headmaster) {
        this.headmaster = headmaster;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }


    public Human getHeadmaster() {
        return this.headmaster;
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public List<Department> getDepartments() {
        return this.departments;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Faculty)) {
            return false;
        } else {
            Faculty faculty = (Faculty)o;
            return Objects.equals(this.getName(), faculty.getName()) && Objects.equals(this.getHeadmaster(), faculty.getHeadmaster()) && Objects.equals(this.getDepartments(), faculty.getDepartments());
        }
    }

    public String toString() {
        return "Faculty{name='" + this.name + "', dean=" + this.headmaster + ", departments=" + this.departments + "}";
    }
}
