package beloventseva.java.labs.controller;

import beloventseva.java.labs.model.Human;
public class HumanCreator {
    public HumanCreator() {
    }
    
    public  Human createHuman(String firstName, String lastName, String patronymic, Human.Sex sex){
        return new Human(firstName, lastName, patronymic, sex);
    }
}
