package com.maxi.cadastroempleadoback.domains;

import java.time.LocalDate;

import com.maxi.cadastroempleadoback.enums.Gender;

import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Postulant extends BaseEntity {

    private String cv;

    @Temporal(TemporalType.DATE)
    private LocalDate postulationtDate;

    private String area;

    public Postulant() {
        this.postulationtDate = LocalDate.now();
    }

    public Postulant(String cpf, String name, String email, String foneNumber, Gender gender, String cv,
            String area) {
        super(cpf, name, email, foneNumber, gender);
        this.cv = cv;
        this.postulationtDate = LocalDate.now();
        this.area = area;
    }

    public Postulant(String cv, String area) {
        this.cv = cv;
        this.postulationtDate = LocalDate.now();
        this.area = area;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public LocalDate getPostulationtDate() {
        return postulationtDate;
    }

    public void setPostulationtDate(LocalDate postulationtDate) {
        this.postulationtDate = postulationtDate;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
