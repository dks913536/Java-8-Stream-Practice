package com.java.top100.set07_emp_stream_api;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Problem 63: Calculate average salary by department.
 *
 * Input: List of employees
 * Output: Average salary for each department
 */
public class P63_AverageSalaryByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();

        // =====================================
        // Approach 1: Using averagingDouble()
        // =====================================
        Map<String,Double> result1=employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        System.out.println("Average Salary :"+result1);
        /*
         * Explanation:
         *
         * groupingBy(Employee::getDepartment)
         * - Groups employees by department.
         *
         * averagingDouble(Employee::getSalary)
         * - Calculates the average salary in each group.
         *
         * collect()
         * - Returns Map<String, Double>.
         *
         * Double represents the average salary.
         */

        // =====================================
        // Approach 2: Using summingDouble for total salary
        // =====================================
        Map<String,Double> result2=employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.summingDouble(Employee::getSalary)
                        ));
        System.out.println("Total Salary :"+result2);
    }
}
