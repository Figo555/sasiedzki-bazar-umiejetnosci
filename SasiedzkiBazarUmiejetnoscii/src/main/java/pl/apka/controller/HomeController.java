package pl.apka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String start() {
		return "Sąsiedzki bazar umiejętności";
	}
}
