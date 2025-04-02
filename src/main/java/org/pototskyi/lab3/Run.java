package org.pototskyi.lab3;

import org.pototskyi.lab3.Controller.*;
import org.pototskyi.lab3.Model.*;

public class Run {
    public static void createTypicalUniversity() {
        // Створення університету
        Human rector = new Human("Олег", "Шевченко", "Васильович", Human.Sex.MALE) {};
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createUniversity("НТУ \"Дніпровська політехніка\"", rector);

        // Створення першого факультету
        Human facultyHead1 = new Human("Катерина", "Іванова", "Петрівна", Human.Sex.FEMALE) {};
        FacultyCreator facultyCreator = new FacultyCreator();
        Faculty faculty1 = facultyCreator.createFaculty("Факультет комп'ютерних наук", facultyHead1);

        // Додавання кафедр до факультету
        Human departmentHead1 = new Human("Юрій", "Мороз", "Валентинович", Human.Sex.MALE) {};
        DepartmentCreator departmentCreator = new DepartmentCreator();
        Department department1 = departmentCreator.createDepartment("Кафедра штучного інтелекту", departmentHead1);

        Human departmentHead2 = new Human("Світлана", "Коваленко", "Ігорівна", Human.Sex.FEMALE) {};
        Department department2 = departmentCreator.createDepartment("Кафедра мережевих технологій", departmentHead2);

        facultyCreator.addDepartment(faculty1, department1);
        facultyCreator.addDepartment(faculty1, department2);

        // Додавання груп до кафедр
        Human groupHead1 = new Human("Олексій", "Бондар", "Сергійович", Human.Sex.MALE) {};
        GroupCreator groupCreator = new GroupCreator();
        Group group1 = groupCreator.createGroup("Група AI-201", groupHead1);

        Human groupHead2 = new Human("Тетяна", "Лисенко", "Михайлівна", Human.Sex.FEMALE) {};
        Group group2 = groupCreator.createGroup("Група NT-202", groupHead2);

        departmentCreator.addGroup(department1, group1);
        departmentCreator.addGroup(department1, group2);

        // Додавання студентів до груп
        StudentCreator studentCreator = new StudentCreator();
        Student student1 = studentCreator.createStudent("Віктор", "Семенюк", "Андрійович", Human.Sex.MALE, "AI201001");
        Student student2 = studentCreator.createStudent("Аліна", "Черненко", "Олександрівна", Human.Sex.FEMALE, "AI201002");
        Student student3 = studentCreator.createStudent("Ігор", "Кравцов", "Володимирович", Human.Sex.MALE, "NT202001");
        Student student4 = studentCreator.createStudent("Марина", "Гордієнко", "Петрівна", Human.Sex.FEMALE, "NT202002");

        groupCreator.addStudent(group1, student1);
        groupCreator.addStudent(group1, student2);
        groupCreator.addStudent(group2, student3);
        groupCreator.addStudent(group2, student4);

        // Додавання факультету до університету
        universityCreator.addFaculty(university, faculty1);

        // Створення другого факультету
        Human facultyHead2 = new Human("Андрій", "Петренко", "Іванович", Human.Sex.MALE) {};
        Faculty faculty2 = facultyCreator.createFaculty("Факультет прикладної математики", facultyHead2);

        universityCreator.addFaculty(university, faculty2);

        // Вивід даних про університет
        System.out.println(university);
    }

    public static void start() {
        createTypicalUniversity();
    }
}
