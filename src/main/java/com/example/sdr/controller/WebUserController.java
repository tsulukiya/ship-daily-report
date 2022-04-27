package com.example.sdr.controller;

import com.example.sdr.models.UserRole;
import com.example.sdr.repository.WebUserRepository;
import com.example.sdr.models.WebUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class WebUserController {
    private WebUserRepository webUserRepository;

    @Autowired
    public WebUserController(WebUserRepository webUserRepository) {
        this.webUserRepository = webUserRepository;
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String save(@RequestParam String username, @RequestParam String password, Map<String, Object> model) {
        WebUser userFromDb = webUserRepository.findByEmail(username);

        if (userFromDb != null) {
            model.put("message", "User exists!");
            return "registration";
        }
        WebUser webUser = new WebUser();
        webUser.setEmail(username);
        webUser.setUserPassword(password);
        webUser.setActive(true);
        webUser.setRole(UserRole.ADMIN);
        webUserRepository.save(webUser);
        return "login";
    }
}
