package com.maxi.cadastroempleadoback.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.maxi.cadastroempleadoback.domains.Employee;
import com.maxi.cadastroempleadoback.dtos.employee.EmployeeDTO;
import com.maxi.cadastroempleadoback.services.employee.EmployeeServiceImplementation;

@RestController
@RequestMapping("/api/employees/")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImplementation employeeService;

    @PostMapping("/new")
    public ResponseEntity<?> createNewEmployee(@RequestBody EmployeeDTO obj) {
        Employee employee = new Employee();
        employee = employeeService.createNewEmployee(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getEmpId()).toUri();
        return ResponseEntity.created(uri).body(employee);
    }
}
