package com.hn369.universeblog.entity.user;


import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "app_user")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // BIGSERIAL in DB
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name", length = 255)
    private String userName;

    @Column(name = "user_uuid", length = 100, unique = true, nullable = false)
    private String userUuid;

    @Column(name = "user_first_name", length = 255)
    private String userFirstName;

    @Column(name = "user_last_name", length = 255)
    private String userLastName;

    // Automatically assign UUID before persisting
    @PrePersist
    public void generateUuid() {
        if (this.userUuid == null || this.userUuid.isEmpty()) {
            this.userUuid = UUID.randomUUID().toString();
        }
    }

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
}
