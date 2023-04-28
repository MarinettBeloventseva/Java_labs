package beloventseva.java.labs.controller;

import beloventseva.java.labs.model.Faculty;
import beloventseva.java.labs.model.Human;
import beloventseva.java.labs.model.University;

import java.util.ArrayList;
import java.util.List;

public class FacultyCreator {

    public Faculty createFaculty(University university){
        Faculty faculty1 = new Faculty();
        Faculty faculty2 = new Faculty();
        Faculty faculty3 = new Faculty();
        HumanCreator humanCreator = new HumanCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();

        faculty1.setName("Economics");
        faculty2.setName("Physics");
        faculty3.setName("History");

        faculty1.setHeadmaster(humanCreator.createHuman("Ivan", "Ivanov", "Ivanovich",
                Human.Sex.MALE));
        faculty2.setHeadmaster(humanCreator.createHuman("Ivan", "Ivanov", "Ivanovich",
                Human.Sex.MALE));
        faculty3.setHeadmaster(humanCreator.createHuman("Maria", "Ivanova", "Ivanovna",
                Human.Sex.FEMALE));

        faculty1.setSuperstructure(university.toString());
        faculty2.setSuperstructure(university.toString());
        faculty3.setSuperstructure(university.toString());

        faculty1.setSubstructure(String.valueOf(departmentCreator.createDepartment(faculty1)));
        faculty2.setSubstructure(String.valueOf(departmentCreator.createDepartment(faculty2)));
        faculty3.setSubstructure(String.valueOf(departmentCreator.createDepartment(faculty3)));

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty1);
        faculties.add(faculty2);
        faculties.add(faculty3);

        for (int i = 0; i < 3; i++){
            System.out.println(faculties.get(i));
        }

        System.out.println();
        return faculty1;
    }
}
