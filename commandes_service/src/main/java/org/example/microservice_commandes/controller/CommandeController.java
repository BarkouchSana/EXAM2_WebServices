package org.example.microservice_commandes.controller;

import org.example.microservice_commandes.model.Commande;
import org.example.microservice_commandes.repository.CommandeRepository;
import org.example.microservice_commandes.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commandes")
public class CommandeController {
    @Autowired
    private CommandeRepository commandeRepository;

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @GetMapping
    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    @PostMapping
    public Commande addCommande(@RequestBody Commande commande) {
        Commande savedCommande = commandeRepository.save(commande);
        kafkaProducerService.sendMessage("topic_commandes", "Commande créée : " + savedCommande.getId());
        return savedCommande;
    }




}

