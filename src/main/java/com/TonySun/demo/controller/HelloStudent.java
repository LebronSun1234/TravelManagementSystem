package com.TonySun.demo.controller;

import com.TonySun.demo.model.StudentModel;
import org.springframework.web.bind.annotation.*;
//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
@RestController
@RequestMapping("hello")
public class HelloStudent {

    // hello/path/jack
    @GetMapping("path/{name}")
    public String hello(@PathVariable String name) {
        return "Hello " + name;
    }

    // hello/query?name=jack
    @GetMapping("query")
    public String helloName(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    // hello/object
    @PostMapping("object")
    public String helloObject(StudentModel model) {
        return "Hello " + model.getName();
    }

    // hello/json
    @PostMapping("json")
    public String helloJson(@RequestBody StudentModel model) {
        return "Hello " + model.getName();
    }
}