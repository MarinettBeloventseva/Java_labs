package beloventseva.java.labs.controller;

import beloventseva.java.labs.model.*;

public class UniversityCreator {
    public UniversityCreator() {
    }

    public University createUniversity(String name, Human headmaster) {
        return new University(name, headmaster);
    }

    public University createTypicalUniversity() {
        UniversityCreator universityCreator = new UniversityCreator();
        FacultyCreator facultyCreator = new FacultyCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        GroupCreator groupCreator = new GroupCreator();
        StudentCreator studentCreator = new StudentCreator();

        Human headmaster = new Human("Marko", "Ray", "Shon", Sex.MALE);
        University university = universityCreator.createUniversity("Example University", headmaster);
        System.out.println(university);


        Human dean = new Human("John", "Peters", "Adam", Sex.MALE);
        Faculty faculty = facultyCreator.createFaculty("Computer Science", dean);
        university.addFaculty(faculty);
        System.out.println(faculty);


        Human head = new Human("Jane", "Way", "Martin", Sex.FEMALE);
        Department department = departmentCreator.createDepartment("Programming", head);
        faculty.addDepartment(department);
        System.out.println(department);


        Group group = groupCreator.createGroup("Java Programming");
        department.addGroup(group);
        System.out.println(group);


        Student student1 = studentCreator.createStudent("Alice", "Smith", "Bob", Sex.FEMALE);
        Student student2 = studentCreator.createStudent("Bob", "Johnson", "Charlie", Sex.MALE);
        group.addStudent(student1);
        group.addStudent(student2);

        System.out.println(student1);
        System.out.println(student1);

        return university;
    }
}
