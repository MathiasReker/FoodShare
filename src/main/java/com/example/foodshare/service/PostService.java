package com.example.foodshare.service;

import com.example.foodshare.models.Post;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostService {


    private List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public PostService() {
        createPost();
    }

    public void createPost() {

        posts.add(new Post(createImage("apple.png"), "description", "foodType", 4, "Jackie", "København V", LocalDate.now(), LocalDate.now().plusDays(4)));
        posts.add(new Post(createImage("cake.png"), "description", "foodType", 2, "Jackie", "København V", LocalDate.now(), LocalDate.now().plusDays(4)));
        posts.add(new Post(createImage("banana.png"), "description", "foodType", 1, "Jackie", "København V", LocalDate.now(), LocalDate.now().plusDays(4)));
        posts.add(new Post(createImage("cake2.png"), "description", "foodType", 8, "Jackie", "København V", LocalDate.now(), LocalDate.now().plusDays(4)));
        posts.add(new Post(createImage("pear.png"), "description", "foodType", 3, "Jackie", "København V", LocalDate.now(), LocalDate.now().plusDays(4)));
        posts.add(new Post(createImage("apple.png"), "description", "foodType", 1, "Jackie", "København V", LocalDate.now(), LocalDate.now().plusDays(4)));

    }

    private Image createImage(String imageName) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("com/example/foodshare/images/" + imageName));
        } catch (IOException e) {
            e.getMessage();
        }
        return image;
    }

}
