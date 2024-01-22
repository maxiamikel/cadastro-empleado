package com.maxi.cadastroempleadoback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxi.cadastroempleadoback.domains.Salary;

public interface SalaryRepository extends JpaRepository<Salary, String> {

}
