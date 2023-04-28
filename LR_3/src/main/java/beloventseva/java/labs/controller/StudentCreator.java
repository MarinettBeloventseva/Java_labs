package beloventseva.java.labs.controller;

import beloventseva.java.labs.model.Human;
import beloventseva.java.labs.model.Student;
public class StudentCreator {
    public static Student createStudent(String firstName, String lastName, String patronymic, Human.Sex sex) {
        Student student = new Student(firstName, lastName, patronymic, sex);
        return student;
    }
}
