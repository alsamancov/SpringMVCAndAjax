package com.spdukraine.mvc.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name="question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "question_id")
    private int id;

    @Column(name = "text_question")
    private String textQuestion;

    @Column(name = "level")
    private int level;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="question")
    private List<Answer> hisAnswers = new ArrayList<Answer>();

    public Question() {
    }

    public Question(String textQuestion, int level) {
        this.textQuestion = textQuestion;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTextQuestion() {
        return textQuestion;
    }

    public void setTextQuestion(String textQuestion) {
        this.textQuestion = textQuestion;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Answer> getHisAnswers() {
        return hisAnswers;
    }

    public void setHisAnswers(List<Answer> hisAnswers) {
        this.hisAnswers = hisAnswers;
    }


}
