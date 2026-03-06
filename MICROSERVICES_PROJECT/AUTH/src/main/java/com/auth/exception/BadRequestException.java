package com.auth.exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String message;
	private HttpStatus status;

	public BadRequestException(String message) {
//        super(message);
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
