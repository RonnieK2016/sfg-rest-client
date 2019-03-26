package com.udemy.spring.restclientexample.api.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class ExpirationDate {

    private String date;
    private Integer timezoneType;
    private String timezone;
}
