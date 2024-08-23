package com.example.notificationsystem.repository;

import com.example.notificationsystem.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface notificationRepository extends JpaRepository<Notification,Long> {
    List<Notification> findByNameContaining(String name);
}
