package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

    @Controller
    public class HomeController {

        @GetMapping("/")
        @ResponseBody
        public String hello() {
            return "This is the landing page!";
        }


        @GetMapping("/hello/{name}")
        @ResponseBody
        public String sayHello(@PathVariable String name) {
            return "Hello " + name + "!";
        }



}






