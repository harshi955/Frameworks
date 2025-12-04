package com.test.RealTimeDemo_SpringBoot.Service;

import java.util.List;

import com.test.RealTimeDemo_SpringBoot.Entity.Employee;

public interface EmployeeService {
    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}