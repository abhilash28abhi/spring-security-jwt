package com.spring.security.jwt.models;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String username;
    private String password;
}
