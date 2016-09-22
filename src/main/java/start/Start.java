package start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import robotics.Robot;

public class Start {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Robot robot = (Robot)context.getBean("T1000Empty");
		robot.goToBazar();
	}
}
