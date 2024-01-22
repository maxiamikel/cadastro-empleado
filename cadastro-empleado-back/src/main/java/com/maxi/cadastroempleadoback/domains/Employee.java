package com.maxi.cadastroempleadoback.domains;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.maxi.cadastroempleadoback.enums.Department;
import com.maxi.cadastroempleadoback.enums.Gender;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Employee extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.UUID)
    private String empId;
    private String post;

    @Temporal(TemporalType.DATE)
    private LocalDate hiringDate;

    @Enumerated(EnumType.STRING)
    private Department department;

    // @ManyToOne
    // @JoinColumn(name = "salary_id", nullable = false)
    private BigDecimal salary;

    public Employee() {
        this.hiringDate = LocalDate.now();
    }

    public Employee(String cpf, String name, String email, String foneNumber, Gender gender, String empId, String post,
            LocalDate hiringDate, Department department, BigDecimal salary) {
        super(cpf, name, email, foneNumber, gender);
        this.empId = empId;
        this.post = post;
        this.hiringDate = hiringDate;
        this.department = department;
        this.salary = salary;
    }

    public Employee(String post, LocalDate hiringDate, Department department, BigDecimal salary) {
        this.post = post;
        this.hiringDate = hiringDate;
        this.department = department;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

}
