package com.jsp.live_basics.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.live_basics.util.ResponseStructure;

@RestControllerAdvice

public class MovieNotFoundHandler {
	
	
	@ExceptionHandler(MovieNotFound.class)
	public ResponseEntity<ResponseStructure<String>>movieNotFound(MovieNotFound f){
		ResponseStructure<String>m=new ResponseStructure<String>();
		m.setData("Not found the movie id");
		m.setMessage(f.getMessage());
		m.setStatusCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>>(m, HttpStatus.NOT_FOUND);
	}

}
