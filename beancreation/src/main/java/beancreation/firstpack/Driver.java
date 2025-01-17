package beancreation.firstpack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		BeanFactory fact = new ClassPathXmlApplicationContext("my_config.xml");
		Person p = fact.getBean("my_person",Person.class);
		System.out.println(p);
	}
}
