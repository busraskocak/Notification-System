package com.example.notificationsystem.api;


import com.example.notificationsystem.entities.Notification;
import com.example.notificationsystem.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/notifications")
    public Notification create(@RequestBody Notification notification){
        return notificationService.saveNotification(notification);
    }

    @GetMapping("/notification")
    public List<Notification> getAll(@RequestParam(required = false)String filterCriteria){
        return notificationService.findAllNotifications(filterCriteria);
    }

    @PostMapping("/send")
    public void send(@RequestParam Long id){
        notificationService.send(id);
    }
}
