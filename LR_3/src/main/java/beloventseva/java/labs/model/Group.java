package beloventseva.java.labs.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {
    private String name;
    private List<Student> students;

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList();
    }

    public String getName() {
        return this.name;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Group)) {
            return false;
        } else {
            Group group = (Group)o;
            return Objects.equals(this.getName(), group.getName()) && Objects.equals(this.getStudents(), group.getStudents());
        }
    }

    public String toString() {
        return "Group{name='" + this.name + "', students=" + this.students + "}";
    }
}
