package spring_cons_injection_depedentObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("guestContext.xml");
		Guest g = (Guest)context.getBean("guest");
		g.show();
	}

}
