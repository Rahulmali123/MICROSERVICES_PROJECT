package com.auth.exception;

import org.springframework.http.HttpStatus;

public class MissingParameterException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    
	private String message;
    private HttpStatus status;

    public MissingParameterException(String message) {
        this.message = message;
        this.status = HttpStatus.BAD_REQUEST;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
