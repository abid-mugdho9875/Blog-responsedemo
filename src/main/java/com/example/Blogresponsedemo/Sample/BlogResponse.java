package com.example.Blogresponsedemo.Sample;


import com.example.Blogresponsedemo.Controller.block;
import com.example.Blogresponsedemo.Sample.prop.BlogProperties;
import com.example.Blogresponsedemo.enums.BlockType;

import java.util.List;

public class BlogResponse {
    private String id;
    private BlockType type;
    private BlogProperties properties;
    private List<block> blocks;

    public BlogResponse(String id, BlockType type, BlogProperties properties, List<block> blocks) {
        this.id = id;
        this.type = type;
        this.properties = properties;
        this.blocks = blocks;
    }



    public String getId() {
        return id;
    }

    public BlockType getType() {
        return type;
    }

    public BlogProperties getProperties() {
        return properties;
    }

    public List<block> getBlocks() {
        return blocks;
    }



}

