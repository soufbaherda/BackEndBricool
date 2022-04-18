package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Rating {

    @Id
    public String idRating;
    public String idEmploye;
    public int rating;

    public Rating(){}

    public Rating(String idRating, String idEmploye, int rating) {
        this.idRating = idRating;
        this.idEmploye = idEmploye;
        this.rating = rating;
    }

    public String getIdRating() {
        return idRating;
    }

    public void setIdRating(String idRating) {
        this.idRating = idRating;
    }

    public String getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(String idEmploye) {
        this.idEmploye = idEmploye;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rating rating = (Rating) o;
        return Objects.equals(idRating, rating.idRating) && Objects.equals(idEmploye, rating.idEmploye) && Objects.equals(rating, rating.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRating, idEmploye, rating);
    }

    @Override
    public String toString() {
        return "Rating{" +
                "idRating='" + idRating + '\'' +
                ", idEmploye='" + idEmploye + '\'' +
                ", Rating='" + rating + '\'' +
                '}';
    }
}
