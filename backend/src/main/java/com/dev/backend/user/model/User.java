package com.dev.backend.user.model;

import lombok.Data;

@Data
public class User {
    private long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String contact;
    private String email;
    private String createDate;
    private String updateDate;
}
