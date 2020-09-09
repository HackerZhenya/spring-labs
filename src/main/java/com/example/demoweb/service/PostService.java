package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private final List<Post> database;

    public PostService() {
        this.database = new ArrayList<>() {{
            add(new Post("Первый пост"));
            add(new Post("Второй пост"));
            add(new Post("Третий пост"));
        }};
    }

    public List<Post> listAllPosts() {
        return database;
    }
}
