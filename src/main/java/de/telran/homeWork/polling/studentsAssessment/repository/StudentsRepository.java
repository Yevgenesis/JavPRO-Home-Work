package de.telran.homeWork.polling.studentsAssessment.repository;


import de.telran.homeWork.polling.studentsAssessment.entity.Student;

import java.util.List;

public interface StudentsRepository {
    Student addStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(int id);
}
