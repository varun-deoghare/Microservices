package com.varun.demo.restful.restfulwebservice.controller.helloworld;

import com.varun.demo.restful.restfulwebservice.bean.helloworld.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping("/helloWorldBean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello");
    }

    @GetMapping("/helloWorldBean/{name}")
    public HelloWorldBean helloWorldWithParam(@PathVariable String name){
        return new HelloWorldBean("Hello : "+name);
    }

}
