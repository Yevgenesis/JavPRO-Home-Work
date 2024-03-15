package de.telran.homeWork.polling.studentsAssessment;


import de.telran.homeWork.polling.studentsAssessment.service.PollingService;

import java.io.IOException;

public class StudentsAssessmentDemo {
    /*
    2) Программа по проведению опроса студентов
Описание:
Программа хранит в ресурсах файл с вопросами для студентов в виде текстового файла(csv,xml и т.д.)
Программа спрашивает у пользователя фамилию, имя и номер группы и задает вопросы из текстового файла.
Требования:
1) В ресурсах приложения хранятся вопросы и ответы к ним в виде текстового файла(5-7 вопросов).
2) Приложение должно выводить вопросы из текстового файла с возможными вариантами ответов.
3) Отдаём предпочтение объектам и классам, а не строчкам и массивам.
4) Все классы в приложении должны решать строго определённую задачу (помним про SRP).
5) Контекст описывается XML-файлом.
6) Все зависимости настраиваем с помощью IoC контейнера.
7) Имя ресурса с вопросами (текстовый файл) необходимо указывать в XML-файле с контекстом.
8) Весь ввод-вывод осуществляется на английском языке.*/
    public static void main(String[] args) throws IOException {
        String questionsFileName = "src/main/resources/questions.txt";
        String studentsFileName = "src/main/resources/students.txt";


        PollingService pollingService = new PollingService();
        pollingService.run(questionsFileName, studentsFileName);


    }
}
