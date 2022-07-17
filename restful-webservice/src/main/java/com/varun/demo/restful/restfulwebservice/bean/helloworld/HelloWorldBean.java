package com.varun.demo.restful.restfulwebservice.bean.helloworld;

import org.springframework.stereotype.Component;

public class HelloWorldBean {

    private String name;

    public HelloWorldBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
