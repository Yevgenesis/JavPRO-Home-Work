package de.telran.homeWork.polling.studentsAssessment.repository;


import de.telran.homeWork.polling.studentsAssessment.entity.Question;

import java.util.List;

public interface QuestionsRepository {
    Question addQuestion(Question question);

    List<Question> getAllQuestions();
}
