package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class springController {
	
	@GetMapping("/home")
	public String home() {
		System.out.println("this is my url!");
		return "index";
	}

}
