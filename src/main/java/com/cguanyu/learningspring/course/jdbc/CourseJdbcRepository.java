package com.cguanyu.learningspring.course.jdbc;

import com.cguanyu.learningspring.data.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    private static String INSERT_QUERY =
            """
            insert into room (ROOM_ID, NAME, ROOM_NUMBER, BED_INFO)
            values(?, ?, ?, ?);
            """;

    private static String DELETE_QUERY =
            """
            delete from room
            where ROOM_ID = ?
            """;

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    public void insert(Room room) {
        springJdbcTemplate.update(INSERT_QUERY,
                room.getId(), room.getName(), room.getRoomNumber(), room.getBedInfo());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }
}
