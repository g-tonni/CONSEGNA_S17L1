package giadatonni.CONSEGNA_S17L1;

import giadatonni.CONSEGNA_S17L1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ConsegnaS17L1Application {

	public static void main(String[] args) {
		SpringApplication.run(ConsegnaS17L1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConsegnaS17L1Application.class);

		Menu menu = ctx.getBean(Menu.class);
		menu.stampaMenu();
	}

}
