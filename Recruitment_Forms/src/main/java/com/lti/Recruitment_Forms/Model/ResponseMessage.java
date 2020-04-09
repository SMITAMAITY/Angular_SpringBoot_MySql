package com.lti.Recruitment_Forms.Model;



import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("responseMessage")
@Scope(scopeName="prototype")

public class ResponseMessage{
	
	
	public ResponseMessage() {
		super();
		
	}

	public ResponseMessage(String message){
		this.message = message;
	}
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
