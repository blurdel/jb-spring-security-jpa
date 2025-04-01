package com.blurdel.ssc.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
//@RequestMapping("api/v1/user")
@RequestMapping("/user")
public class UserController {

    @GetMapping
    @ResponseBody
//    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    @PreAuthorize("hasAuthority('USER') or hasAuthority('ADMIN')")
    public Principal getAll(Principal user){
        return user;
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public String save(){
        return "<h1>You saved a User</h1>";
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public String update(){
        return "<h1>You updated a User</h1>";
    }

}
