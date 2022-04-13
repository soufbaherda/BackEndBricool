package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="img")
public class Img {
    private String id,profilurl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfilurl() {
        return profilurl;
    }

    public void setProfilurl(String profilurl) {
        this.profilurl = profilurl;
    }

    public Img(String id, String profilurl) {
        this.id = id;
        this.profilurl = profilurl;
    }
}
