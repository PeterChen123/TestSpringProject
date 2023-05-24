package com.cguanyu.learningspring.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    private static String INSERT_QUERY =
            """
            insert into room (ROOM_ID, NAME, ROOM_NUMBER, BED_INFO)
            values(999, 'NotExist', 'Z8', '9K');
            """;

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
