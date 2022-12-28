package com.example.securityapp.contoller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class GatewayContoller {

    @GetMapping
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @GetMapping("/logged")
    public String logged(Authentication authentication){
        System.out.println(authentication.getPrincipal());
        return "logged";
    }

}
