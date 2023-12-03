package de.telran.homeWork.hw_8.arrayListTasks;

public class MyClass {
    String word;
    int num;

    public MyClass(int num) {
        this.num = num;
    }

    public MyClass(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "word='" + word + '\'' +
                ", num=" + num +
                '}';
    }
}
