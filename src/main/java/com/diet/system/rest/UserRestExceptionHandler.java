package com.diet.system.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserRestExceptionHandler {

@ExceptionHandler
public ResponseEntity<UserErrorResponse> handleException(UserNotFoundException exe)
{
	UserErrorResponse error=new UserErrorResponse();
	
	error.setStatus(HttpStatus.BAD_REQUEST.value());
	error.setMessage(exe.getMessage());
	error.setTimestamp(System.currentTimeMillis());
		
	return new ResponseEntity<UserErrorResponse>(error,HttpStatus.BAD_REQUEST);	
}	



@ExceptionHandler
public ResponseEntity<UserErrorResponse> handleException(Exception exe)
{
	UserErrorResponse error=new UserErrorResponse();
	
	error.setStatus(HttpStatus.BAD_REQUEST.value());
	error.setMessage(exe.getMessage());
	error.setTimestamp(System.currentTimeMillis());
		
	return new ResponseEntity<UserErrorResponse>(error,HttpStatus.BAD_REQUEST);	
}	
}
