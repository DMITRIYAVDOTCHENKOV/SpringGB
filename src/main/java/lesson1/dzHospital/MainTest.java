package lesson1.dzHospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.imageio.spi.IIORegistry;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainTest {

	public static void main(String[] args) {
//		var human = new Human();
//
//		human.processing();
//		human.archiveRequest();


//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		Registry registry = context.getBean("Registry", Registry.class);
//

//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		Human human = context.getBean("Human", Human.class);
//		human.processing();

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Human human = context.getBean("Human", Human.class);
		human.processing();
	}
}
