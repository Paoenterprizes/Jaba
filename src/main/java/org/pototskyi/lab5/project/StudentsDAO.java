package org.pototskyi.lab5.project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentsDAO {
    public List<Student> getStudentsByMonth(int month) {
        List<Student> students = new ArrayList<>();
        String query = "SELECT * FROM students WHERE MONTH(birthDate) = ?";

        try (Connection connection = DBManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, month);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                students.add(new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("lastName"),
                        resultSet.getString("firstName"),
                        resultSet.getString("patronymic"),
                        resultSet.getString("birthDate"),
                        resultSet.getString("recordBook")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}
