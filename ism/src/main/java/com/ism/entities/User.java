package com.ism.entities;

import lombok.Data;

@Data
public class User {
    private String login;
    private String password;
    private String email;
    private Client client;
}
