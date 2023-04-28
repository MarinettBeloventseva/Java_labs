package beloventseva.java.labs.controller;

import beloventseva.java.labs.model.Department;
import beloventseva.java.labs.model.Faculty;
import beloventseva.java.labs.model.Human;

import java.util.ArrayList;
import java.util.List;

public class DepartmentCreator {
    public Department createDepartment(Faculty faculty){

        Department department1 = new Department();
        Department department2 = new Department();
        Department department3 = new Department();
        HumanCreator humanCreator = new HumanCreator();
        GroupCreator groupCreator = new GroupCreator();

        department1.setName("Dep1");
        department2.setName("Dep2");
        department3.setName("Dep3");

        department1.setHeadmaster(humanCreator.createHuman("Ivan", "Ivanov", "Ivanovich",
                Human.Sex.MALE));
        department2.setHeadmaster(humanCreator.createHuman("Maria", "Ivanova", "Ivanovna",
                Human.Sex.FEMALE));
        department3.setHeadmaster(humanCreator.createHuman("Ivan", "Ivanov", "Ivanovich",
                Human.Sex.MALE));

        if (faculty.getName() == "Economics"){
            department1.setSuperstructure(faculty.toString());
        } else if (faculty.getName() == "Physics") {
            department2.setSuperstructure(faculty.toString());
        } else if (faculty.getName() == "History") {
            department3.setSuperstructure(faculty.toString());
        }

        department1.setSubstructure(String.valueOf(groupCreator.createGroup(department1)));
        department2.setSubstructure(String.valueOf(groupCreator.createGroup(department2)));
        department3.setSubstructure(String.valueOf(groupCreator.createGroup(department3)));

        List<Department> departments = new ArrayList<>();
        departments.add(department1);
        departments.add(department2);
        departments.add(department3);

        for (int i = 0; i < 3; i++){
            System.out.println(departments.get(i));
        }

        System.out.println();
        return department1;
    }
}
