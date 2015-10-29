package com.spdukraine.mvc.repository.impl;


import com.spdukraine.mvc.entity.Answer;
import com.spdukraine.mvc.repository.AnswerDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("answerDao")
public class AnswerDaoImpl implements AnswerDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(Answer answer) {
        sessionFactory.getCurrentSession().save(answer);
    }

    @Override
    public void delete(Answer answer) {
        sessionFactory.getCurrentSession().delete(answer);
    }

    @Override
    public Answer findAnswerById(int id) {
        return (Answer) this.sessionFactory.getCurrentSession().get(Answer.class, id);
    }

    @Override
    public void update(Answer answer) {
        sessionFactory.getCurrentSession().update(answer);
    }

    @Override
    public List<Answer> getAllAnswers() {
        return this.sessionFactory.getCurrentSession().createCriteria(Answer.class).list();
    }

    @Override
    public List<Answer> getAnswersByQuestionId(int questionId) {
        return this.sessionFactory.getCurrentSession().createQuery("SELECT Answer WHERE question_id='1'").list();
    }
}
