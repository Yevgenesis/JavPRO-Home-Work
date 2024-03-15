package de.telran.homeWork.polling.studentsAssessment.entity;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String firstName;
    private String lastName;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
