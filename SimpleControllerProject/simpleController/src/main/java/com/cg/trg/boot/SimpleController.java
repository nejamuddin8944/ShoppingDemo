package com.cg.trg.boot;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//this changed is made by Nejam

@Controller
@RequestMapping("")
public class SimpleController {
//	@RequestMapping(method = RequestMethod.GET)
	@GetMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("message","Welcome to Spring Boot Application");
		
		return "response";
	}
	
	@GetMapping("/admin")
	public String getAdmin(Model model) {
		model.addAttribute("message","This is admin page");
		
		return "response";
	}
	
	@GetMapping("/user")
	public String getUser(Model model) {
		model.addAttribute("message","This is user page");
		
		return "response";
	}
	
}
