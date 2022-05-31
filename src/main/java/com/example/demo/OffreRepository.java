package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface OffreRepository extends MongoRepository<Offre, String> {
    public List<Offre> findByTitresaContainingAndDomaineContainingAndRegionContainingAndVilleContainingAndDateSContaining(String titre, String domaine,String region, String ville, String date);
    public Optional<Offre> findById(String id);
    public List<Offre> findByUtilisateurId(String id);
    public List<Offre> findByEmployee(String id);
}

