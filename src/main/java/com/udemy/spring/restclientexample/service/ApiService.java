package com.udemy.spring.restclientexample.service;

import com.udemy.spring.restclientexample.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
