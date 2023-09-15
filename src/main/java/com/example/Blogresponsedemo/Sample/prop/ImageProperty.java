package com.example.Blogresponsedemo.Sample.prop;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImageProperty {
    @JsonProperty("name")
    private String s;
    @JsonProperty("url")
    private  String url;
    public ImageProperty(String s, String url) {
        this.s = s;
        this.url = url;

    }
}
