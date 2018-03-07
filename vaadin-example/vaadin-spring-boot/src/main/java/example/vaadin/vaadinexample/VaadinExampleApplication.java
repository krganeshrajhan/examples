package example.vaadin.vaadinexample;

import example.vaadin.vaadinexample.model.Contact;
import example.vaadin.vaadinexample.repository.ContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VaadinExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaadinExampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(ContactRepository repository) {
		return (args) -> {
			// save a couple of contacts for demo
			repository.save(new Contact("Mary", "Zheng", "mary.zheng@jcg.org", "6365272943"));
			repository.save(new Contact("Tom", "Smith", "tom.smith@jcg.org", "(636) 527-2943"));
			repository.save(new Contact("John", "Joe", "john.joe@jcg.org", "(314) 527 2943"));
			repository.save(new Contact("Cindy", "Chang", "cindy.change@jcg.org", "404-789-1456"));
		};
	}
}
