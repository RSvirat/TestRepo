package sudhakar.corejava.rating.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@PropertySource("classpath:testing/application.properties")
public class StudentController {
	

	@Value("${username.my.project}")
	private String name = null; 
	
	@GetMapping("/name")
	public String name() {
		return name;
	}
}
