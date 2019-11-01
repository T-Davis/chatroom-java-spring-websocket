package com.trevor.chatroomjavaspringwebsocket.model;

import javax.validation.constraints.NotBlank;

public class User {
    @NotBlank(message = "must have a name")
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
