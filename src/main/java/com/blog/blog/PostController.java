package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {


    @GetMapping( "/posts")
    @ResponseBody
    public String postsIndex() {
        return "posts index page";    }

    @RequestMapping( "/posts/{id}")
    @ResponseBody
    public String postView() {
        return "view an individual post" ;    }

    @RequestMapping("/posts/create")
    @ResponseBody
    public String postCreate() {
        return "view the form for creating a post";    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String post(@PathVariable String post) {
        return "create a new post";    }

}
