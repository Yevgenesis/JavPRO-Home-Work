package de.telran.homeWork.hw_13.routeFinding;

import java.util.HashMap;
import java.util.Map;

public class RouteApp {
    /*
    Найти маршрут из заданного списка билетов
Учитывая список билетов, найти маршрут по порядку, используя данный список.
Вход:
«Berlin» -> «London»
«Tokyo» -> «Seoul»
«Mumbai» -> «Berlin»
«Seoul» -> «Mumbai»
Выход:
Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->Lindon*/
    public static void main(String[] args) {

        Map<String, String> routes = new HashMap<>();
        routes.put("Berlin", "London");
        routes.put("Tokyo", "Seoul");
        routes.put("Mumbai", "Berlin");
        routes.put("Seoul", "Mumbai");

        String origin = "Seoul";
        String destination = "London";
        System.out.println(myRouteFinder(routes, origin, destination));
    }

    public static String myRouteFinder(Map<String, String> routes, String origin, String destination) {
        StringBuilder myRoute = new StringBuilder();
        if (origin.equals(destination)) {
            // Если одинаковый пункт назначения и оправки
            System.out.println("Вы уже на месте, вам не нужно, ни куда ехать");
        } else {
            String temp = origin;
            for (int i = 0; i < routes.size(); i++) {
                myRoute.append(temp).append(" -> ").append(routes.get(temp));
                if (routes.get(temp).equals(destination)) return myRoute.toString();
                myRoute.append(", ");
                temp = routes.get(temp);
            }
        }
        return "Вш маршрут отсутствует";
    }
}
