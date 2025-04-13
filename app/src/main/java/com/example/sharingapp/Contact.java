package com.example.sharingapp;

import java.util.UUID;

public class Contact {

    private String user_name;
    private String email;
    private String id;

    public Contact(String username, String email, String id) {
        this.user_name = username;
        this.email = email;
        if (id == null) {
            setId();
        } else {
            updateId(id);
        }
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return this.id;
    }

    public void updateId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.user_name = username;
    }
     public String getUsername() {
        return this.user_name;
     }

     public void setEmail(String email) {
        this.email = email;
     }
     public String getEmail() {
        return this.email;
     }

}
