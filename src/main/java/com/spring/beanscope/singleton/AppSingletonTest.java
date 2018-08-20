package com.spring.beanscope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beanscope.messageservice.MessageService;

public class AppSingletonTest 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansSingleton.xml");
		MessageService messageService = (MessageService)context.getBean("messageService");
		messageService.setMessage("TEST 1");
		messageService.getMessage();
		
		MessageService messageService2 = (MessageService)context.getBean("messageService");
		messageService2.getMessage();
	}

}
