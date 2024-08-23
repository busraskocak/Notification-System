package com.example.notificationsystem.service;


import com.example.notificationsystem.entities.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private com.example.notificationsystem.repository.notificationRepository notificationRepository;

    public Notification saveNotification(Notification notification){
        return notificationRepository.save(notification);
    }

    public List<Notification> findAllNotifications(String filterCriteria) {
        if (filterCriteria == null || filterCriteria.isEmpty()) {
            return notificationRepository.findAll();
        }
        return notificationRepository.findByNameContaining(filterCriteria);
    }


    public void send(Long id){
        Notification notification = notificationRepository.findById(id).orElseThrow(() -> new RuntimeException("Notification not found"));
    }




}
