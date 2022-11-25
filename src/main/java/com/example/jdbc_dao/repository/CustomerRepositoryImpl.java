package com.example.jdbc_dao.repository;

import com.example.jdbc_dao.SqlFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class CustomerRepositoryImpl implements MyRepository {

    private final String sqlQuery = SqlFileReader.read("myScript.sql");
    @Autowired
    private NamedParameterJdbcTemplate template;

    public String getProductName(String name) {
        final List<String> result = template.queryForList(sqlQuery, Map.of("name", name), String.class);
        return String.join(", ", result);
    }

}
