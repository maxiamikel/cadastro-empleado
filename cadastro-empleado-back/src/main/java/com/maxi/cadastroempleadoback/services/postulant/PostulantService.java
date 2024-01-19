package com.maxi.cadastroempleadoback.services.postulant;

import com.maxi.cadastroempleadoback.domains.Postulant;
import com.maxi.cadastroempleadoback.dtos.postulant.PostulantCreateDTO;

public interface PostulantService {
    Postulant createNewPostulant(PostulantCreateDTO obj);
}
