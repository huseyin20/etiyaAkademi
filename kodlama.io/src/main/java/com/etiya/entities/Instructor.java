package com.etiya.entities;

public class Instructor {
    private String name;
    private String bio;
    private String profileImage;

    public Instructor(String name, String bio, String profileImage) {
        this.name = name;
        this.bio = bio;
        this.profileImage = profileImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
