package com.quizapp.quizApp.service;

import com.quizapp.quizApp.Question;
import com.quizapp.quizApp.dao.Questiondao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    Questiondao questiondao;
    public List<Question> getAllquestion(){
        return questiondao.findAll();
    }
}
