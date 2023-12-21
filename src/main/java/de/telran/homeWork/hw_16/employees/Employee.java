package de.telran.homeWork.hw_16.employees;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Employee {
    private String first_name;
    private String patronymic_name;
    private String last_name;

    private double salary;
    private String position;
    private String department;

    @Override
    public String toString() {
        return "name: " + last_name + " " + first_name.charAt(0) + "." + patronymic_name.charAt(0) + "." +
                ", salary: €" + salary +
                ", position: " + position.toUpperCase() +
                ", department: " + department.toUpperCase();
    }
}
