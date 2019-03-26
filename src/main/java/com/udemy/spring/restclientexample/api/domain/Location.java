package com.udemy.spring.restclientexample.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Location {

    private String street;
    private String city;
    private String state;
    private String postCode;
}
