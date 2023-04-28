package beloventseva.java.labs.model;

import java.util.Objects;

public abstract class UniversityStructure {

    private String name;
    private Human headmaster;
    private String superstructure;
    private String substructure;

    public UniversityStructure(String name, Human headmaster, String superstructure, String substructure) {
        this.name = name;
        this.headmaster = headmaster;
        this.superstructure = superstructure;
        this.substructure = substructure;
    }

    public UniversityStructure(String name, Human headmaster, String substructure) {
        this.name = name;
        this.headmaster = headmaster;
        this.substructure = substructure;
    }

    public UniversityStructure(String name, Human headmaster) {
        this.name = name;
        this.headmaster = headmaster;
    }

    public UniversityStructure() {
    }
    /*public void addSubstructure(UniversityStructure substructure) {
        substructures.add(substructure);
    }*/

    public String getSubstructure() {
        return substructure;
    }

    public void setSubstructure(String substructure) {
        this.substructure = substructure;
    }



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

    public String getSuperstructure() {
        return superstructure;
    }

    public void setSuperstructure(String superstructure) {
        this.superstructure = superstructure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UniversityStructure that)) return false;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getHeadmaster(), that.getHeadmaster()) && Objects.equals(getSuperstructure(), that.getSuperstructure());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHeadmaster(), getSuperstructure());
    }

    @Override
    public String toString() {
        return "UniversityStructure{" +
                "name='" + name + '\'' +
                ", headmaster=" + headmaster +
                ", superstructure='" + superstructure + '\'' +
                ", substructure='" + substructure + '\'' +
                '}';
    }
}
