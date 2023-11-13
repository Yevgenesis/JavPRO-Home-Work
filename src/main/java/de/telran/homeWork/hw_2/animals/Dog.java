package de.telran.homeWork.hw_2.animals;

public class Dog extends Pet{

    public Dog(int age, String breed, String owner, String name) {
        super(age, breed, owner, name);
    }

    public void getVoice(){
        System.out.println(name+ "  загавкал 'Гав-Гав_гав'");
    }

}
