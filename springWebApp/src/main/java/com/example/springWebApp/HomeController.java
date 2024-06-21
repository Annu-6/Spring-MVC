package com.example.springWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller //we return view. So any uri eg "/" will not work hence no text returned bcz they looking for files to render view
@RestController //combine @Controller & @ResponseBody, we can't return a view, Rest APIs ie, "/" will work and text returned
public class HomeController {

    //we send data from server to client
    @RequestMapping("/")
//    @ResponseBody
    public String greet() {
        System.out.println("i am here...");
        return "Welcome to Annu!!!";
    }

    //we send data from server to client
    @RequestMapping("/about")
    public String about() {
        return "We don't teach, we Educate!!";
    }
}
