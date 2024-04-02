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
        var EX1089 = new PensionPlan("EX1089", LocalDate.of(2023,1,17), 100.00);
        var SM2307 = new PensionPlan("SM2307", LocalDate.of(2023,1,17), 1555.50);

        return new Employee[] {
                new Employee(1, "Daniel", "Agar", LocalDate.of(2018, 1,17), 105945.50, EX1089),
                new Employee(2, "Benard", "Shaw", LocalDate.of(2019, 4,3), 197750.00),
                new Employee(3, "Carly", "Agar", LocalDate.of(2014, 5,16), 842000.75, SM2307),
                new Employee(4, "Wesley", "Schneider", LocalDate.of(2019, 5,2), 74500.00),

        };
    }

    public static void printEmployeeJson(Employee[] employees){
        System.out.println("Employee List");
        System.out.println("-----------------------------------");
        Arrays.stream(employees)
                .filter(employee -> employee.getPensionPlan() != null)
                .sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getYearlySalary).reversed())
                .map(Employee::toJson)
                .forEach(System.out::println);
    }

    public static void printMonthlyUpcomingEnrollees(Employee[] employees){
        System.out.println("Monthly Upcoming Enrollees Report");
        System.out.println("-------------------------------------");
        Arrays.stream(employees)
                .filter(employee -> employee.getPensionPlan() == null)
                .filter(employee -> {
                    var now = LocalDate.now().plusMonths(1);
                    var employeeDate = employee.getEmploymentDate().plusYears(5);
                    return now.getMonth() == employeeDate.getMonth();
                })
                .sorted(Comparator.comparing(Employee::getEmploymentDate))
                .map(Employee::toJson)
                .forEach(System.out::println);
    }
}