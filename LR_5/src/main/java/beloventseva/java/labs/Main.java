package beloventseva.java.labs;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentsFinder studentsFinder = new StudentsFinder();
        List<Student> students;
        students = studentsFinder.findStudentByBirthDate("year", 2003);
        students.addAll(studentsFinder.findStudentByName("Irina"));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}