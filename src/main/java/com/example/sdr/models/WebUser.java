package com.example.sdr.models;

import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "web_user")
public class WebUser {
    private Long id;
    private String email;
    private String userPassword;
//    @Ignore
//    private UserRole role;

    public WebUser() {
    }

    public WebUser(String email, String userPassword) {
        this.email = email;
        this.userPassword = userPassword;
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

//    public UserRole getRole() {
//        return role;
//    }
//
//    public void setRole(UserRole role) {
//        this.role = role;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WebUser)) return false;
        WebUser webUser = (WebUser) o;
        return Objects.equals(id, webUser.id) && Objects.equals(email, webUser.email) && Objects.equals(userPassword, webUser.userPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, userPassword);
    }

    @Override
    public String toString() {
        return "WebUser{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
