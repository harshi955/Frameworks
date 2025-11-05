package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
//		Resource r=new ClassPathResource("application.xml");
//		BeanFactory b= new XmlBeanFactory(r);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		Employee e=(Employee) ctx.getBean("emp");
		e.m1();

	}

}
