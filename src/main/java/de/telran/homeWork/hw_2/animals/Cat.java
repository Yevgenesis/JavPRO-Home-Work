package de.telran.homeWork.hw_2.animals;

public class Cat extends Pet{
    public Cat(int age, String breed, String owner, String name) {
        super(age, breed, owner, name);
    }

    public void getVoice(){
        System.out.println(name+ "  произнёс 'Мяу-мяу'");
    }
}
