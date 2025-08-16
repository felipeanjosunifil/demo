package com.github.lipenathan.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoRestController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }
}
