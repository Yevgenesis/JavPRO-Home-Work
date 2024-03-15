package de.telran.homeWork.polling.studentsAssessment.repository.impl;


import de.telran.homeWork.polling.studentsAssessment.entity.Student;
import de.telran.homeWork.polling.studentsAssessment.repository.StudentsRepository;

import java.util.List;

public class StudentsRepositoryImpl implements StudentsRepository {
    List<Student> students;

    public StudentsRepositoryImpl(List<Student> students) {
        this.students = students;
    }

    public Student addStudent(Student student) {
        // тут будет проверка студента
        students.add(student);

        return student;
    }

    public List<Student> getAllStudents() {
        return List.copyOf(students);
    }

    @Override
    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) return student;
        }

        throw new Error("Student with id:" + id + " is absent");
    }
}
