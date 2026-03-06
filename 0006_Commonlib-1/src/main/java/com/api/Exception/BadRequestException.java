package com.api.Exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private HttpStatus status;

    // existing constructor
    public BadRequestException(String message) {
        super(message);
        this.status = HttpStatus.BAD_REQUEST;
    }

    // ✅ add this constructor
    public BadRequestException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}