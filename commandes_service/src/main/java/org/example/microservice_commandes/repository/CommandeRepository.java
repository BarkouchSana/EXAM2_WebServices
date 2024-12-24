package org.example.microservice_commandes.repository;



import org.example.microservice_commandes.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}

