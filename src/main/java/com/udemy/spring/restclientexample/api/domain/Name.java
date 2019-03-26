package com.udemy.spring.restclientexample.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Name {

    private String title;
    @JsonProperty("first")
    private String firstName;
    @JsonProperty("last")
    private String lastName;
}
