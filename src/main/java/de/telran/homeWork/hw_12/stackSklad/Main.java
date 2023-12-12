package de.telran.homeWork.hw_12.stackSklad;

import java.util.Stack;

public class Main {
    /*1) Вы работаете на складе, который продает один вид продукции, не имеющий сроков хранения, например кирпич.
У вас всего одни двери на складе, через которые вы загружаете новый товар и отгружаете заказчикам тоже через эту же дверь.
Как бы вы построили рабочий процесс на Вашем складе, какую бы коллекцию использовали для имитации процесса работы?
Напишите программу, которая бы имитировала работу.
*/
    public static void main(String[] args) {
        Stack<Integer> stackSklad = new Stack<>();

        // Партии кирпичей
        int kirpichi1 = 1000;
        int kirpichi2 = 200;
        int kirpichi3 = 3200;
        int kirpichi4 = 4600;

        stackSklad.push(kirpichi1);
        stackSklad.push(kirpichi2);
        stackSklad.push(kirpichi3);
        stackSklad.push(kirpichi4);

        System.out.println(stackSklad);

        System.out.println(stackSklad.peek()); // Ближе к выходу последний добавленный набор: kirpichi4 = 4600

        // Разгрузить склад
        while (!stackSklad.empty()) {
            System.out.println(stackSklad.pop());
        }
    }
}
