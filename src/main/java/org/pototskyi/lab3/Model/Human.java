package org.pototskyi.lab3.Model;

public abstract class Human {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Sex sex;

    public Human(String firstName, String lastName, String patronymic, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.sex = sex;
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

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString(){
        return this.lastName + " " + this.firstName + " " + this.patronymic + " (" + this.sex + ")";
    }

    public enum Sex {
        MALE,
        FEMALE
    }
}
