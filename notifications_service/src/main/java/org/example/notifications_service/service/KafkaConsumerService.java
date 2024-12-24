package org.example.notifications_service.service;


import org.example.notifications_service.model.Notification;
import org.example.notifications_service.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @Autowired
    private NotificationRepository notificationRepository;

    @KafkaListener(topics = "topic_commandes", groupId = "notification-group")
    public void consumeMessage(String message) {
        Notification notification = new Notification(message);
        notificationRepository.save(notification);
        System.out.println("Notification sauvegardée : " + message);
    }
}

