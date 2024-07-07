package com.quizapp.quizApp.controller;


import com.quizapp.quizApp.Question;
import com.quizapp.quizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestion")
    public List<Question> getAllQuestion(){
        return questionService.getAllquestion();
    }
}
