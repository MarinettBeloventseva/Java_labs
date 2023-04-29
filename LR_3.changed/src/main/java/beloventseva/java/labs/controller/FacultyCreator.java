package beloventseva.java.labs.controller;

import beloventseva.java.labs.model.Faculty;
import beloventseva.java.labs.model.Human;

public class FacultyCreator {
    public static Faculty createFaculty(String name, Human dean) {
        return new Faculty(name, dean);
    }
}

