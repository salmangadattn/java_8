package Question_4;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Question_4 {

    public static void main(String[] args) {

        // Collect all  even numbers from a list using stream
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 5, 6, 7, 8, 9, 10, 44, 12, 33, 4, 12));

        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        // Employee filter

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Raj sharma", 200L, "delhi"));
        employees.add(new Employee("Karan Gupta", 300L, "delhi"));
        employees.add(new Employee("Salman Gada", 20000L, "Lucknow"));
        employees.add(new Employee("Raj Shobit", 200L, "delhi"));
        employees.add(new Employee("Hardik taneja", 20000L, "Kolkata"));
        employees.add(new Employee("sumit kumar", 20000L, "delhi"));
        employees.add(new Employee("Raj sharma", 2000L, "Pune"));


        System.out.println(employees.stream()
                .filter(employee -> employee.getSalary() < 5000L && employee.getCity().equals("delhi"))
                .map(e->e.getFullName().split(" ")[0])
                .collect(Collectors.toSet()));;


    }


}
