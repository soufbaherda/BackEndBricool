package com.example.bricool;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Postuler {

    @Id
    private String id;
    private String idOffre;
    private float prix;
    private String description;
    private float duree;
    private Compte employee;

    public Postuler(){}

    public Postuler(String id, String idOffre, float prix, String description, float duree, Compte employee) {
        this.id = id;
        this.idOffre = idOffre;
        this.prix = prix;
        this.description = description;
        this.duree = duree;
        this.employee = employee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(String idOffre) {
        this.idOffre = idOffre;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getDuree() {
        return duree;
    }

    public void setDuree(float duree) {
        this.duree = duree;
    }

    public Compte getEmployee() {
        return employee;
    }

    public void setEmployee(Compte employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Postuler postuler = (Postuler) o;
        return Float.compare(postuler.prix, prix) == 0 && Float.compare(postuler.duree, duree) == 0 && Objects.equals(id, postuler.id) && Objects.equals(idOffre, postuler.idOffre) && Objects.equals(description, postuler.description) && Objects.equals(employee, postuler.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idOffre, prix, description, duree, employee);
    }

    @Override
    public String toString() {
        return "Postuler{" +
                ", idOffre='" + idOffre + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", duree=" + duree +
                ", employee=" + employee +
                '}';
    }
}
