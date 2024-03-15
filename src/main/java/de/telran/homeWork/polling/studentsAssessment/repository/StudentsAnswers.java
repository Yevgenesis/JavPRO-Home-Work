package de.telran.homeWork.polling.studentsAssessment.repository;

import java.util.Map;

public interface StudentsAnswers {
    void addStudentAnswers(int studentID, int questionID, int answerIndex);

    Map<Integer, Integer> getAnswersByStudentID(int studentID);

    Map<Integer, Map<Integer, Integer>> getAllStudentsAnswers();

}
