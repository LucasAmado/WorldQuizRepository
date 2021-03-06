package com.gonzaloandcompany.woldquiz.models.unsplash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User_ {

    private String id;
    private String updatedAt;
    private String username;
    private String name;
    private String firstName;
    private String lastName;
    private Object twitterUsername;
    private String portfolioUrl;
    private String bio;
    private String location;
    private Links___ links;
    private ProfileImage_ profileImage;
    private String instagramUsername;
    private Integer totalCollections;
    private Integer totalLikes;
    private Integer totalPhotos;
    private Boolean acceptedTos;
}
