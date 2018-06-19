package com.wy.Controller;

import com.wy.Entity.Post;
import com.wy.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping(value="/post")
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping(value="/add")
    @ResponseBody
    public void addPost(@RequestBody Post post){
        postService.addPost(post);
    }

    @PostMapping(value="/delete")
    @ResponseBody
    public void deletePost(@RequestBody Post post){
        postService.deletePost(post);
    }

    @PostMapping(value="/update")
    @ResponseBody
    public void updatePost(@RequestBody Post post){
        postService.updatePost(post);
    }

    @PostMapping(value="/find")
    @ResponseBody
    public Post findPost(@RequestBody Post post){
        return postService.findPost(post);
    }
}
