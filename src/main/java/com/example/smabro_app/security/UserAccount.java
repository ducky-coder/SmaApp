package com.example.smabro_app.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserAccount {

    private String name;

    private String password;

    private Boolean admin;

    public Boolean isAdmin() {
        return this.admin;
    }
}
