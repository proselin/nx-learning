package com.springapi.main.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
  @Value("Hello")
  private String info;

  @GetMapping("/hello")
  @ResponseStatus(HttpStatus.OK)
  public Object helloWorld() {
    return info;
  }

  @PostMapping("/hello")
  @ResponseStatus(HttpStatus.CREATED)
  public String helloWorldPost(@RequestBody String message) {
    return info + " " + message;
  }

}
