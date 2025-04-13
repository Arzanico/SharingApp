package com.example.sharingapp;

import java.util.ArrayList;

public class ContactList {
    private static ArrayList<Contact> contacts;

    private String FILENAME;

    public ContactList() {
        contacts = new ArrayList<>();
    }

    public void setContacts(ArrayList<Contact> contact_list) {
        contacts = contact_list;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }
    
    public ArrayList<String> getAllUsernames() {
        ArrayList<String> active_usernames = new ArrayList<String>();
        for (Contact c: contacts) {
            String username = c.getUsername();
            if (username != null) {
                active_usernames.add(username);
            }
        }
        return active_usernames;
    }


}
