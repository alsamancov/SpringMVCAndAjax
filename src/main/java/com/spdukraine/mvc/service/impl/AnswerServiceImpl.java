package com.spdukraine.mvc.service.impl;


import com.spdukraine.mvc.entity.Answer;
import com.spdukraine.mvc.repository.AnswerDao;
import com.spdukraine.mvc.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("answerService")
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerDao answerDao;

    @Override
    @Transactional
    public void insert(Answer answer) {
        answerDao.insert(answer);
    }

    @Override
    @Transactional
    public void delete(Answer answer) {
        answerDao.delete(answer);
    }

    @Override
    @Transactional
    public Answer findAnswerById(int id) {
        return this.answerDao.findAnswerById(id);
    }

    @Override
    @Transactional
    public void update(Answer answer) {
        answerDao.update(answer);
    }

    @Override
    @Transactional
    public List<Answer> getAllAnswers() {
        return this.answerDao.getAllAnswers();
    }

    @Override
    @Transactional
    public List<Answer> getAnswersByQuestionId(int questionId) {
        return this.answerDao.getAnswersByQuestionId(questionId);
    }
}
