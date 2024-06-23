package ru.kata.spring.boot_security.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ViewController {

    @GetMapping("/admin")
    public String showAdminPage() {
        return "adminPage";
    }

    @GetMapping("/user")
    public String showUserPage(){
        return "userInfo";
    }
}
