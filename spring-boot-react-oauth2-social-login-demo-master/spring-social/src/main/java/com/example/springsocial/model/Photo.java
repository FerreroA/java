package com.example.springsocial.model;

import java.util.List;

public class Photo {

    private User owner;
    private byte[] picture;
    private String description;
    private List<PhotoLike> likesPhoto;
    private List<Comment> comments;

}
