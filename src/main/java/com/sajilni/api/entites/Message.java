package com.sajilni.api.entites;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
public class Message {
    private long id;
    private String message;
    private Date created;
    private String author;
    private Map<Long,Comment> comments = new HashMap<>();



    public Message(long id, String message, String author) {
        this.id = id;
        this.message = message;
        this.created = new Date();
        this.author = author;
    }

    public Message(long id, String message, String author, Map<Long, Comment> comments) {
        this.id = id;
        this.message = message;
        this.created = new Date();
        this.author = author;
        this.comments = comments;
    }
}
