package mannu.dev.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${test.value}")
	private String testValue;
	
	@GetMapping
	public String testVal() {
		return testValue;
	}
}
