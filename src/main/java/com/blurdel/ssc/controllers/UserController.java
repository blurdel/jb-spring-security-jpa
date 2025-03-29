package com.blurdel.ssc.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("api/v1/user")
@RequestMapping("/user")
public class UserController {

    @GetMapping
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public String getAll(){
        return "<h1>You Received All Users List</h1>";
    }

    @PostMapping
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String save(){
        return "<h1>You saved a User</h1>";
    }

    @PutMapping
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String update(){
        return "<h1>You updated a User</h1>";
    }

}
