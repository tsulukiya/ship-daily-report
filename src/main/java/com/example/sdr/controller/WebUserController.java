package com.example.sdr.controller;

import com.example.sdr.models.UserRole;
import com.example.sdr.repository.WebUserRepository;
import com.example.sdr.models.WebUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebUserController {
    private WebUserRepository webUserRepository;

    @Autowired
    public WebUserController(WebUserRepository webUserRepository) {
        this.webUserRepository = webUserRepository;
    }

    @GetMapping("/")
    public String greeting(){
        return "main";
    }

    @PostMapping("/")
    public String save(@RequestParam String webUserName, @RequestParam String userPassword) {
        WebUser webUser = new WebUser(webUserName, userPassword);
        webUserRepository.save(webUser);
        return "main";
    }
}
