package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImgRepository extends MongoRepository<Img,String> {
}
