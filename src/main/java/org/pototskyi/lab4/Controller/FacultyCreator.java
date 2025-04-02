package org.pototskyi.lab4.Controller;

import org.pototskyi.lab4.Model.Department;
import org.pototskyi.lab4.Model.Faculty;
import org.pototskyi.lab4.Model.Human;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }

    public void addDepartment(Faculty faculty, Department department) {
        faculty.addDepartment(department);
    }
}
