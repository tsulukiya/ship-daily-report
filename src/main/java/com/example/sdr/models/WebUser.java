package com.example.sdr.models;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "web_user")
public class WebUser {
    private Long id;
    private String email;
    private String userPassword;
    private boolean isActive;
    private UserRole role;

    public WebUser() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "web_user_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "web_user_email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "web_user_password")
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Column(name = "active")
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public UserRole getRole() {
        return role;
    }

    @Column(name = "usr_role")
    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WebUser)) return false;
        WebUser webUser = (WebUser) o;
        return isActive == webUser.isActive &&
                Objects.equals(id, webUser.id) &&
                Objects.equals(email, webUser.email) &&
                Objects.equals(userPassword, webUser.userPassword) &&
                role == webUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, userPassword, isActive, role);
    }

    @Override
    public String toString() {
        return "WebUser{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", isActive=" + isActive +
                ", role=" + role +
                '}';
    }
}
