package net.viralpatel.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(Model model) {
		int count = 0;
		count++;
		model.addAttribute("name", "srinivas kashaboina"+count);
		System.out.println("hi+++++++++++++++++++++++++++++++++++++++++++++++++");

		return "welcome";
	}
}
