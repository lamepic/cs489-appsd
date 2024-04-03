package org.example;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        var employeeData = loadEmployeeData();

        printEmployeeJson(employeeData);
        System.out.println();
        printMonthlyUpcomingEnrollees(employeeData);
    }

    public static Employee[] loadEmployeeData(){
        return new Employee[] {
                new Employee(1, "Daniel", "Agar", LocalDate.of(2018, 1,17), 105945.50, "EX1089", LocalDate.of(2023,1,17), 100.00),
                new Employee(2, "Benard", "Shaw", LocalDate.of(2019, 4,3), 197750.00),
                new Employee(3, "Carly", "Agar", LocalDate.of(2014, 5,16), 842000.75, "SM2307", LocalDate.of(2023,1,17), 1555.50),
                new Employee(4, "Wesley", "Schneider", LocalDate.of(2019, 5,2), 74500.00),
        };
    }

    public static void printEmployeeJson(Employee[] employees){
        System.out.println("Employee List");
        System.out.println("-----------------------------------");
        var result = Arrays.stream(employees)
                .filter(employee -> employee.getPensionPlan() != null)
                .sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getYearlySalary).reversed())
                .map(Employee::toJson).toArray();
        printJsonFormat(result);
    }

    public static void printMonthlyUpcomingEnrollees(Employee[] employees){
        System.out.println("Monthly Upcoming Enrollees Report");
        System.out.println("-------------------------------------");
        var result = Arrays.stream(employees)
                .filter(Employee::isUpcomingEnrollee)
                .sorted(Comparator.comparing(Employee::getEmploymentDate))
                .map(Employee::toJson).toArray();
        printJsonFormat(result);
    }

    public static void printJsonFormat(Object[] result){
        System.out.println("[");
        Arrays.stream(result).forEach(System.out::println);
        System.out.println("]");
    }
}