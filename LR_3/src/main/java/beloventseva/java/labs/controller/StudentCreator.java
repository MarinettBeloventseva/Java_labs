package beloventseva.java.labs.controller;

import beloventseva.java.labs.model.Group;
import beloventseva.java.labs.model.Sex;
import beloventseva.java.labs.model.Student;

public class StudentCreator {
    public StudentCreator() {
    }

    public Student createStudent(String firstName, String lastName, String parentage, Sex gender) {
        return new Student(firstName, lastName, parentage, gender);
    }
}