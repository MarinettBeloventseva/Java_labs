package beloventseva.java.labs.controller;

import beloventseva.java.labs.model.Group;

public class GroupCreator {
    public GroupCreator() {
    }

    public Group createGroup(String name) {
        return new Group(name);
    }
}
