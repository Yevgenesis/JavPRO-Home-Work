package de.telran.homeWork.polling.studentsAssessment.service;


import de.telran.homeWork.polling.studentsAssessment.entity.Question;
import de.telran.homeWork.polling.studentsAssessment.entity.Student;
import de.telran.homeWork.polling.studentsAssessment.repository.impl.QuestionsRepositoryImpl;
import de.telran.homeWork.polling.studentsAssessment.repository.impl.StudentsAnswersRepositoryImpl;
import de.telran.homeWork.polling.studentsAssessment.repository.impl.StudentsRepositoryImpl;

import java.io.IOException;
import java.util.List;

public class PollingService {
    private InputService inputService;
    private StudentsRepositoryImpl studentsRepository;
    private QuestionsRepositoryImpl questionsRepository;
    private StudentsAnswersRepositoryImpl answersRepository;


    public void run(String questionsFileName, String studentsFileName) throws IOException {

        List<String> questionsList = FileReaderService.readFile(questionsFileName);
        List<String> studentsList = FileReaderService.readFile(studentsFileName);

        List<Question> questions = Converter.convertStringsToQuestions(questionsList);
        questionsRepository = new QuestionsRepositoryImpl(questions);

        List<Student> students = Converter.convertStringsToStudents(studentsList);
        studentsRepository = new StudentsRepositoryImpl(students);

        inputService = new InputService();
        answersRepository = new StudentsAnswersRepositoryImpl();
        System.out.println("=========== START POLLING ===========");


        for (Student student : studentsRepository.getAllStudents()) {
            System.out.println("\nQuestions for Student: " + student.getFirstName() + " " + student.getLastName());
            for (Question question : questionsRepository.getAllQuestions()) {
                System.out.println("Question: " + question.getId());
                System.out.println(question.getDescription());

                for (int num = 0; num < question.getAnswersOptions().length; num++) {
                    System.out.println(num + 1 + " - " + question.getAnswersOptions()[num]);
                }
                int indexAnswer = inputService.getAnswer(question.getAnswersOptions().length);
                answersRepository.addStudentAnswers(student.getId(), question.getId(), indexAnswer);
            }
            System.out.println("Right answers is:");
            for (Question question : questionsRepository.getAllQuestions()) {
                System.out.println(question.getDescription());
                System.out.println("Right answer is: " + (question.getCorrectAnswerIndex() + 1));
                System.out.println("Student answer is: " + answersRepository.getAnswersByStudentID(student.getId()).get(question.getId()));
            }


        }
        System.out.println("=========== POLLING IS FINISH ===========");

    }


}
