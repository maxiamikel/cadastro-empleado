package com.maxi.cadastroempleadoback.services.employee;

import com.maxi.cadastroempleadoback.domains.Employee;
import com.maxi.cadastroempleadoback.dtos.employee.EmployeeDTO;

public interface EmployeeService {
    Employee createNewEmployee(EmployeeDTO obj);
}
