package com.example.smabro_app.presentation.controller.api;

import com.example.smabro_app.presentation.dto.request.UserRequest;
import com.example.smabro_app.security.UserDetailsImpl;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
public class Graph {
    @GetMapping("/hello")
    public String createUser(@AuthenticationPrincipal UserDetailsImpl userDetails) {

        System.out.println(userDetails.getUsername());
        System.out.println(userDetails.getPassword());

        return "hello";
    }
}
