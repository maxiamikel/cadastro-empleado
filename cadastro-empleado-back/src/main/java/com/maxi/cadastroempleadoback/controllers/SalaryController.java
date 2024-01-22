package com.maxi.cadastroempleadoback.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.maxi.cadastroempleadoback.domains.Salary;
import com.maxi.cadastroempleadoback.services.salary.SalaryService;

@RestController
@RequestMapping("/api/salaries/")
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    @PostMapping("/new")
    public ResponseEntity<?> createSalary(@RequestBody Salary salary) {
        Salary obj = salaryService.createSalary(salary);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path(("/{id}")).buildAndExpand(salary.getId())
                .toUri();
        return ResponseEntity.created(uri).body(obj);
    }

}
