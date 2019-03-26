package com.udemy.spring.restclientexample.api.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class Card {

    private String type;
    private String number;
    private ExpirationDate expirationDate;
    private String iban;
    private String swift;
}
