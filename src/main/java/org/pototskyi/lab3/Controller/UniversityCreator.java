package org.pototskyi.lab3.Controller;

import org.pototskyi.lab3.Model.*;

public class UniversityCreator {
    public University createUniversity(String name, Human head) {
        return new University(name, head);
    }

    public void addFaculty(University university, Faculty faculty) {
        university.addFaculty(faculty);
    }
}
