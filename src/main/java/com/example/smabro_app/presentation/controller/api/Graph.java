package com.example.smabro_app.presentation.controller.api;

import com.example.smabro_app.presentation.dto.request.UserRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
public class Graph {
    @GetMapping("/hello")
    public String createUser() {

        return "hello";
    }
}
