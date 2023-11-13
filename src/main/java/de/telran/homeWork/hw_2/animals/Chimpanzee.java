package de.telran.homeWork.hw_2.animals;

public class Chimpanzee extends Monkey{
    private boolean isToolUser; // использует ли эта Шимпанзе инструменты

    public Chimpanzee(int age, String breed, boolean isToolUser) {
        super(age, breed);
        this.isToolUser = isToolUser;
    }

    public boolean isToolUser() {
        return isToolUser;
    }

    public void setToolUser(boolean toolUser) {
        isToolUser = toolUser;
    }
}
