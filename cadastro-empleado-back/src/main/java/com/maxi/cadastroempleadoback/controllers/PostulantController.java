package com.maxi.cadastroempleadoback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxi.cadastroempleadoback.domains.Postulant;
import com.maxi.cadastroempleadoback.dtos.postulant.PostulantCreateDTO;
import com.maxi.cadastroempleadoback.services.postulant.PostulantServiceImplementation;

@RestController
@RequestMapping("/api/postulants/")
public class PostulantController {

    @Autowired
    private PostulantServiceImplementation postulantService;

    @PostMapping("/new")
    public ResponseEntity<?> createNewPostulant(@RequestBody PostulantCreateDTO obj) {
        Postulant newPostulant = postulantService.createNewPostulant(obj);
        return ResponseEntity.ok().body(newPostulant);
    }

}
