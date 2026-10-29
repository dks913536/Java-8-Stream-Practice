package com.java.top100.set07_emp_stream_api;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {
   public static List<Employee> getEmployees(){
       return Arrays.asList(
               new Employee(101, "Rahul", "IT", 80000),
               new Employee(102, "Amit", "HR", 50000),
               new Employee(103, "Priya", "IT", 90000),
               new Employee(104, "Neha", "Finance", 60000),
               new Employee(105, "Rahul", "HR", 55000),
               new Employee(106, "Vikash", "IT", 75000),
               new Employee(107, "Sneha", "Finance", 70000),
               new Employee(108, "Rohit", "HR", 45000)
       );
    }
}
