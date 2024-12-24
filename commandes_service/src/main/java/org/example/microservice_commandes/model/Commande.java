package org.example.microservice_commandes.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Commande {
    @Id
    @GeneratedValue
    private Long id;
    private String produitId;
    private Integer quantite;

    public Commande() {}

    public Commande(String produitId, Integer quantite) {
        this.produitId = produitId;
        this.quantite = quantite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduitId() {
        return produitId;
    }

    public void setProduitId(String produitId) {
        this.produitId = produitId;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    // Getters and setters
}

