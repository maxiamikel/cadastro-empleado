package com.maxi.cadastroempleadoback.domains;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id = UUID.randomUUID().toString();

    private BigDecimal amount;

    @OneToMany(mappedBy = "salary")
    private List<Employee> employees;

    public Salary() {
        super();
    }

    public Salary(BigDecimal amount, List<Employee> employees) {
        this.amount = amount;
        this.employees = employees;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmploye(Employee employee) {
        this.employees.add(employee);
    }

}
