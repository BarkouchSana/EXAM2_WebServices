package com.example.produits.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Produit {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private Double prix;

    public Produit() {}

    public Produit(String nom, Double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public Double getPrix() { return prix; }
    public void setPrix(Double prix) { this.prix = prix; }
}
