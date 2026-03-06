package com.api.Exceptions;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.api.Exception.GlobalExceptionHandlerCommon;

@RestControllerAdvice
public class GlobalExceptionHandler extends GlobalExceptionHandlerCommon{

//	@ExceptionHandler(ResourceNotFoundException.class)
//	public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex) {
//		ErrorResponse response = new ErrorResponse(ex.getMessage(), ex.getStatus());
//		return new ResponseEntity<ErrorResponse>(response, ex.getStatus());
//	}
//
//	@ExceptionHandler(BadRequestException.class)
//	public ResponseEntity<ErrorResponse> handleBadRequestException(BadRequestException ex) {
//		ErrorResponse response = new ErrorResponse(ex.getMessage(), ex.getStatus());
//		return new ResponseEntity<ErrorResponse>(response, ex.getStatus());
//	}
//
//	@ExceptionHandler(MissingParameterException.class)
//	public ResponseEntity<ErrorResponse> handleMissingParameterException(MissingParameterException ex) {
//		ErrorResponse response = new ErrorResponse(ex.getMessage(), ex.getStatus());
//		return new ResponseEntity<ErrorResponse>(response, ex.getStatus());
//	}
//
//	@ExceptionHandler(CustomException.class)
//	public ResponseEntity<ErrorResponse> handleCustomException(CustomException ex) 
//	{
//		ErrorResponse errorResponse = new ErrorResponse(ex.getMessage(), ex.getStatus());
//		return ResponseEntity.status(ex.getStatus()).body(errorResponse);
//	}
}