package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private static Long postId = 0L;
    private final List<Post> database;

    public PostService() {
        this.database = new ArrayList<>();

        this.create("Первый пост");
        this.create("Второй пост");
        this.create("Третий пост");
    }

    public List<Post> listAllPosts() {
        return database;
    }

    public void create(String text) {
        database.add(new Post(postId++, text));
    }
}
