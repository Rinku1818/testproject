package com.suhani.testproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class HelloWorldControler {
    @RequestMapping("/suhani")
    @ResponseBody

    public String getHelloworld(){
        return "good morning";
    }
    
}
