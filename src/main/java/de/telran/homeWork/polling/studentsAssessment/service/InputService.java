package de.telran.homeWork.polling.studentsAssessment.service;

import java.util.Scanner;

public class InputService {
    Scanner scanner;

    public InputService() {
        this.scanner = new Scanner(System.in);
    }

    public int getAnswer(int countOfQuestions) {
        while (true) {
            int answer = scanner.nextInt();
            if (answer > 0 && answer <= countOfQuestions) return answer;
            System.out.println("Wrong answer!!! There is not answer with number: " + answer);
        }

    }
}
