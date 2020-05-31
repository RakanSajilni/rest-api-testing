package com.sajilni.api.database;

import com.sajilni.api.entites.Comment;
import com.sajilni.api.entites.Message;
import com.sajilni.api.entites.Profile;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
    @Getter
    private static Map<Long, Message> messages = new HashMap<Long, Message>();
    @Getter
    private static Map<String, Profile> profiles = new HashMap<String, Profile>();
    @Getter
    private static Map<Long, Comment> comments = new HashMap<>();
    static {
        comments.put(1L,new Comment(1L,"This is an awesome api","Rakan"));
        comments.put(2L,new Comment(2L,"This is an awesome api","Rakan"));
        comments.put(3L,new Comment(3L,"This is an awesome api","Rakan"));
        comments.put(4L,new Comment(4L,"This is an awesome api","Rakan"));
        messages.put(1L, new Message(1L, "Wake up", "Rakan",comments));
        messages.put(2L, new Message(2L, "Wake up", "Ahmad"));
        messages.put(3L, new Message(3L, "Wake up", "Aljamal"));
        messages.put(4L, new Message(4L, "Wake up", "Rakan"));
        messages.put(5L, new Message(5L, "Wake up", "Ahmad"));
        messages.put(6L, new Message(6L, "Wake up", "Aljamal"));
        messages.put(7L, new Message(7L, "Wake up", "Rakan"));
        messages.put(8L, new Message(8L, "Wake up", "Ahmad"));
        messages.put(9L, new Message(9L, "Wake up", "Aljamal"));
        messages.put(10L, new Message(10L, "Wake up", "Rakan"));
        messages.put(11L, new Message(11L, "Wake up", "Ahmad"));
        messages.put(12L, new Message(12L, "Wake up", "Aljamal"));
        profiles.put("Rakan", new Profile(1L, "Rakan", "Rakan", "Aljamal"));
    }

}
