package com.cg.sprint.exception;

public class ErrorResponse {

	private String name;

	
	public ErrorResponse(String payeeName) {
		super();
		this.name = payeeName;
	}

	public String getPayeeName() {
		return name;
	}

	public void setPayeeName(String payeeName) {
		this.name = payeeName;
	}
	
}
