package de.telran.homeWork.hw_16.employees;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class employeesApp {
    /*
Создать класс Employee с характеристиками:
        фамилия, имя, отчество
        должность
        отдел
        зарплата

1-Вычислить среднюю зарплату всех сотрудников
2-Получить список сотрудников с зп > 1000
3-Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
4-Получить сотрудника с самой низкой зп
5-Получить сотрудника с самой высокой зп
6-Получите сотрудников из всех отделов с максимальной зп
7-Сгруппировать сотрудников по должности
*/
    public static void main(String[] args) {
        List<Employee> office = new ArrayList<>();
        office.add(new Employee("Александр", "Сергеевич", "Пушкин", 2000, "директор", "маркетинг"));
        office.add(new Employee("Лев", "Николаевич", "Толстой", 1500, "программист", "разработка"));
        office.add(new Employee("Фёдор", "Михайлович", "Достоевский", 1000, "бизнес-разработчик", "маркетинг"));
        office.add(new Employee("Антон", "Павлович", "Чехов", 900, "дизайнер", "разработка"));
        office.add(new Employee("Михаил", "Афанасьевич", "Булгаков", 800, "охрана", "безопасность"));
        office.add(new Employee("Иван", "Александрович", "Гончаров", 700, "охрана", "безопасность"));
        office.add(new Employee("Николай", "Васильевич", "Гоголь", 600, "охрана", "безопасность"));
        office.add(new Employee("Сергей", "Александрович", "Есенин", 950, "бухгалтер", "финансы"));
        office.add(new Employee("Иван", "Сергеевич", "Тургенев", 750, "бухгалтер", "финансы"));

//        System.out.println(office);


//  1-Вычислить среднюю зарплату всех сотрудников
        double avgSalary = office.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
        System.out.println("Средняя зарплата сотрудников: " + avgSalary);


//  2-Получить список сотрудников с зп > 1000
        System.out.println("\nСписок сотрудников с зарплатой > 1000:");
        office.stream()
                .filter(s -> s.getSalary() > 1000)
                .forEach(System.out::println);


//  3-Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
        System.out.println("\nОтдел маркетинга с увеличенной зп на 15%:");
        office.stream()
                .filter(s -> s.getDepartment().equals("маркетинг"))
                .peek(s -> s.setSalary(s.getSalary() * 1.15))
                .forEach(System.out::println);


//  4-Получить сотрудника с самой низкой зп
        Employee poorEmployee = office.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .orElse(null);
        System.out.println("\nСотрудник с самой низкой зарплатой:");
        System.out.println(poorEmployee);


//  5-Получить сотрудника с самой высокой зп
        Employee richEmployee = office.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);
        System.out.println("Сотрудник с самой высокой зарплатой:");
        System.out.println(richEmployee + "\n");


//  6-Получите сотрудников из всех отделов с максимальной зп
        office.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.minBy(Comparator.comparing(Employee::getSalary))))
                .forEach((s, e) -> System.out.println(s.toUpperCase() + ": " + e.orElse(null)));
        System.out.println();


//  7-Сгруппировать сотрудников по должности
        Map<String, List<Employee>> mapEmployees = office.stream()
                .collect(Collectors.groupingBy(Employee::getPosition));
        // вывод в консоль
        for (Map.Entry<String, List<Employee>> employee : mapEmployees.entrySet()) {
            System.out.println(employee.getKey().toUpperCase() + ":");
            employee.getValue().forEach(s -> System.out.println("\t" + s));
        }
    }
}




