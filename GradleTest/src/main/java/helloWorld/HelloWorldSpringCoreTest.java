package helloWorld;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;


public class HelloWorldSpringCoreTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		//BeanFactory bf = new XmlBeanFactory(new FileSystemResource
			//	("C:\\Users\\grand\\Desktop\\Pa1 Docs\\Java Workspace\\com.helloSpringCore\\src\\spring-bean.xml"));
		//HelloWorldBean helloWorldbean2 = (HelloWorldBean) bf.getBean("hello"); //"hello" is the bean id
		
		HelloWorldBean helloWorldbean = (HelloWorldBean) context.getBean("hello"); //"hello" is the bean id
		//HelloWorldBean helloWorldbean1 = (HelloWorldBean) context.getBean("hello");

		helloWorldbean.displayMsg();
		//helloWorldbean.setMsg("This is my first Spring Program");
		//if you use singleton as scope then only one object is available even though you instantiated HelloWorldBean twice.
		//if you use prototype as scope then we can use two objects of HelloWorldBean that we created. (their hashcodes are different as seen)
		//System.out.println(helloWorldbean.hashCode()); //1st object
		//System.out.println(helloWorldbean1.hashCode()); //2st object
		

	}

}
