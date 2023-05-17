package beloventseva.java.labs;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentsFinder {
    public List<Student> findStudentByBirthDate(String nameOfDate, int date) {

        ResultSet resultSet;
        List<Student> students = new ArrayList<>();
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/User.WIN-CP844JEHB4U/IdeaProjects/LR_5/src/main/java/beloventseva/java/labs/students_db.db");
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM students WHERE "+nameOfDate+"_of_birth = "+date);

            while (resultSet.next()) {
                students.add(new Student(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getString(4),
                        resultSet.getInt(5), resultSet.getInt(6),
                        resultSet.getInt(7), resultSet.getInt(8)));
            }
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    public List<Student> findStudentByName(String name) {

        ResultSet resultSet;
        List<Student> students = new ArrayList<>();
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/User.WIN-CP844JEHB4U/IdeaProjects/LR_5/src/main/java/beloventseva/java/labs/students_db.db");
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM students WHERE name = '"+name+"'");

            while (resultSet.next()) {
                students.add(new Student(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getString(4),
                        resultSet.getInt(5), resultSet.getInt(6),
                        resultSet.getInt(7), resultSet.getInt(8)));
            }
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
}
