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
        this.groups = new ArrayList();
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHead(Human head) {
        this.head = head;
    }

    public Human getHead() {
        return this.head;
    }

    public void addGroup(Group group) {
        this.groups.add(group);
    }

    public List<Group> getGroups() {
        return this.groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department that)) return false;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getHead(), that.getHead()) && Objects.equals(getGroups(), that.getGroups());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHead(), getGroups());
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
