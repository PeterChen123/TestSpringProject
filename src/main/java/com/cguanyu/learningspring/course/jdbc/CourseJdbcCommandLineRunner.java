package com.cguanyu.learningspring.course.jdbc;

import com.cguanyu.learningspring.data.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Room(998, "NotExist", "Z8", "9K"));
        repository.insert(new Room(999, "NotExistDelete", "Z9", "9K"));

        repository.deleteById(999);
    }
}
