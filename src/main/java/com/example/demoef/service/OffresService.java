package com.example.demoef.service;

import com.example.demoef.entity.Offre;
import com.example.demoef.repository.OffreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffresService {

    private OffreRepository offreRepository;

    public OffresService (OffreRepository offreRepository){
        this.offreRepository = offreRepository;
    }

    public List<Offre> getAllOffres(){
        return offreRepository.findAll();
    }

    public Offre createOffre(int id, int volId, int operateurId, String depart, double prixBase) {
        // à faire
        // vérfieir si le vol et l'opérateur existent
        // créer l'offre
        return newOffre;
    }
}
