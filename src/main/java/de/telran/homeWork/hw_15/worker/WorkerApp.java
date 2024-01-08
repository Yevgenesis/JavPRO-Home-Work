package de.telran.homeWork.hw_15.worker;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class WorkerApp {
    /*
    У нас есть профессия в строительстве - чернорабочий. Он может выполнять любые низкоквалифицированные работы
на стройке. На каждый день ему дается список работ, которые он должен выполнить, но не факт, в течении
рабочего времени его задание может не измениться. Напишите программу рабочего дня профессии, которая позволяет
динамический давать ему задание на работу, в любое нужное время. Применяйте функциональные интерфейсы.*/
    public static void main(String[] args) {
        Worker employer1 = new Worker("Джамшут", 55, true);
        Worker employer2 = new Worker("Василий", 29, false);

        // Работа по разгрузке кирпичей
        BiConsumer<Worker, Integer> loader = (employer, quantityBrick) -> {
            if (employer.age < 40)
                System.out.println(employer.name + " разгружает фуру с " + quantityBrick + " кирпичами.");
            else
                System.out.println(employer.name + " уже старый, чтобы быть грузчиком, ему уже " + employer.age + " лет.");
        };
        loader.accept(employer1, 1000);
        loader.accept(employer2, 2000);


        // Высотные работы на вышке
        Predicate<Worker> highRise = (employer) -> {
            if (employer.IsHighRiseWorker) System.out.println(employer.name + " полез на вышку");
            else System.out.println(employer.name + " не имеет сертификата высотных работ");
            return employer.IsHighRiseWorker; // пригодится для внешней проверки
        };
        highRise.test(employer1);
        highRise.test(employer2);


        // Замешать бетон
        BiFunction<Worker, Integer, Integer> mixer = (employer, cementKg) -> {
            System.out.println(employer.name + " мешает бетон из " + cementKg + " кг. цемента");
            return cementKg * 4; // Вода + цемент + песок
        };
        int beton = mixer.apply(employer1, 100);
        System.out.println(employer1.name + " замешал " + beton + " кг. бетона");

    }
}
