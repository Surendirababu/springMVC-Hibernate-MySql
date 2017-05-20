package com.suren.springmvc.dao;
 
import java.util.List;

import com.suren.springmvc.model.Employee;

public interface EmployeeDao {
 
    Employee findById(int id);
 
    void saveEmployee(Employee employee);
     
    void deleteEmployeeBySsn(String ssn);
     
    List<Employee> findAllEmployees();
 
    Employee findEmployeeBySsn(String ssn);

    Employee updateEmployee(Employee employee) throws Exception ;
 
}