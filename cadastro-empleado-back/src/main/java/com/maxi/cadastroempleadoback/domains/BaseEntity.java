package com.maxi.cadastroempleadoback.domains;

import java.io.Serializable;
import java.util.UUID;

import com.maxi.cadastroempleadoback.enums.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id = UUID.randomUUID().toString();

    @Column(unique = true)
    private String cpf;

    private String name;

    @Column(unique = true)
    private String email;

    private String foneNumber;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    public BaseEntity() {
        super();
    }

    public BaseEntity(String cpf, String name, String email, String foneNumber, Gender gender) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.foneNumber = foneNumber;
        this.gender = gender;
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

}
