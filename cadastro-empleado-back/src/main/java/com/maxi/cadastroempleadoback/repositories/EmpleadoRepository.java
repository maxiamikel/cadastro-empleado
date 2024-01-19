package com.maxi.cadastroempleadoback.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.maxi.cadastroempleadoback.domains.Employee;

public interface EmpleadoRepository extends JpaRepository<Employee, String> {

    @Query("SELECT e FROM Employee e")
    List<Employee> findAllEmpleado();
}
