package com.java.top100.set07_emp_stream_api;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Problem 62: Count employees by department.
 *
 * Input: List of employees
 * Output: Employee count for each department
 */
public class P62_CountEmployeesByDepartment {
    public static void main(String[] args) {
        List<Employee> employees=EmployeeData.getEmployees();

        // =====================================
        // Approach 1: Using groupingBy() and counting()
        // =====================================
        Map<String,Long> result1=employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));
        System.out.println(result1);
        /*
         * Explanation:
         *
         * groupingBy(Employee::getDepartment)
         * - Groups employees according to department.
         *
         * counting()
         * - Counts the employees in each group.
         *
         * collect()
         * - Returns the result as Map<String, Long>.
         *
         * Long is used because Collectors.counting()
         * returns a Long value.
         */
    }
}
