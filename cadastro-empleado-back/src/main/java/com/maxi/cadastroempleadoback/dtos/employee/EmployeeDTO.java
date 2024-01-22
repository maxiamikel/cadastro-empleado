package com.maxi.cadastroempleadoback.dtos.employee;

import java.math.BigDecimal;

import com.maxi.cadastroempleadoback.enums.Department;

public class EmployeeDTO {

    private String id;
    private String empId;
    private String post;
    private Department department;
    private BigDecimal salary;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String id, String post, Department department, BigDecimal salary) {
        this.id = id;
        this.post = post;
        this.department = department;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
