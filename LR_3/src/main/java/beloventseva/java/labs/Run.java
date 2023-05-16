package beloventseva.java.labs;

import beloventseva.java.labs.controller.*;

public class Run {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        universityCreator.createTypicalUniversity();
        System.out.println("University created!");
    }
}
