package com.example.Blogresponsedemo.Controller;

import com.example.Blogresponsedemo.enums.BlockType;

public class block {
    private String name;
    private BlockType type;
    private String content;

    // Constructors, getters, and setters
    public block(BlockType type, String name, String content) {
        this.type = type;
        this.name = name;
        this.content = content;
    }

    // Other methods and properties as needed

    // Getter and Setter methods for the properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BlockType getType() {
        return type;
    }

    public void setType(BlockType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
