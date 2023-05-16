package beloventseva.java.labs.model;

public abstract class UniversityStructure {
    private String name;
    private Human headmaster;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHeadmaster() {
        return headmaster;
    }

    public void setHeadmaster(Human headmaster) {
        this.headmaster = headmaster;
    }
}
