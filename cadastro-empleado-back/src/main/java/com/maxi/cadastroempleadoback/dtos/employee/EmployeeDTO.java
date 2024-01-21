package com.maxi.cadastroempleadoback.dtos.employee;

import com.maxi.cadastroempleadoback.domains.Salary;
import com.maxi.cadastroempleadoback.enums.Department;

public class EmployeeDTO {

    private String empId;
    private String post;
    private Department department;
    private Salary salary;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String empId, String post, Department department, Salary salary) {
        this.empId = empId;
        this.post = post;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

}
