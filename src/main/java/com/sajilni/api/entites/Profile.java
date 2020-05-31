package com.sajilni.api.entites;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Profile {
    private long id;
    private String profileName;
    private String firstName;
    private String lastName;
    private Date created;

    public Profile(long id, String profileName, String firstName, String lastName) {
        this.id = id;
        this.profileName = profileName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.created = new Date();
    }
}
