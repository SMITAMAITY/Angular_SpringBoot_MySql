package com.lti.Recruitment_Forms.Model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("response")
@Scope(scopeName = "prototype")
public class Response<T> {
	private String responseMessage;
	private long responseCode;
	private T responseObject;

	public Response() {
		super();

	}

	public Response(String responseMessage, long responseCode, T responseObject) {
		super();
		this.responseMessage = responseMessage;
		this.responseCode = responseCode;
		this.responseObject = responseObject;

	}

	
	public Response(String responseMessage) {
		super();
		this.responseMessage = responseMessage;
	}
	

	public Response(T responseObject) {
		super();
		this.responseObject = responseObject;
	}

	public Response(long responseCode) {
		super();
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public long getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(long responseCode) {
		this.responseCode = responseCode;
	}

	public T getResponseObject() {
		return responseObject;
	}

	public void setResponseObject(T responseObject) {
		this.responseObject = responseObject;
	}

	@Override
	public String toString() {
		return "ResponseMessage [responseMessage=" + responseMessage + ", responseCode=" + responseCode
				+ ", responseObject=" + responseObject + "]";
	}

}
