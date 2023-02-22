package SpringHibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spconfig.xml");
		StudentBean studentBean = context.getBean(StudentBean.class);
		
		Students students= new Students();
		students.setStudent_city("Indore");
		students.setStudent_id(7);
		students.setStudent_name("Aditi");
		
		studentBean.saveStudent(studentBean);
		System.out.println("Student details saved");
	}

}
