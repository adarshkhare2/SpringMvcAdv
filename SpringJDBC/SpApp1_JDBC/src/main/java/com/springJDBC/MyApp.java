package com.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("MyConfig.xml");

		UserBean userBean = (UserBean) context.getBean("id3");

		//userBean.createBookTable();
		userBean.insertBookTable();
		//userBean.updateBookTable();
		//userBean.deleteBookTable();
		
		
	}

}
