package com.maxi.cadastroempleadoback.services.salary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.cadastroempleadoback.domains.Salary;
import com.maxi.cadastroempleadoback.repositories.SalaryRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SalaryServiceImplementation implements SalaryService {

    @Autowired
    private SalaryRepository salaryRepository;

    @Override
    public Salary createSalary(Salary obj) {
        Salary salary = new Salary(obj.getAmount());
        return salaryRepository.save(salary);
    }

}
