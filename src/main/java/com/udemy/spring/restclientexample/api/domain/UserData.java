package com.udemy.spring.restclientexample.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserData {

    @JsonProperty("data")
    private List<User> users;

}
