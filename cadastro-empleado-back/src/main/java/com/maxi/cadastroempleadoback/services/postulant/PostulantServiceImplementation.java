package com.maxi.cadastroempleadoback.services.postulant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.cadastroempleadoback.domains.Postulant;
import com.maxi.cadastroempleadoback.dtos.postulant.PostulantCreateDTO;
import com.maxi.cadastroempleadoback.repositories.PostulantRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PostulantServiceImplementation implements PostulantService {

    @Autowired
    private PostulantRepository postulantRepository;

    @Override
    public Postulant createNewPostulant(PostulantCreateDTO obj) {

        Postulant postulant = new Postulant();
        postulant.setId(null);
        postulant.setName(obj.getName());
        postulant.setCpf(obj.getCpf());
        postulant.setFoneNumber(obj.getFoneNumber());
        postulant.setArea(obj.getArea());
        postulant.setCv(obj.getCv());
        postulant.setEmail(obj.getEmail());
        postulant.setGender(obj.getGender());

        return postulantRepository.saveAndFlush(postulant);
    }

}
