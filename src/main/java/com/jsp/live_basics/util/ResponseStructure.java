package com.jsp.live_basics.util;

public class ResponseStructure<T> {
	
	private String message;
	private int statusCode;
	private T data;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResponseStructure [message=" + message + ", statusCode=" + statusCode + ", data=" + data + "]";
	}
	
	
	
	

}
