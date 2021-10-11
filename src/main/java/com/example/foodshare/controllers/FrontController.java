package com.example.foodshare.controllers;

import com.example.foodshare.models.Post;
import com.example.foodshare.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontController {

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/create-user")
  public String createUser() {
    return "createuser";
  }

  @GetMapping("/create-food")
  public String createFood() {
    return "createfoodform";
  }

  @GetMapping("/market")
  public String market(Model model) {
    PostService postService = new PostService();
    List<Post> posts = postService.getPosts();
    model.addAttribute("postList", posts);
    return "market";
  }

  @GetMapping("/market-fragment")
  public String market2(Model model) {
    PostService postService = new PostService();
    List<Post> posts = postService.getPosts();
    model.addAttribute("postList", posts);
    return "fragments/market-fragment :: market-fragments";
  }

  @GetMapping("/my-foods")
  public String myFoods(Model model) {
    PostService postService = new PostService();
    List<Post> posts = postService.getPosts();
    model.addAttribute("postList", posts);
    return "fragments/myfoods";
  }
}
