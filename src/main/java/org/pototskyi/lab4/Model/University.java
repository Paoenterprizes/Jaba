package org.pototskyi.lab4.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University {
    private String name;
    private Human head;
    private List<Faculty> faculties;

    public University(String name, Human head) {
        this.name = name;
        this.head = head;
        this.faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public List<Faculty> getFaculties() {
        return new ArrayList<>(faculties);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    @Override
    public String toString() {
        return "Університет: " + name + ", Голова: " + head + ", Факультети: " + faculties;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        University that = (University) obj;
        return Objects.equals(name, that.name) &&
                Objects.equals(head, that.head) &&
                Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, faculties);
    }
}
