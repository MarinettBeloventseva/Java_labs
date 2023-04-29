package beloventseva.java.labs.model;

import java.util.Objects;

public class Student extends Human {
    private Group group;

    public Student(String firstName, String lastName, String patronymic, Sex gender, Group group) {
        super(firstName, lastName, patronymic, gender);
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getGroup(), student.getGroup());
    }

}
