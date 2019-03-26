package com.udemy.spring.restclientexample.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Login {
    private String username;
    private String password;
    private String md5;
    private String sha1;
    private String sha256;
}
