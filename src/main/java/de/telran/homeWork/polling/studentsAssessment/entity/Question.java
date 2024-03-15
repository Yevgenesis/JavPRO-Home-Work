package de.telran.homeWork.polling.studentsAssessment.entity;

import lombok.Data;

import java.util.Arrays;

@Data
public class Question {


    private int id;
    private String description;
    private String[] answersOptions;

    private int correctAnswerIndex;

    public Question(int id, String description, String[] answersOptions, int correctAnswerIndex) {
        this.id = id;
        this.description = description;
        this.answersOptions = answersOptions;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    @Override
    public String toString() {
        return "{id:" + id +
                ", description:'" + description + '\'' +
                ", answersOptions:" + Arrays.toString(answersOptions) +
                ", correctAnswerIndex:" + correctAnswerIndex +
                '}';
    }
}
