package com.example.myandroid3.data.models;

import com.google.gson.annotations.SerializedName;
public class Post {

    @SerializedName("title")
    private String title;
    @SerializedName("content")
    private String content;
    @SerializedName("user")
    private Integer user;
    @SerializedName("group")
    private Integer group;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }
}
