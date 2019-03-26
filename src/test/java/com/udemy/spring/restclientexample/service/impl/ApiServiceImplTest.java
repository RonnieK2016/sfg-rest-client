package com.udemy.spring.restclientexample.service.impl;

import com.udemy.spring.restclientexample.api.domain.User;
import com.udemy.spring.restclientexample.service.ApiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApiServiceImplTest {

    @Autowired
    private ApiService apiService;

    @Test
    public void getUsers() {
        List<User> users = apiService.getUsers(3);
        assertNotNull(users);
        assertEquals(4, users.size());
    }
}