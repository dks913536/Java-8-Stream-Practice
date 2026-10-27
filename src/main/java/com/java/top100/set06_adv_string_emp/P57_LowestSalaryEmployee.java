package com.java.top100.set06_adv_string_emp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P57_LowestSalaryEmployee {
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
                new Employee(3, "Rohit", 60000)
        );
        // =====================================
        // Approach 1: min() + Comparator.comparing()
        // =====================================
        Employee result1 =employees.stream()
                        .min(Comparator.comparingDouble(Employee::getSalary))
                        .orElse(null);
        System.out.println(result1);

        /*
        Explanation:
            // min() -> finds minimum salary
            // comparing() -> compares salary
            // orElse() -> handles empty Stream
        */
        // =====================================
        // Approach 2: min() + lambda
        // =====================================
        Employee result2=employees.stream()
                .min((emp1,emp2)-> Double.compare(emp1.getSalary(), emp2.getSalary()))
                .orElse(null);
        System.out.println(result2);

        // =====================================
        // Approach 3: reduce() + lambda
        // =====================================
        Employee result3=employees.stream()
                .reduce((emp1,emp2)->emp1.getSalary() < emp2.getSalary() ? emp1:emp2)
                .orElse(null);
        System.out.println(result3);

        // =====================================
        // Approach 4: return only salary not returning Employee
        // =====================================
        double minSalary=employees.stream()
                .mapToDouble(Employee::getSalary)
                .min()
                .orElse(0);
        System.out.println(minSalary);
    }
}
