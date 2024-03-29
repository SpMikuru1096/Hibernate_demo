package com.iftdemo.hibernate_demo.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "user_name")
    private String UserName;

    @Column(name = "user_password")
    private String UserPassword;

    @Column(name = "user_email")
    private String UserEmail;

    public Long getId() {
        return Id;
    }

    public String getPassword() {
        return UserPassword;
    }

    public String getUsername() {
        return UserName;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setPassword(String password) {
        this.UserPassword = password;
    }

    public void setUsername(String username) {
        this.UserName = username;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    @Override
    public String toString(){
        return "User{" +
                "id=" + Id +
                ", userName='" + UserName + '\'' +
                ", userPassword='" + UserPassword + '\'' +
                ", userEmail= '" + UserEmail + '\'' +
                '}';
    }
}
