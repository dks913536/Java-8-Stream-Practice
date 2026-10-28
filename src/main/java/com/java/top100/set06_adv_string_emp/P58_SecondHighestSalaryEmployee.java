package com.java.top100.set06_adv_string_emp;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Problem 58: Find employee with second highest salary.
 *
 * Input:
 * Amit - 50000
 * Rahul - 70000
 * Rohit - 60000
 *
 * Output:
 * Rohit - 60000
 */
public class P58_SecondHighestSalaryEmployee {
    static class Employee{
        private int id;
        private String name;
        private  double salary;

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
                new Employee(3, "Rohit", 60000),
                new Employee(4, "Sumit", 70000)
        );
        // =====================================
        // Approach 1: salaries + sorted() without handle duplicate
        // =====================================
        Employee result1=employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(result1+" Duplicate salary not handle here.");
        // =====================================
        // Approach 2: distinct salaries + sorted()
        // =====================================
        Employee result2=employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .map(Employee::getSalary)
                .distinct()
                .skip(1)
                .findFirst()
                .flatMap(sal-> employees.stream()
                        .filter(emp->emp.getSalary()==sal)
                        .findFirst())
                .orElse(null);
        System.out.println(result2);
        /*
        Explanation:
            // sorted() -> sorts employees by salary
            // reversed() -> highest salary first
            // filter() -> removes employees having highest salary
            // findFirst() -> gets next highest employee
        */

        // =====================================
        // Approach 3: distinct salary + skip()
        // =====================================
        double secondHishestSal=employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0.0);
        System.out.println(secondHishestSal);

        Employee result3=employees.stream()
                .filter(emp->emp.getSalary() == secondHishestSal)
                .findFirst()
                .orElse(null);
        System.out.println(result3);
        /*
        Explanation:
            // map()      -> extracts salaries
            // distinct() -> removes duplicate salaries
            // sorted()   -> sorts salaries
            // reverseOrder() -> highest first
            // skip(1)    -> skips highest salary
            // findFirst() -> gets second highest salary
        */

    }
}
