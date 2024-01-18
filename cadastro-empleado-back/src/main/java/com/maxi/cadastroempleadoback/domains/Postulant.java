package com.maxi.cadastroempleadoback.domains;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Postulant extends BaseEntity {

    private String cv;

    @Temporal(TemporalType.DATE)
    private LocalDate postulationtDate;
    private String area;
}
