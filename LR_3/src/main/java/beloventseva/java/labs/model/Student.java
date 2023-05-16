package beloventseva.java.labs.model;

import java.util.Objects;

public class Student extends Human {
    private Group group;

    public Student(String firstName, String lastName, String patronymic, Sex gender, Group group) {
        super(firstName, lastName, patronymic, gender);
        this.group = group;
    }

    public Group getGroup() {
        return this.group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof Student) {
            Student student = (Student)o;
            return !super.equals(o) ? false : Objects.equals(this.getGroup(), student.getGroup());
        } else {
            return false;
        }
    }
}
