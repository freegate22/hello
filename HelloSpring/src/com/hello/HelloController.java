package com.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {

		String message = "Hello, Spring 3.0!";
		System.out.println(message);
		return new ModelAndView("hello", "message", message);
	}
}

