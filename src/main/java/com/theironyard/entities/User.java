package com.theironyard.entities;

import javax.persistence.*;

/**
 * Created by michaelplott on 10/24/16.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    public int id;

    @Column(nullable = false, unique = true)
    public String name;

    @Column(nullable = false)
    public String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
