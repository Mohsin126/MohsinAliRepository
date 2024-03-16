package com.java8.Stream;

import java.util.*;  
class Employee
{  
    int id;  
    String name;  
    float salary;  
    public Employee(int id, String name, float salary) 
    {  
        this.id = id;  
        this.name = name;  
        this.salary = salary;  
    }  
} 

public class CountMethodEx 
{  
    public static void main(String[] args) {  
        List<Employee> employeeList = new ArrayList<Employee>();  
          
        employeeList.add(new Employee(1,"Harry",25000));  
        employeeList.add(new Employee(2,"David",30000));  
        employeeList.add(new Employee(3,"Leo",28000));  
        employeeList.add(new Employee(4,"Shaun",28000));  
        employeeList.add(new Employee(5,"Adam",90000));  
          
        long count = employeeList.stream().filter(employee->employee.salary<30000).count();  
        System.out.println(count);  
    }  
} 