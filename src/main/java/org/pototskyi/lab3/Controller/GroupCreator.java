package org.pototskyi.lab3.Controller;

import org.pototskyi.lab3.Model.*;

public class GroupCreator {
    public Group createGroup(String name, Human head) {
        return new Group(name, head);
    }

    public void addStudent(Group group, Student student) {
        group.addStudent(student);
    }
}
