package org.pototskyi.lab4.Controller;

import org.pototskyi.lab4.Model.Department;
import org.pototskyi.lab4.Model.Group;
import org.pototskyi.lab4.Model.Human;

public class DepartmentCreator {
    public Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }

    public void addGroup(Department department, Group group) {
        department.addGroup(group);
    }
}
