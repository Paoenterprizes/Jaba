package org.pototskyi.lab4.Test;

import org.pototskyi.lab4.JSON.JSONManager;
import org.pototskyi.lab4.Model.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniTest {
    // Тестування серіалізації і десеріалізації об'єкта University в/з JSON формату
    @Test
    public void testJsonSerialization() throws IOException {

        University oldUniversity = new University("Global Knowledge University", new Student("Alex", "Peterson", "James", Human.Sex.MALE, "S90"));


        Faculty faculty1 = new Faculty("Faculty of Engineering", new Student("Liam", "Adams", "Michael", Human.Sex.MALE, "S91"));
        Faculty faculty2 = new Faculty("Faculty of Social Sciences", new Student("Emma", "Thompson", "Olivia", Human.Sex.FEMALE, "S92"));


        Department department11 = new Department("Artificial Intelligence and Robotics", new Student("Sophia", "Martinez", "Elena", Human.Sex.FEMALE, "S93"));
        Department department12 = new Department("Cybersecurity and Networks", new Student("Ethan", "Williams", "Henry", Human.Sex.MALE, "S94"));
        Department department21 = new Department("Psychology and Human Behavior", new Student("Isabella", "Johnson", "Marie", Human.Sex.FEMALE, "S95"));
        Department department22 = new Department("Philosophy and Ethics", new Student("Benjamin", "Clark", "Edward", Human.Sex.MALE, "S96"));


        Group group111 = new Group("AI-201", new Student("Daniel", "Evans", "Thomas", Human.Sex.MALE, "S97"));
        Group group112 = new Group("AI-202", new Student("Ava", "Harris", "Grace", Human.Sex.FEMALE, "S98"));
        Group group121 = new Group("CS-301", new Student("Noah", "Baker", "Andrew", Human.Sex.MALE, "S99"));
        Group group122 = new Group("CS-302", new Student("Mia", "Rodriguez", "Rose", Human.Sex.FEMALE, "S100"));
        Group group211 = new Group("PSY-101", new Student("Elijah", "Gonzalez", "James", Human.Sex.MALE, "S101"));
        Group group212 = new Group("PSY-102", new Student("Charlotte", "Nelson", "Anne", Human.Sex.FEMALE, "S102"));
        Group group221 = new Group("PHIL-201", new Student("William", "Carter", "Thomas", Human.Sex.MALE, "S103"));
        Group group222 = new Group("PHIL-202", new Student("Emily", "Wright", "Lillian", Human.Sex.FEMALE, "S104"));


        group111.addStudent(new Student("Henry", "Mitchell", "David", Human.Sex.MALE, "S105"));
        group111.addStudent(new Student("Ella", "Perez", "Sophia", Human.Sex.FEMALE, "S106"));
        group112.addStudent(new Student("Lucas", "Roberts", "James", Human.Sex.MALE, "S107"));
        group112.addStudent(new Student("Zoe", "Foster", "Grace", Human.Sex.FEMALE, "S108"));
        group121.addStudent(new Student("Mason", "Diaz", "Henry", Human.Sex.MALE, "S109"));
        group121.addStudent(new Student("Aria", "Russell", "Isabella", Human.Sex.FEMALE, "S110"));
        group122.addStudent(new Student("Owen", "Simmons", "Benjamin", Human.Sex.MALE, "S111"));
        group122.addStudent(new Student("Scarlett", "Patterson", "Charlotte", Human.Sex.FEMALE, "S112"));
        group211.addStudent(new Student("Jackson", "Reed", "Elijah", Human.Sex.MALE, "S113"));
        group211.addStudent(new Student("Grace", "Bailey", "Scarlett", Human.Sex.FEMALE, "S114"));
        group212.addStudent(new Student("Sebastian", "Cooper", "Lucas", Human.Sex.MALE, "S115"));
        group212.addStudent(new Student("Lily", "Morris", "Avery", Human.Sex.FEMALE, "S116"));
        group221.addStudent(new Student("Carter", "Bell", "Daniel", Human.Sex.MALE, "S117"));
        group221.addStudent(new Student("Natalie", "Murphy", "Evelyn", Human.Sex.FEMALE, "S118"));
        group222.addStudent(new Student("Julian", "Howard", "Jack", Human.Sex.MALE, "S119"));
        group222.addStudent(new Student("Victoria", "Cook", "Lillian", Human.Sex.FEMALE, "S120"));



        department11.addGroup(group111);
        department11.addGroup(group112);
        department12.addGroup(group121);
        department12.addGroup(group122);
        department21.addGroup(group211);
        department21.addGroup(group212);
        department22.addGroup(group221);
        department22.addGroup(group222);

        faculty1.addDepartment(department11);
        faculty1.addDepartment(department12);
        faculty2.addDepartment(department21);
        faculty2.addDepartment(department22);

        oldUniversity.addFaculty(faculty1);
        oldUniversity.addFaculty(faculty2);


        JSONManager.saveToFile(oldUniversity, "university.json");


        University newUniversity = JSONManager.loadFromFile("university.json");


        System.out.println("Are universities equal? " + oldUniversity.equals(newUniversity));


        assertEquals(oldUniversity, newUniversity);
    }
}
