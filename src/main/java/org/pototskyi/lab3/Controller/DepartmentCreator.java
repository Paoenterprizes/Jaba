package org.pototskyi.lab3.Controller;

import org.pototskyi.lab3.Model.*;

public class DepartmentCreator {
    public Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }

    public void addGroup(Department department, Group group) {
        department.addGroup(group);
    }
}
