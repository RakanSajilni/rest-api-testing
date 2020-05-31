package com.sajilni.api.entites;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Comment {
    private long id;
    private String message;
    private String author;
    private Date created;

    public Comment(long id, String message, String author) {
        this.id = id;
        this.message = message;
        this.author = author;
        this.created = new Date();
    }
}
