package sample;

import java.sql.*;
import java.util.Scanner;

/**
 * 01.11.2017
 * MainDb
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainDb {
    private static final String URL = "jdbc:postgresql://localhost:5432/java_itis_7";
    private static final String USER = "postgres";
    private static final String PASSWORD = "qwerty007";

    public static void main(String[] args) throws Exception {
        // подключение к БД
        Connection connection =
                DriverManager.getConnection(URL, USER, PASSWORD);

        // Statement - выражение, которое можно запустить в Базе данных
        Statement statement = connection.createStatement();
        // запускаем выражение и получаем результирующе множество
        ResultSet resultSet = statement.executeQuery("SELECT * FROM owner;");
        // пока в resultSet что-то есть
        while (resultSet.next()) {
            // печатаем текущую строку resultSet
            // двигаем дальше
            System.out.println(
                    resultSet.getInt("id") + " " +
                            resultSet.getString("name") + " " +
                            resultSet.getInt("age")
            );
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.next();
        System.out.println("Введите Возраст:");
        int age = scanner.nextInt();
//        statement
//                .executeUpdate("INSERT INTO owner(name, age) VALUES " +
//                "('" + name + "', " + age + ");");
        PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO owner(name, age) VALUES (?, ?)");
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, age);
        preparedStatement.execute();
    }
}
