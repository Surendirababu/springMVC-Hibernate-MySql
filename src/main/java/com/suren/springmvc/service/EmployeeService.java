package com.suren.springmvc.service;
 
import java.util.List;
 
import com.suren.springmvc.model.Employee;
 
public interface EmployeeService {
 
    Employee findById(int id);
     
    void saveEmployee(Employee employee);
     
    void updateEmployee(Employee employee) throws Exception ;
     
    void deleteEmployeeBySsn(String ssn);
 
    List<Employee> findAllEmployees(); 
     
    Employee findEmployeeBySsn(String ssn);
 
    boolean isEmployeeSsnUnique(Integer id, String ssn);
     
}