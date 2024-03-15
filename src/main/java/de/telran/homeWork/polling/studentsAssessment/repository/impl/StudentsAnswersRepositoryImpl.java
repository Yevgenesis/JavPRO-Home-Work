package de.telran.homeWork.polling.studentsAssessment.repository.impl;


import de.telran.homeWork.polling.studentsAssessment.repository.StudentsAnswers;

import java.util.HashMap;
import java.util.Map;

public class StudentsAnswersRepositoryImpl implements StudentsAnswers {

    Map<Integer, Map<Integer, Integer>> studentsAnswerMap = new HashMap<>();// Map<Student_ID, Map<Question_ID, Answer_Index>>

    @Override
    public void addStudentAnswers(int studentID, int questionID, int answerIndex) {
        Map<Integer, Integer> studentAnswer = studentsAnswerMap.getOrDefault(studentID, new HashMap<>());
        studentAnswer.put(questionID, answerIndex);
        studentsAnswerMap.put(studentID, studentAnswer);
    }

    @Override
    public Map<Integer, Integer> getAnswersByStudentID(int studentID) {
        return studentsAnswerMap.get(studentID);
    }

    @Override
    public Map<Integer, Map<Integer, Integer>> getAllStudentsAnswers() {
        return Map.copyOf(studentsAnswerMap);
    }


}
