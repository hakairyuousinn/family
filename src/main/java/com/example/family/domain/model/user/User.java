package com.example.family.domain.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor(staticName = "create")
public class User {

    private String userId;

    private String name;

    private String mailAddress;

}
