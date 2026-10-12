package org.example;
import java.sql.*;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/StudentsDB";
    private static final String USER = "root";
    private static final String PASSWORD = "Proxi#1010";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            System.out.println("SUCCESS: Java is connected to MySQL Database!");

            // Task 1: Create Table
            statement.execute("CREATE TABLE IF NOT EXISTS students (" +
                    "id INT PRIMARY KEY, " +
                    "firstname VARCHAR(255), " +
                    "lastname VARCHAR(255), " +
                    "grade INT)");

            // Task 2: Insert Data
            insertSampleData(connection);

            // Task 3: Retrieve Data
            retrieveData(connection);

            // Task 4: Update Data
            updateStudentName(connection, 1, "UpdatedName");

            // Task 5: Delete Data
            deleteStudent(connection, 2);

            // Task 6: Calculate Average Grade
            calculateAverageGrade(connection);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void insertSampleData(Connection connection) {
        try {
            PreparedStatement insertSingle = connection.prepareStatement(
                    "INSERT INTO students (id, firstname, lastname, grade) VALUES (?, ?, ?, ?) " +
                            "ON DUPLICATE KEY UPDATE firstname=VALUES(firstname)");

            insertSingle.setInt(1, 1);
            insertSingle.setString(2, "Abebe");
            insertSingle.setString(3, "Belete");
            insertSingle.setInt(4, 90);
            insertSingle.executeUpdate();

            for (int i = 2; i <= 5; i++) {
                insertSingle.setInt(1, i);
                insertSingle.setString(2, "Student" + i);
                insertSingle.setString(3, "Test");
                insertSingle.setInt(4, 75 + i);
                insertSingle.executeUpdate();
            }
            System.out.println("Sample data inserted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void retrieveData(Connection connection) {
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM students")) {
            System.out.println("\n--- Student Records ---");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") +
                        ", Name: " + resultSet.getString("firstname") + " " + resultSet.getString("lastname") +
                        ", Grade: " + resultSet.getInt("grade"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void updateStudentName(Connection connection, int id, String newFirstName) {
        try (PreparedStatement updateStmt = connection.prepareStatement("UPDATE students SET firstname = ? WHERE id = ?")) {
            updateStmt.setString(1, newFirstName);
            updateStmt.setInt(2, id);
            updateStmt.executeUpdate();
            System.out.println("\nStudent ID " + id + " updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deleteStudent(Connection connection, int id) {
        try (PreparedStatement deleteStmt = connection.prepareStatement("DELETE FROM students WHERE id = ?")) {
            deleteStmt.setInt(1, id);
            deleteStmt.executeUpdate();
            System.out.println("Student ID " + id + " deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void calculateAverageGrade(Connection connection) {
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT AVG(grade) AS average_grade FROM students")) {
            if (resultSet.next()) {
                System.out.println("Average Grade: " + resultSet.getDouble("average_grade"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
