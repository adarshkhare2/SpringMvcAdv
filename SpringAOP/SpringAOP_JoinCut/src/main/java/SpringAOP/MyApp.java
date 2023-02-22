package SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		// Testint testint = context.getBean(TestImpClass.class);

		Object object = context.getBean("id8");
		Testint testint = (Testint) object;

		System.out.println("****************************");
//++++ CONSEPT -> JOIN POINT USE FOR TO SHOW SERVICE BOFRE & AFTER THE EVERY ADVICE/CLASS.
		testint.sayHi();
		System.out.println("****************************");

		testint.sayBy();
		System.out.println("****************************");

		testint.getdata();
		System.out.println("****************************");

		testint.getMydata();
		System.out.println("****************************");

	}

}
