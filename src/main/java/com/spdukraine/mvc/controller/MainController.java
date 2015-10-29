package com.spdukraine.mvc.controller;

import com.spdukraine.mvc.entity.Answer;
import com.spdukraine.mvc.entity.Applicant;
import com.spdukraine.mvc.entity.Question;
import com.spdukraine.mvc.service.AnswerService;
import com.spdukraine.mvc.service.ApplicantService;
import com.spdukraine.mvc.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class MainController {

    private QuestionService questionService;
    private AnswerService answerService;
    private ApplicantService applicantService;

    @Autowired
    public MainController(QuestionService questionService, AnswerService answerService, ApplicantService applicantService){
        this.questionService = questionService;
        this.answerService = answerService;
        this.applicantService = applicantService;
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String printWelcome(){
        return "hello";
    }

    @RequestMapping(value = "/ajaxtest", method = RequestMethod.GET)
    @ResponseBody
    public Set<String> ajaxTest() {
        Set<String> records = new HashSet<String>();
        records.add("Record #1");
        records.add("Record #2");

        return records;
    }

    @RequestMapping(value = "/answers", method = RequestMethod.GET)
    @ResponseBody
    public List<Answer> answers(){
        List<Answer> answers = answerService.getAllAnswers();
        return answers;
    }

    @RequestMapping(value = "/questions", method = RequestMethod.GET)
    @ResponseBody
    public List<Question> allquestions() {
        List<Question> allquestions = questionService.getAllQuestions() ;


        return allquestions;
    }

    @RequestMapping(value = "/applicants", method = RequestMethod.GET)
    @ResponseBody
    public List<Applicant> allapplicants() {
        List<Applicant> allapplicants = applicantService.getAllApplicant();

        for(Applicant str : allapplicants){
            System.out.println(str);
        }


        return allapplicants;
    }


    @RequestMapping(value = "/question", method = RequestMethod.GET)
    @ResponseBody
    public Question getquestion() {
        Question questionbyid = questionService.findQuestionById(1);


        return questionbyid;
    }

}