package beloventseva.java.labs.model;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Objects;

public class Department extends UniversityStructure{
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

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Department)) {
            return false;
        } else {
            Department that = (Department)o;
            return Objects.equals(this.getName(), that.getName()) && Objects.equals(this.getHead(), that.getHead()) && Objects.equals(this.getGroups(), that.getGroups());
        }
    }

    public String toString() {
        return "Department{name='" + this.name + "', head=" + this.head + ", groups=" + this.groups + "}";
    }
}
