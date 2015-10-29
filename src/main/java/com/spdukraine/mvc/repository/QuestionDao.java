package com.spdukraine.mvc.repository;


import com.spdukraine.mvc.entity.Question;

import java.util.List;

public interface QuestionDao {
    void insert(Question question);
    void delete(Question question);
    Question findQuestionById(int id);
    void update(Question question);
    List<Question> getAllQuestions();
}
