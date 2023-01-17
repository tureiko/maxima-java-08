package org.example.repository;

import org.example.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.List;


public class CatRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private RowMapper<Cat> rowMapper;

    public void init() {
        jdbcTemplate.execute("DROP TABLE IF EXISTS cats");
        jdbcTemplate.execute("CREATE TABLE cats (ID INT, NAME VARCHAR(45))");
        jdbcTemplate.update("INSERT INTO cats (id, name) VALUES (?,?)", 1L, "Мурзик");
        jdbcTemplate.update("INSERT INTO cats (id, name) VALUES (?,?)", 2L, "Барсик");
        jdbcTemplate.update("INSERT INTO cats (id, name) VALUES (?,?)", 3L, "Мурка");
    }

    public List<Cat> findAll() {
        return new ArrayList<>(jdbcTemplate.query("SELECT * FROM cats", rowMapper));
    }

    public void create(Cat cat){
      jdbcTemplate.update("INSERT INTO cats (id, name) VALUES (?,?)",
              cat.getId(), cat.getName()
      );
}
}
