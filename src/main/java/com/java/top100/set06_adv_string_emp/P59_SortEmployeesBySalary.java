package com.java.top100.set06_adv_string_emp;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 59: Sort employees by salary.
 *
 * Input:
 * Amit - 50000
 * Rahul - 70000
 * Rohit - 60000
 *
 * Output:
 * Amit - 50000
 * Rohit - 60000
 * Rahul - 70000
 */
public class P59_SortEmployeesBySalary {
    static class Employee {

        private int id;
        private String name;
        private double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return id + " - " + name + " - " + salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Amit", 50000),
                new Employee(2, "Rahul", 70000),
                new Employee(3, "Rohit", 60000)
        );

        // =====================================
        // Approach 1: sorted() + Comparator.comparing()
        // =====================================
        List<Employee> sorted1=employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println(sorted1);

        /*
        Explanation:
            // sorted() -> sorts Stream elements
            // comparing() -> compares employees by salary
            // collect() -> converts Stream back to List
        */
        // =====================================
        // Approach 2: sorted() + lambda
        // =====================================
        List<Employee> sorted2 = employees.stream()
                .sorted((emp1, emp2) ->
                        Double.compare(emp1.getSalary(), emp2.getSalary()))
                .collect(Collectors.toList());

        System.out.println(sorted2);
    }
}
