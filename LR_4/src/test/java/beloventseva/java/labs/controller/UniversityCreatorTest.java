package beloventseva.java.labs.controller;

import beloventseva.java.labs.model.University;
import com.google.gson.Gson;

import static org.junit.jupiter.api.Assertions.*;

class UniversityCreatorTest {

    @org.junit.jupiter.api.Test
    void createTypicalUniversity() {
        UniversityCreator universityCreator = new UniversityCreator();
        University oldUniversity = universityCreator.createTypicalUniversity();

        Gson gson = new Gson();
        String jsonText = gson.toJson(oldUniversity);

        University newUniversity = gson.fromJson(jsonText, University.class);
        assertEquals(oldUniversity, newUniversity);
    }
}