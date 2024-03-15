package de.telran.homeWork.polling.studentsAssessment.service;


import de.telran.homeWork.polling.studentsAssessment.entity.Question;
import de.telran.homeWork.polling.studentsAssessment.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    private static int questionID;

    public static List<Question> convertStringsToQuestions(List<String> stringsOfQuestions) {
        List<Question> questions = new ArrayList<>();

        for (String each : stringsOfQuestions) {
            String[] questionProperty = each.split(";");
            String description = questionProperty[0];
            String[] answersOptions = {questionProperty[1], questionProperty[2]};
            int correctAnswerIndex = Integer.parseInt(questionProperty[3]);
            // Присвоение ID и создание объекта вопроса
            Question question = new Question(++questionID, description, answersOptions, correctAnswerIndex);
            questions.add(question);
        }

        return questions;
    }

    public static List<Student> convertStringsToStudents(List<String> stringsOfStudents) {
        List<Student> students = new ArrayList<>();

        Student student = null;
        for (String eachLine : stringsOfStudents) {
            String[] studentProperty = eachLine.split(";");
            int id = Integer.parseInt(studentProperty[0]);
            String[] fullName = studentProperty[1].split(" ");
            student = new Student(id, fullName[0], fullName[1]);
            students.add(student);
        }

        return students;
    }


}
