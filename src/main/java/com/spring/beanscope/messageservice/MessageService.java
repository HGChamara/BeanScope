package com.spring.beanscope.messageservice;

public class MessageService 
{
	private String message;

	public String getMessage() 
	{
		System.out.println("Message - "+message);
		return message;
	}

	public void setMessage(String message) 
	{
		this.message = message;
	}
	
}
