package com.maxi.cadastroempleadoback.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.maxi.cadastroempleadoback.domains.Postulant;

public interface PostulantRepository extends JpaRepository<Postulant, String> {

    @Query("SELECT p FROM Postulant p")
    List<Postulant> findAllPostulant();
}
