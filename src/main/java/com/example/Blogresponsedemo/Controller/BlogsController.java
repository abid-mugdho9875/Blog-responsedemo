package com.example.Blogresponsedemo.Controller;

import com.example.Blogresponsedemo.Sample.prop.BlogProperties;
import com.example.Blogresponsedemo.Sample.BlogResponse;
import com.example.Blogresponsedemo.Sample.prop.ImageProperty;
import com.example.Blogresponsedemo.enums.BlockType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogsController {

    @GetMapping("/sample")
    public BlogResponse getSampleBlog() {
        // Create a sample BlogResponse

        BlogProperties properties = new BlogProperties(
                "Sample Blog Title",
                new ImageProperty("sample-image.jpg", "https://example.com/sample-image.jpg"),
                "author123",
                "2023-09-13",
                "2023-09-13",
                List.of("tag1", "tag2"),
                "Sample blog description"
        );

        List<block> blocks = new ArrayList<>();
        block block1 = new block(BlockType.TEXT, "block1", "Sample text content");
        block block2 = new block( BlockType.IMAGE, "block2","https://example.com/sample-image.jpg");
        blocks.add(block1);
        blocks.add(block2);

        return new BlogResponse("sample-blog-id", BlockType.BLOG, properties, blocks);
    }
}
