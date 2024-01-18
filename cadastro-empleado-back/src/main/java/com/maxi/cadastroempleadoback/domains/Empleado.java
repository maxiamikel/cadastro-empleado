package com.maxi.cadastroempleadoback.domains;

import java.time.LocalDate;

import com.maxi.cadastroempleadoback.enums.Department;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
public class Empleado extends BaseEntity {

    private String empId;
    private String post;

    @Temporal(TemporalType.DATE)
    private LocalDate hiringDate;

    @Enumerated(EnumType.STRING)
    private Department department;

}
