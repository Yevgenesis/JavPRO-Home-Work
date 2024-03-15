package de.telran.homeWork.polling.studentsAssessment.repository.impl;


import de.telran.homeWork.polling.studentsAssessment.entity.Question;
import de.telran.homeWork.polling.studentsAssessment.repository.QuestionsRepository;

import java.util.ArrayList;
import java.util.List;


public class QuestionsRepositoryImpl implements QuestionsRepository {
    private List<Question> questions = new ArrayList<>();


    public QuestionsRepositoryImpl(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public Question addQuestion(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public List<Question> getAllQuestions() {
        return List.copyOf(questions);
    }
}
