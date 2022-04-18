package com.example.demo;

import com.example.demo.Compte;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostulerRepository extends MongoRepository<Postuler,String> {
    public Postuler findPostulerByEmployee(Compte employee);
    public List<Postuler> findByIdOffre(String idOffre);
}
