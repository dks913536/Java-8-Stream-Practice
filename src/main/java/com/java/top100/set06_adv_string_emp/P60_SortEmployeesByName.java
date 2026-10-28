package com.java.top100.set06_adv_string_emp;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 60: Sort employees by name.
 *
 * Input:
 * Rahul
 * Amit
 * Rohit
 *
 * Output:
 * Amit
 * Rahul
 * Rohit
 */
public class P60_SortEmployeesByName {
    static class Employee {

        private int id;
        private String name;
        private double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return id + " - " + name + " - " + salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rahul", 70000),
                new Employee(2, "Amit", 50000),
                new Employee(3, "Rohit", 60000)
        );

        // =====================================
        // Approach 1: sorted() + Comparator.comparing()
        // =====================================
        List<Employee> sorted1=employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println(sorted1);
        /*
        Explanation:
            // sorted() -> sorts employees
            // comparing() -> compares employee names
            // collect() -> converts Stream to List
        */
        // =====================================
        // Approach 2: sorted() + lambda
        // =====================================
        List<Employee> sorted2 = employees.stream()
                .sorted((emp1,emp2)-> emp1.getName().compareTo(emp2.getName()))
                .collect(Collectors.toList());
        System.out.println(sorted2);
    }
}
