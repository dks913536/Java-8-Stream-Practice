package com.java.top100.set07_emp_stream_api;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Problem 61: Group employees by department.
 *
 * Input: List of employees
 * Output: Map containing department and its employees
 */
public class P61_GroupEmployeesByDepartment {
    public static void main(String[] args) {
        List<Employee> employees=EmployeeData.getEmployees();

        // =====================================
        // Approach 1: Using groupingBy()
        // =====================================
        Map<String,List<Employee>> result1=employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(result1);

        /*
         * Explanation:
         *
         * stream() - Creates a stream from the employee list.
         *
         * Collectors.groupingBy(Employee::getDepartment)
         * - Groups employees using their department as the key.
         *
         * collect() - Collects the grouped results into a Map.
         *
         * Result:
         * Map<String, List<Employee>>
         */

        // =====================================
        // Approach 2: Using groupingBy() + LinkedHashMap to preserve order
        // =====================================
        Map<String, List<Employee>> result2=employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        LinkedHashMap::new,
                        Collectors.toList()
                ));
        System.out.println(result2);
        /*
         * Explanation:
         * LinkedHashMap::new-> preserve the insertion order
         */

        // =====================================
        // Approach 3: Using groupingBy() + mapping(only names in output)
        // =====================================
        Map<String,List<String>> result3=employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(
                                Employee::getName,
                                Collectors.toList()
                        )
                ));
        System.out.println(result3);
    }
}
