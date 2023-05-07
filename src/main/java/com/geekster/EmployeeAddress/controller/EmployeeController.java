package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    /*GET /employees - get all employees
    GET /employees/{id} - get an employee by id
    POST /employees - create a new employee
    PUT /employees/{id} - update an employee by id
    DELETE /employees/{id} - delete an employee by id*/

    @GetMapping("/")
    public Iterable<Employee> getAll(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id){
        return employeeService.getById(id);
    }

    @PostMapping("/")
    public String postEmployeeList(@RequestBody List<Employee> list){
        return employeeService.addList(list);
    }

    @PutMapping("/{id}")
    public String updateById(@PathVariable Long id, @RequestBody Employee employee){
        return employeeService.updateById(id, employee);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        employeeService.deleteById(id);
    }
}
