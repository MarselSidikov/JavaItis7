package ru.itis;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * 08.11.2017
 * HumanDataStorage
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class HumanDataStorage {
    //language=SQL
    private static final String SQL_INSERT_USER =
            "INSERT INTO owner(name, age) VALUES (?, ?)";

    private JdbcTemplate jdbcTemplate;

    public HumanDataStorage(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    // сохраняет человека в БД
    public void save(Human human) {
        // отправляем запрос в бд на обновление
        jdbcTemplate.update(SQL_INSERT_USER, human.getName(), human.getAge());
    }
}
