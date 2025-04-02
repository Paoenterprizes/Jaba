package org.pototskyi.lab5.project;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String birthDate;
    private String recordBook;

    public Student(int id,
                   String lastName,
                   String firstName,
                   String patronymic,
                   String birthDate,
                   String recordBook) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.recordBook = recordBook;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format("%d: %s %s %s, Дата народження: %s, Номер залікової: %s",
                id, lastName, firstName, patronymic, birthDate, recordBook);
    }
}
