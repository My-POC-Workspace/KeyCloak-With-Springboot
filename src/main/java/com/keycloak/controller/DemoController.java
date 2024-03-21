package com.keycloak.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1.0/demo")
public class DemoController {

    @GetMapping(value = "/user")
    @PreAuthorize("hasRole('client_user')")
    public String getUser(){
        return "Hello User from SB and Keycloak";
    }

    @GetMapping(value = "/admin")
    @PreAuthorize("hasRole('client_admin')")
    public String getAdmin(){
        return "Hello Admin from SB and Keycloak";
    }

}
