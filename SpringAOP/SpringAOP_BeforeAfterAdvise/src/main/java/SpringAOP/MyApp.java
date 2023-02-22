package SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		//Testint testint = context.getBean(TestImpClass.class);
		
//++++ CONSEPT -> POINTCUT USE FOR TO SHOW SERVICE BOFRE & AFTER THE EVERY METHOD.

		 Object object= context.getBean("id4");
		 Testint testint= (Testint)object;
		
		System.out.println("****************************");
		testint.m1();
		System.out.println("****************************");

		testint.m2();
		System.out.println("****************************");

		testint.m3();
		System.out.println("****************************");

	}

}
