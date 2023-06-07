package com.AnormaisEBruna.petshop.models;

import com.AnormaisEBruna.petshop.utils.Sha256PasswordEncoder;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;

    public UserModel(
        Long id,
        String name,
        String email,
        String password
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.setPassword(password);
    }

    public UserModel(
            String name,
            String email,
            String password
    ) {
        this.name = name;
        this.email = email;
        this.setPassword(password);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password  = new Sha256PasswordEncoder().encode(password);
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}