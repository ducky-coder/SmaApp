package com.example.smabro_app.security;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UserAccount {

    private String name;

    private String password;

    private Boolean admin;

    public Boolean isAdmin() {
        return this.admin;
    }
}
