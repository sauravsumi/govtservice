package com.example.govtservice.controller;

import com.example.govtservice.model.User;
import com.example.govtservice.repository.UserRepository;
import com.example.govtservice.service.GovernmentService;
import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
public class GovernmentServiceController {

    @Autowired
    private GovernmentService service;

    @PostMapping(value = "/saveuser", consumes={"application/json"}, produces ={"application/json"} )
    public User saveUser(@RequestBody User user) {
        System.out.println("user: "+ user.toString());
        return service.createUser(user);
    }

    @GetMapping(value = "/user", produces ={"application/json"})
    public User getUser(@RequestParam String userId) {
        return service.getUser(userId);
    }
}
