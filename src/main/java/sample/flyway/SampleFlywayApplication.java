package sample.flyway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SampleFlywayApplication {

	@Autowired
	private PersonRepository repository;

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "DB Migrate Demo using the FlyBase !!!!!";
	}

	public void run(String... args) throws Exception {
		System.err.println(this.repository.findAll());
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleFlywayApplication.class, args);
	}

}