package com.spdukraine.mvc.repository;


import com.spdukraine.mvc.entity.Answer;

import java.util.List;

public interface AnswerDao {
    void insert(Answer answer);
    void delete(Answer answer);
    Answer findAnswerById(int id);
    void update(Answer answer);
    List<Answer> getAllAnswers();
    List<Answer> getAnswersByQuestionId(int questionId);
}
