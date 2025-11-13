package com.ArthurHenriqueDev.e_commerce.Domain.Exceptions.Model;

import java.time.Instant;

public class ExceptionModel {

    private String message;
    private Instant momento;

    public ExceptionModel(String message) {
        this.message = message;
        this.momento = Instant.now();
    }
}
