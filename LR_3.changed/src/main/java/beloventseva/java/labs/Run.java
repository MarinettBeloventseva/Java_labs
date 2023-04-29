package beloventseva.java.labs;

import beloventseva.java.labs.model.*;
import beloventseva.java.labs.controller.*;

public class Run {
    public static void main(String[] args) {
        createTypicalUniversity();
        System.out.println("University created!");
    }

    private static void createTypicalUniversity() {
        University university = new University("Example University");
        System.out.println(university);


        Human dean = new Human("John", "Peters", "Adam", Sex.MALE) {};
        Faculty faculty = FacultyCreator.createFaculty("Computer Science", dean);
        university.addFaculty(faculty);
        System.out.println(faculty);


        Human head = new Human("Jane", "Way", "Martin", Sex.FEMALE) {};
        Department department = DepartmentCreator.createDepartment("Programming", head);
        faculty.addDepartment(department);
        System.out.println(department);


        Group group = GroupCreator.createGroup("Java Programming");
        department.addGroup(group);
        System.out.println(group);


        Student student1 = StudentCreator.createStudent("Alice", "Smith", "Bob", Sex.FEMALE, group);
        Student student2 = StudentCreator.createStudent("Bob", "Johnson", "Charlie", Sex.MALE, group);
        group.addStudent(student1);
        group.addStudent(student2);

        System.out.println(student1);
        System.out.println(student1);
    }
}
