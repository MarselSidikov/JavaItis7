package ru.itis;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.*;
import java.util.Scanner;

/**
 * 08.11.2017
 * MainDb
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainDb {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/java_itis_7");
        dataSource.setUsername("postgres");
        dataSource.setPassword("qwerty007");
        dataSource.setDriverClassName("org.postgresql.Driver");

        HumanDataStorage storage = new HumanDataStorage(dataSource);

        Human human = new Human("Вавилон Вавилонович", 99);

        storage.save(human);
    }
}
