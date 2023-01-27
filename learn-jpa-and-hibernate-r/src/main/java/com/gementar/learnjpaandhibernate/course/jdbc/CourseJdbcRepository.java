package com.gementar.learnjpaandhibernate.course.jdbc;


import com.gementar.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository
{
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static final String INSERT_QUERY =
            """
                INSERT INTO course (id,name,author) 
                VALUES(?,?,?);
            """;

    private static final String DELETE_QUERY =
            """
                DELETE course WHERE id=?;
            """;

    private static final String SELECT_QUERY =
            """
                SELECT * FROM course WHERE id=?;
            """;

    public void insert(Course course)
    {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(Course course)
    {
        springJdbcTemplate.update(DELETE_QUERY, course.getId());
    }

    public void delete(long id)
    {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course select(long id)
    {
        return springJdbcTemplate.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(Course.class), id);
    }

}
