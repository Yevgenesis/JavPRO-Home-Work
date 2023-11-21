package de.telran.homeWork.hw_4.hensFactory;

import de.telran.homeWork.hw_4.hensFactory.entity.Hen;
import de.telran.homeWork.hw_4.hensFactory.entity.HenFactory;

/*
Написать Фабрику(Factory) по производству кур(Hen)
Создать класс Hen
1.1. Сделать его абстрактным
1.2. Добавить в класс абстрактный метод int getCountOfEggsPerMonth()
1.3. Добавить в класс метод String getDescription(), который возвращает строку "Я курица."
Создать класс RussianHen, который наследуется от Hen.
Создать класс UkrainianHen, который наследуется от Hen.
Создать класс MoldovanHen, который наследуется от Hen.
Создать класс BelarusianHen, который наследуется от Hen.
В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
Методы должны возвращать количество яиц в месяц от данного типа куриц.
В каждом из четырех последних классов написать свою реализацию метода getDescription.
Методы должны возвращать строку вида:
  + <" Моя страна - SSSSS. Я несу N яиц в месяц.">
где SSSSS - название страны
где N - количество яиц в месяц
В классе HenFactory реализовать метод getHen, который возвращает соответствующую стране породу кур
Все созданные вами классы должны быть в отдельных файлах
*/
public class DemoApp {
    public static void main(String[] args) {
        Hen ukrHen = HenFactory.getHen("ukraine");
        Hen belHen = HenFactory.getHen("belarus");
        Hen rusHen = HenFactory.getHen("russia");
        Hen moldHen = HenFactory.getHen("moldova");

        System.out.println(ukrHen.getDescription());
        System.out.println(belHen.getDescription());
        System.out.println(rusHen.getDescription());
        System.out.println(moldHen.getDescription());
    }
}
