package com.jsp.live_basics.exception;

import lombok.Data;

@Data
public class MovieNotFound extends RuntimeException{
	
	private String msg="Not Found";

	

	public MovieNotFound(String msg) {
		super();
		this.msg = msg;
	}



	public String getMsg() {
		return msg;
	}

	

}
