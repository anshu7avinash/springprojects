package spring_cons_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("customerContext.xml");
		
		Customer c = (Customer)context.getBean("customer");
		
		c.displayInfo();
	}

}
