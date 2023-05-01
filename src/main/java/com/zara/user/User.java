package com.zara.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private int userId;
    private String id;
    private String password;
    private String userEmail;
    private String userName;
}
