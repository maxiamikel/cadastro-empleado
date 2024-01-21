package com.maxi.cadastroempleadoback.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.maxi.cadastroempleadoback.domains.Postulant;
import com.maxi.cadastroempleadoback.dtos.postulant.PostulantDTO;
import com.maxi.cadastroempleadoback.services.postulant.PostulantServiceImplementation;

@RestController
@RequestMapping("/api/postulants/")
public class PostulantController {

    @Autowired
    private PostulantServiceImplementation postulantService;

    @PostMapping("/new")
    public ResponseEntity<?> createNewPostulant(@RequestBody PostulantDTO obj) {
        Postulant newPostulant = postulantService.createNewPostulant(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newPostulant.getId())
                .toUri();
        return ResponseEntity.created(uri).body(newPostulant);
    }

    @GetMapping("/")
    public ResponseEntity<?> findAllPostulants() {
        List<PostulantDTO> listDTO = postulantService.findAllPostulant();
        return ResponseEntity.ok().body(listDTO);
    }
}
