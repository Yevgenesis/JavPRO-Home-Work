package de.telran.homeWork.hw_6.logistics;

import de.telran.homeWork.hw_6.logistics.transports.Transport;
import de.telran.homeWork.hw_6.logistics.transports.TravelAgency;

/*
1) Вы строите предприятие по перевозке пассажиров.
Постройте приложение, которое позволит пассажиру находить более удобный транспорт (Самолет, Автобус, Поезд и т.п.)
для поездки исходя из 2-х пожеланий: более низкой стоимости и более быстрого времени доставки.
*/
public class FindTransportApp {
    public static void main(String[] args) {
        TravelAgency agency = new TravelAgency();

        double distance = 500;
        Transport myTransport = agency.getOptimalTransport(distance);
        myTransport.startTheJourney(distance);
    }
}
