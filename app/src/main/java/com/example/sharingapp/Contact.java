package com.example.sharingapp;

import java.util.UUID;

public class Contact {

    private String user_name;
    private String email;
    private String id;

    public Contact(String username, String email, String id) {
        this.user_name = username;
        this.email = email;
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

    public void setUsername() {
        this.user_name = null;
    }
     public String getUsername() {
        return this.user_name;
     }

     public void setEmail() {
        this.email = null;
     }
     public String getEmail() {
        return this.email;
     }

}
