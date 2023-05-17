package beloventseva.java.labs;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private int recordBookNum;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;

    public Student(int id, String name, String surname, String patronymic, int recordBookNum, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.recordBookNum = recordBookNum;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getRecordBookNum() {
        return recordBookNum;
    }

    public void setRecordBookNum(int recordBookNum) {
        this.recordBookNum = recordBookNum;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getId() == student.getId() && getRecordBookNum() == student.getRecordBookNum() && getYearOfBirth() == student.getYearOfBirth() && getMonthOfBirth() == student.getMonthOfBirth() && getDayOfBirth() == student.getDayOfBirth() && Objects.equals(getName(), student.getName()) && Objects.equals(getSurname(), student.getSurname()) && Objects.equals(getPatronymic(), student.getPatronymic());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(), getPatronymic(), getRecordBookNum(), getYearOfBirth(), getMonthOfBirth(), getDayOfBirth());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", recordBookNum=" + recordBookNum +
                ", yearOfBirth=" + yearOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                ", dayOfBirth=" + dayOfBirth +
                '}';
    }
}
