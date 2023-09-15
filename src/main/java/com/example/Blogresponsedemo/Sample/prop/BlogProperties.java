package com.example.Blogresponsedemo.Sample.prop;

import java.util.List;

public class BlogProperties {
    private String title;
    private ImageProperty cover;
    private String authorId;
    private String createdAt;
    private String updatedAt;
    private List<String> tags;
    private String description;

    public BlogProperties(String title, ImageProperty cover, String authorId, String createdAt, String updatedAt, List<String> tags, String description) {
        this.title = title;
        this.cover = cover;
        this.authorId = authorId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.tags = tags;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public ImageProperty getCover() {
        return cover;
    }

    public String getAuthorId() {
        return authorId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getDescription() {
        return description;
    }
}
