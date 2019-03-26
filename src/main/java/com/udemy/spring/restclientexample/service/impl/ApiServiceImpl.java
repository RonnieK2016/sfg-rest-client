package com.udemy.spring.restclientexample.service.impl;

import com.udemy.spring.restclientexample.api.domain.User;
import com.udemy.spring.restclientexample.api.domain.UserData;
import com.udemy.spring.restclientexample.service.ApiService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class);

        return userData != null ? userData.getUsers() : null;
    }
}
