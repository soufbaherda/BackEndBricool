package com.example.demo;

import com.example.demo.Compte;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostulerRepository extends MongoRepository<Postuler,String> {
    public Postuler findPostulerByEmployee(Compte employee);
}
