package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CompteController {
    @Autowired
    private CompteRepository compteRepository;
    @CrossOrigin
    @PostMapping(value = "/register", consumes = {"application/json"})
    public void creerCompte(@RequestBody Compte compte){
        compteRepository.save(compte);
    }
    @CrossOrigin
    @PostMapping("/login")
    public Connexion getConnexion(@RequestBody Compte compte){
        List<Compte> lcompte=compteRepository.findAll();
        for(Compte x:lcompte){
            if(compte.equals(x)) return new Connexion(x.getId(),"true",x.getNom(),x.getPrenom());
        }
        return new Connexion("","false","","");
    }
    @CrossOrigin
    @GetMapping("/login/{id}")
    public Compte getCompte(@PathVariable String id) {
        return compteRepository.findById(id).orElseThrow(RuntimeException::new);
    }
    @CrossOrigin
    @GetMapping("/verify/{email}")
    public String verifymail(@PathVariable String email) {
        List<Compte> lcompte=compteRepository.findAll();
        for(Compte x:lcompte){
            if(x.getEmail().equals(email)) return"{\"exist\":\"true\"}";
        }
        return"{\"exist\":\"false\"}";
    }



    }

