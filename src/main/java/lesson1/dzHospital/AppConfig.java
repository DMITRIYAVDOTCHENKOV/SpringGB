package lesson1.dzHospital;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;

@Configuration
public class AppConfig {
	private lesson1.dzHospital.Human Human;

	@Bean(name = "Human")
	public Human human() {
		return new Human();
	}

	@Bean(name = "Registry")
	public Registry registry(Human human){
		Registry registry = new Registry();
		registry.setHuman(registry);
		return registry;
	}
}
