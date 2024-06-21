package com.example.springWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    //we send data from server to client
    @RequestMapping("/login")
    @ResponseBody
    public String login() {
        return "Login Page...";
    }
}
