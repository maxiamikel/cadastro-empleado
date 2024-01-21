package com.maxi.cadastroempleadoback.services.postulant;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.cadastroempleadoback.domains.Postulant;
import com.maxi.cadastroempleadoback.dtos.postulant.PostulantDTO;
import com.maxi.cadastroempleadoback.repositories.PostulantRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PostulantServiceImplementation implements PostulantService {

    @Autowired
    private PostulantRepository postulantRepository;

    @Override
    public Postulant createNewPostulant(PostulantDTO obj) {
        if (!existsPostulantEmail(obj.getEmail())) {
            throw new RuntimeException("Email already taken");
        }
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

    @Override
    public List<PostulantDTO> findAllPostulant() {
        List<Postulant> postulantList = new ArrayList<>();
        postulantList = postulantRepository.findAllPostulant();

        List<PostulantDTO> postulantDTOList = new ArrayList<>();
        postulantDTOList = postulantList.stream().map((x) -> new PostulantDTO(x)).collect(Collectors.toList());

        if (postulantDTOList.size() > 0) {
            return postulantDTOList;
        } else {
            return null;
        }
    }

    private boolean existsPostulantEmail(String email) {
        List<Postulant> list = postulantRepository.findByEmail(email);
        return list.isEmpty();
    }

}
