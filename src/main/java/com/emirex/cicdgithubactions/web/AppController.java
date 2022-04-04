package com.emirex.cicdgithubactions.web;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/home")
    public String welcome(){
        return "Hello World";
    }

}




        git commit -m "first commit"
        git branch -M main
        git remote add origin https://github.com/ChukwuEmeka1269/CICD-demo.git
        git push -u origin main
