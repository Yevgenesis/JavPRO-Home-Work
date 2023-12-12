package de.telran.homeWork.hw_12.queueSklad;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    /*
    2) Тот же склад, что и в случае п. 1, но у Вас есть две двери
    - одна в начале склада, вторая в конце. Как бы вы построили оптимальный рабочий процесс
    на Вашем складе, какую бы коллекцию использовали для имитации процесса работы?
    Напишите программу, которая бы имитировала работу.
    */
    public static void main(String[] args) {

        Queue<Integer> queueSklad = new LinkedList<>();

        // Партии кирпичей
        int kirpichi1 = 1000;
        int kirpichi2 = 200;
        int kirpichi3 = 3200;
        int kirpichi4 = 4600;

        queueSklad.add(kirpichi1);
        queueSklad.add(kirpichi2);
        queueSklad.add(kirpichi3);
        queueSklad.add(kirpichi4);

        System.out.println(queueSklad);

        System.out.println(queueSklad.peek()); // Ближе к выходу первый добавленный набор: kirpichi1 = 1000

        // Разгрузить склад
        while (!queueSklad.isEmpty()) {
            System.out.println(queueSklad.poll());
        }

    }
}
