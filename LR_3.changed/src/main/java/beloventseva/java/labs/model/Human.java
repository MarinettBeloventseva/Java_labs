package beloventseva.java.labs.model;

import java.util.Objects;

public abstract class Human {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Sex gender;

    public Human(String firstName, String lastName, String patronymic, Sex gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Sex getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return Objects.equals(getFirstName(), human.getFirstName()) && Objects.equals(getLastName(), human.getLastName()) && Objects.equals(getPatronymic(), human.getPatronymic()) && getGender() == human.getGender();
    }


    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", parentage='" + patronymic + '\'' +
                ", gender=" + gender +
                '}';
    }
}
