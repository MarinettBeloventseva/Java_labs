package beloventseva.java.labs.controller;

import beloventseva.java.labs.model.Department;
import beloventseva.java.labs.model.Group;
import beloventseva.java.labs.model.Human;
import beloventseva.java.labs.model.Student;

import java.util.ArrayList;
import java.util.List;

public class GroupCreator {

    public Group createGroup(Department department){

        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();
        HumanCreator humanCreator = new HumanCreator();
        StudentCreator studentCreator = new StudentCreator();

        group1.setName("Group_1");
        group2.setName("Group_2");
        group3.setName("Group_3");

        group1.setHeadmaster(humanCreator.createHuman("Ivan", "Ivanov", "Ivanovich",
                Human.Sex.MALE));
        group2.setHeadmaster(humanCreator.createHuman("Sergey", "Ivanov", "Sergeevich",
                Human.Sex.MALE));
        group3.setHeadmaster(humanCreator.createHuman("Anna", "Koval", "Petrovna",
                Human.Sex.FEMALE));

        if (department.getName() == "Dep1"){
            group1.setSuperstructure(department.toString());
        } else if (department.getName() == "Dep2") {
            group2.setSuperstructure(department.toString());
        } else if (department.getName() == "Dep3") {
            group3.setSuperstructure(department.toString());
        }

        List<Student> studentsOfGroup1 = new ArrayList<>();
        studentsOfGroup1.add(studentCreator.createStudent("Ivan", "Ivanov", "Ivanovich",
                Human.Sex.MALE));
        studentsOfGroup1.add(studentCreator.createStudent("Anna", "Koval", "Petrovna",
                Human.Sex.FEMALE));
        studentsOfGroup1.add(studentCreator.createStudent("Ivan", "Ivanov", "Ivanovich",
                Human.Sex.MALE));

        List<Student> studentsOfGroup2 = new ArrayList<>();
        studentsOfGroup2.add(studentCreator.createStudent("Sergey", "Ivanov", "Sergeevich",
                Human.Sex.MALE));
        studentsOfGroup2.add(studentCreator.createStudent("Sergey", "Ivanov", "Sergeevich",
                Human.Sex.MALE));
        studentsOfGroup2.add(studentCreator.createStudent("Anna", "Koval", "Petrovna",
                Human.Sex.FEMALE));

        List<Student> studentsOfGroup3 = new ArrayList<>();
        studentsOfGroup3.add(studentCreator.createStudent("Anna", "Koval", "Petrovna",
                Human.Sex.FEMALE));
        studentsOfGroup3.add(studentCreator.createStudent("Ivan", "Ivanov", "Ivanovich",
                Human.Sex.MALE));
        studentsOfGroup3.add(studentCreator.createStudent("Anna", "Koval", "Petrovna",
                Human.Sex.FEMALE));

        group1.setSubstructure(studentsOfGroup1.toString());
        group2.setSubstructure(studentsOfGroup2.toString());
        group3.setSubstructure(studentsOfGroup3.toString());

        List<Group> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);

        for (int i = 0; i < 3; i++){
            System.out.println(groups.get(i));
        }
        System.out.println();
        return group1;
    }
}
