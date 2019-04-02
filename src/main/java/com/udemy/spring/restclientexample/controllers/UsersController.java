package com.udemy.spring.restclientexample.controllers;

import com.udemy.spring.restclientexample.service.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ServerWebExchange;

@Controller
@Slf4j
public class UsersController {

    private ApiService apiService;

    public UsersController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping({"", "/", "/index"})
    public String index(Model model) {
        return "index";
    }

    @PostMapping("/users")
    public String formPost(Model model, ServerWebExchange serverWebExchange) {

        model.addAttribute("users", apiService.getUsers(serverWebExchange
                .getFormData()
                .map(data -> new Integer(data.getFirst("limit")))));

        return "userlist";
    }
}
