package beloventseva.java.labs.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {

    private String name;
    private Human head;
    private List<Group> groups;

    public Department(String name, Human head) {
        this.name = name;
        this.head = head;
        groups = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department that)) return false;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getHead(), that.getHead()) && Objects.equals(getGroups(), that.getGroups());
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", head=" + head +
                ", groups=" + groups +
                '}';
    }
}
