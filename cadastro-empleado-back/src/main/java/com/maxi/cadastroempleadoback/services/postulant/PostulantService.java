package com.maxi.cadastroempleadoback.services.postulant;

import java.util.List;

import com.maxi.cadastroempleadoback.domains.Postulant;
import com.maxi.cadastroempleadoback.dtos.postulant.PostulantDTO;

public interface PostulantService {
    Postulant createNewPostulant(PostulantDTO obj);

    List<PostulantDTO> findAllPostulant();

    Postulant findByIdPostulant(String id);

}
