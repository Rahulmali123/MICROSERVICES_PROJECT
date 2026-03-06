package com.api.Exception;

import org.springframework.http.HttpStatus;

public class MissingParameterException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private HttpStatus status;

    public MissingParameterException(String message) {
        super(message);
        this.status = HttpStatus.BAD_REQUEST;
    }

    public HttpStatus getStatus() {
        return status;
    }
}