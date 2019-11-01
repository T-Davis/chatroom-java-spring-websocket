package com.trevor.chatroomjavaspringwebsocket.model;

import javax.validation.constraints.NotBlank;

public class Message {
    @NotBlank(message = "message cannot be empty")
    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
