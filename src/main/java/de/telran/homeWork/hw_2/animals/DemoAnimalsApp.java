package de.telran.homeWork.hw_2.animals;

public class DemoAnimalsApp {
/*3*. Есть классы Животное, Домашнее животное, Собака, Корова, Кот, Тигр, Лев, Обезьяна, Орангутан, Шимпанзе
        Построй правильную цепочку наследование классов на Java.
        Характеристики и поведение - на свое усмотрение. */
    public static void main(String[] args) {
        Cat cat = new Cat(2,"Siamese","Alex","Barsik");
        Dog dog = new Dog(4,"Bulldog","Artyom","Barbos" );
        Cow cow = new Cow(2,"GoLand", "Pastuh Vasiliy", "Burenka", 300);
        Tiger tiger = new Tiger(5,"Bengalsky");
        Lion lion = new Lion(3,"Persia","Orange");
        Chimpanzee chimpanzee = new Chimpanzee(3,"Bonobo",true);
        Orangutan orangutan = new Orangutan(5,"Mountain","brown");
    }
}
