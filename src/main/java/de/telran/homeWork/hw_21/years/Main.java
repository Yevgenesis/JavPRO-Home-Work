package de.telran.homeWork.hw_21.years;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    /*
1) Реализовать метод, который принимает год и проверяет на високосность.
2) вывести на консоль дату, локализованную для Индии (например)
3) вывести дату в формате 19-12-22, 19, 353, 11:47 <дата, день месяца, день в году, время>
4) создать дату своего рождения, вывести на консоль в формате "10 Января 1985"
5) проверить дата "10 Января 1985" - это пятница?
6) вычесть 10 лет из созданной даты, вывести на консоль
7) получить объект Instant из "2022-12-19T06:55:30.00Z", вывести на консоль
8) получить ZonedDateTime из "Pacific/Midway", вывести на консоль*/
    public static void main(String[] args) {
//  1) Реализовать метод, который принимает год и проверяет на високосность.
        isLeapYear(2023);


//  2) вывести на консоль дату, локализованную для Индии (например)
        Locale india = Locale.forLanguageTag("in");
        DateTimeFormatter indiaFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, hh:mm a", india);
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date.format(indiaFormatter));


//  3) вывести дату в формате 19-12-22, 19, 353, 11:47 <дата, день месяца, день в году, время>
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy, D, hh:mm");
        date = LocalDateTime.now();
        System.out.println(date.format(formatter));


//  4) создать дату своего рождения, вывести на консоль в формате "10 Января 1985"
        LocalDate myBirthDay = LocalDate.of(1980, 6, 18);
        Locale ru = Locale.forLanguageTag("ru");
        DateTimeFormatter rusFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", ru);
        System.out.println(myBirthDay.format(rusFormatter));


//  5) проверить дата "10 Января 1985" - это пятница?
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM yyyy", ru);
        LocalDate checkDate = LocalDate.parse("10 января 1985", format);
        DateTimeFormatter dayOfWeek = DateTimeFormatter.ofPattern("EEEE", ru);
        if ("FRIDAY".equals(checkDate.getDayOfWeek().toString())) {
            System.out.println(checkDate.format(format) + " - да, это пятница.");
        } else {
            System.out.println(checkDate.format(format) + " - это не пятница, а " + checkDate.format(dayOfWeek));
        }


//  6) вычесть 10 лет из созданной даты, вывести на консоль
        LocalDate myDate = LocalDate.of(2024, 6, 18);
        LocalDate newDate = myDate.minusYears(10);
        System.out.println(myDate + " - 10 лет = " + newDate);


//  7) получить объект Instant из "2022-12-19T06:55:30.00Z", вывести на консоль
        Instant instant = Instant.parse("2022-12-19T06:55:30.00Z");
        System.out.println(instant);


//  8) получить ZonedDateTime из "Pacific/Midway", вывести на консоль*/
        ZoneId zone = ZoneId.of("Pacific/Midway");
        ZonedDateTime dateTime = ZonedDateTime.now(zone);
        System.out.println(dateTime);
    }


    private static void isLeapYear(int year) {
        LocalDate date = LocalDate.of(year, 1, 1);

        if (date.isLeapYear())
            System.out.println(year + " год високосный");
        else
            System.out.println(year + " год не високосный");
    }
}
