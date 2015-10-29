package com.spdukraine.mvc.repository.impl;

import com.spdukraine.mvc.entity.Question;
import com.spdukraine.mvc.repository.QuestionDao;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("questionDao")
public class QuestionDaoImpl implements QuestionDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(Question question) {
        sessionFactory.getCurrentSession().save(question);
    }

    @Override
    public void delete(Question question) {
        sessionFactory.getCurrentSession().delete(question);
    }

    @Override
    public Question findQuestionById(int id) {
        return (Question) this.sessionFactory.getCurrentSession().get(Question.class, id);
    }

    @Override
    public void update(Question question) {
        sessionFactory.getCurrentSession().update(question);
    }

    @Override
    public List<Question> getAllQuestions() {
        return this.sessionFactory.getCurrentSession().createCriteria(Question.class).list();
    }
}
