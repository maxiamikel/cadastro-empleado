package com.maxi.cadastroempleadoback.services.employee;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.cadastroempleadoback.domains.Employee;
import com.maxi.cadastroempleadoback.domains.Postulant;
import com.maxi.cadastroempleadoback.dtos.employee.EmployeeDTO;
import com.maxi.cadastroempleadoback.enums.Department;
import com.maxi.cadastroempleadoback.repositories.EmpleadoRepository;
import com.maxi.cadastroempleadoback.services.postulant.PostulantService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImplementation {

    @Autowired
    private EmpleadoRepository employeeRepository;

    @Autowired
    private PostulantService postulantService;

    public Employee createNewEmployee(EmployeeDTO obj) {

        Postulant postulant = new Postulant();
        postulant = postulantService.findByIdPostulant(obj.getId());
        Employee employee = new Employee();
        employee.setCpf(postulant.getCpf());
        employee.setEmail(postulant.getEmail());
        employee.setName(postulant.getName());
        employee.setGender(postulant.getGender());
        employee.setFoneNumber(postulant.getFoneNumber());
        switch (postulant.getArea()) {
            case "Caixa":
                employee.setDepartment(Department.ACCOUNTING);
                break;
            case "Informatica":
                employee.setDepartment(Department.COMPUTING);

            default:
                employee.setDepartment(Department.MANAGEMENT);
                break;

        }
        employee.setEmpId(generateCode(employee.getDepartment().toString()));
        employee.setPost(obj.getPost());
        employee.setSalary(obj.getSalary());
        employeeRepository.save(employee);

        return employee;
    }

    private String generateCode(String departmentName) {
        LocalDate regDate = LocalDate.now();
        Integer getYear = regDate.getYear();
        String depName = departmentName.substring(0, 3);
        Integer lastPosition = employeeRepository.findAllEmpleado().size() + 1;
        return "" + lastPosition + "-" + depName + "-" + getYear;
    }
}
