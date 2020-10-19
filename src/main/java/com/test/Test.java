package com.test;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class Test {

    public String hello() {
        return "hello";
    }
}
