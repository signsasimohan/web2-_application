package webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WebController {
	
	
	@GetMapping(value = "/web")
	public String getWeb() {
		
		return "Success Full Created Web Application";
	}
	
	
}
