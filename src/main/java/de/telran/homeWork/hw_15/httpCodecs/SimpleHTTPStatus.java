package de.telran.homeWork.hw_15.httpCodecs;

public class SimpleHTTPStatus {
    /*
    Переработать приложение SimpleHTTPStatus, которое мы реализовали в классе, чтобы оно вместо
 созданного нами вручную интерфейса Action использовало один из стандартных функциональных интерфейсов.
*/
    public static void main(String[] args) {
        // поменял Action на BiConsumer
        HttpCodes.findValueByCode(101);
        HttpCodes.findValueByCode(202);
        HttpCodes.findValueByCode(303);
        HttpCodes.findValueByCode(404);
        HttpCodes.findValueByCode(505);
    }
}

