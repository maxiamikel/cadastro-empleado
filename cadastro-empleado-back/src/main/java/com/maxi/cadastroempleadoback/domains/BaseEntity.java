package com.maxi.cadastroempleadoback.domains;

import java.util.UUID;

import com.maxi.cadastroempleadoback.enums.Gender;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class BaseEntity {

    @Id
    private String id = UUID.randomUUID().toString();
    private String cpf;
    private String name;
    private String email;
    private String foneNumber;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
