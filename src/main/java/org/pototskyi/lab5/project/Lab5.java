package org.pototskyi.lab5.project;

import java.util.List;
import java.util.Scanner;

public class Lab5 {
    public static void start() {
        StudentsDAO studentsDAO = new StudentsDAO();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер місяця (1-12): ");
        int month = scanner.nextInt();

        List<Student> students;

        students = studentsDAO.getStudentsByMonth(month);

        if (students.isEmpty()) {
            System.out.println("Немає студентів, народжених у цьому місяці.");
        } else {
            System.out.println("Список студентів:");
            students.forEach(System.out::println);
        }
    }
}
