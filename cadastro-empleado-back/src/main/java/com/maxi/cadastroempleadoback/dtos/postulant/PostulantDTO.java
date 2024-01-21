package com.maxi.cadastroempleadoback.dtos.postulant;

import java.time.LocalDate;

import com.maxi.cadastroempleadoback.domains.Postulant;
import com.maxi.cadastroempleadoback.enums.Gender;

public class PostulantDTO {

    private String id;
    private String cpf;
    private String name;
    private String email;
    private String foneNumber;
    private Gender gender;
    private String cv;
    private LocalDate postulationtDate;
    private String area;

    public PostulantDTO() {
        super();
    }

    public PostulantDTO(Postulant obj) {
        this.id = obj.getId();
        this.cpf = obj.getCpf();
        this.name = obj.getName();
        this.email = obj.getEmail();
        this.foneNumber = obj.getFoneNumber();
        this.gender = obj.getGender();
        this.cv = obj.getCv();
        this.area = obj.getArea();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoneNumber() {
        return foneNumber;
    }

    public void setFoneNumber(String foneNumber) {
        this.foneNumber = foneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
