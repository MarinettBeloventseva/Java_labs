package beloventseva.java.labs.controller;

import beloventseva.java.labs.model.Faculty;
import beloventseva.java.labs.model.Human;

public class FacultyCreator {
    public FacultyCreator() {
    }

    public Faculty createFaculty(String name, Human headmaster) {
        return new Faculty(name, headmaster);
    }
}
