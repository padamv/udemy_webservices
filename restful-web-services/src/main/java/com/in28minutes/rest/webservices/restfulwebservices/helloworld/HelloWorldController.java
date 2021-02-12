package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {


    //@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping("hello-world")
    public String helloWorld() {
        return "HelloWorld";
    }

    //hello-world-bean
    @GetMapping("hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));

    }


}
