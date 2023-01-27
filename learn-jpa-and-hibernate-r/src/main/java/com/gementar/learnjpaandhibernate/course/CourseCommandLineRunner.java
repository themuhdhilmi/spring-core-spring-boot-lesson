package com.gementar.learnjpaandhibernate.course;

import com.gementar.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.gementar.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner
{
    @Autowired
    private CourseJdbcRepository repositoryJdbc;

    @Autowired
    private  CourseJpaRepository repositoryJpa;

    @Autowired
    private CourseSpringDataJpaRepository repositorySpringJpa;

    @Override
    public void run(String... args) throws Exception
    {
        springJpa();
        //jpaTest();
        //jdbcTest();
    }

    private void springJpa()
    {
        repositorySpringJpa.save(new Course(1, "raju", "sad"));
        repositorySpringJpa.save(new Course(2, "ajak", "sae"));
        repositorySpringJpa.save(new Course(3, "kaup", "red"));

        repositorySpringJpa.deleteById(2L);
        System.out.println(repositorySpringJpa.findById(1L));
        System.out.println(repositorySpringJpa.findById(3L));

        System.out.println(repositorySpringJpa.findAll());
        System.out.println(repositorySpringJpa.count());
        System.out.println(repositorySpringJpa.findByAuthor("sad"));
        System.out.println(repositorySpringJpa.findByName("raju"));
    }

    private void jpaTest()
    {
        repositoryJpa.insert(new Course(1, "raju", "sad"));
        repositoryJpa.insert(new Course(2, "ajak", "sae"));
        repositoryJpa.insert(new Course(3, "kaup", "red"));


        repositoryJpa.delete(2);
        System.out.println(repositoryJpa.select(1));
    }

    private void jdbcTest()
    {
        repositoryJdbc.insert(new Course(1, "raju", "sad"));
        repositoryJdbc.insert(new Course(2, "ajak", "sae"));
        repositoryJdbc.insert(new Course(3, "kaup", "red"));


        repositoryJdbc.delete(new Course(2, "raju", "sameer"));
        System.out.println(repositoryJdbc.select(1));
    }
}
