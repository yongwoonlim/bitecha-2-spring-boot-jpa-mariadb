package com.yongwoonlim.api.security.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class LoginRunnerException extends RuntimeException{
    private static final long SerializableUID = 1L;

    public LoginRunnerException() {
        super();
    }

    public LoginRunnerException(String msg) {
        super(msg);
    }
}