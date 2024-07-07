package com.quizapp.quizApp.dao;

import com.quizapp.quizApp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Questiondao extends JpaRepository<Question, Integer> {
}
