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
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public Sex getGender() {
        return this.gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Human)) {
            return false;
        } else {
            Human human = (Human)o;
            return Objects.equals(this.getFirstName(), human.getFirstName()) && Objects.equals(this.getLastName(), human.getLastName()) && Objects.equals(this.getPatronymic(), human.getPatronymic()) && this.getGender() == human.getGender();
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.getFirstName(), this.getLastName(), this.getPatronymic(), this.getGender()});
    }

    public String toString() {
        return "Human{firstName='" + this.firstName + "', lastName='" + this.lastName + "', parentage='" + this.patronymic + "', gender=" + this.gender + "}";
    }
}
