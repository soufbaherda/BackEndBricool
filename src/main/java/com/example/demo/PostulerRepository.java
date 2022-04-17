package com.example.bricool;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostulerRepository extends MongoRepository<Postuler,String> {
    public Postuler findPostulerByEmployee(Compte employee);
}
