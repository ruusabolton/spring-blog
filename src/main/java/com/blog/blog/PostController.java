package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {


    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    @ResponseBody
    public String postsIndex(@PathVariable String posts) {
        return "posts index page";    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String postView(@PathVariable String post) {
        return "view an individual post";    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String postCreate(@PathVariable String post) {
        return "view the form for creating a post";    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String post(@PathVariable String post) {
        return "create a new post";    }

}
