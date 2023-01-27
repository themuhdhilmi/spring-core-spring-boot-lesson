package com.gementar.learnjpaandhibernate.course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository
{
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course)
    {
        entityManager.merge(course);
    }

    public  Course select(long id)
    {
        return entityManager.find(Course.class , id);
    }

    public  void delete(long id)
    {
        Course tempFind = entityManager.find(Course.class , id);
        entityManager.refresh(tempFind);
    }
}
