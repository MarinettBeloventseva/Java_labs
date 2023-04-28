package beloventseva.java.labs;

import beloventseva.java.labs.controller.UniversityCreator;
import beloventseva.java.labs.model.University;

public class Run {
    public static void main(String[] args) {

        createTypicalUniversity();

        int i = 0;
    }

    private static void createTypicalUniversity(){
        UniversityCreator universityCreator = new UniversityCreator();
        universityCreator.createUniversity();
        System.out.println("University created!");
    }
}