package beloventseva.java.labs.controller;

import beloventseva.java.labs.model.Faculty;
import beloventseva.java.labs.model.Human;
import beloventseva.java.labs.model.University;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniversityCreator {

    public University createUniversity(){
        University university = new University();
        HumanCreator humanCreator = new HumanCreator();
        FacultyCreator facultyCreator = new FacultyCreator();

        university.setName("NTU DP");
        university.setHeadmaster(humanCreator.createHuman("Ivan", "Ivanov", "Ivanovich",
                Human.Sex.MALE));

        List<Faculty> faculties = new ArrayList<>();
        faculties.addAll(Collections.singleton(facultyCreator.createFaculty(university)));

        university.setSubstructure(faculties.toString());

        System.out.println(university);
        System.out.println();

        return university;
    }
}
