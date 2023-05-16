package beloventseva.java.labs;

import beloventseva.java.labs.controller.*;
import beloventseva.java.labs.model.University;
import com.google.gson.Gson;

public class Run {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();
        System.out.println("University created!");
    }
}
