package com.bolsadeideas.springboot.exampleerror.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@SuppressWarnings("unused")
	@GetMapping("/index")
	public String index() {
//		error aritmética
//		Integer valor = 100/0;
		Integer valor = Integer.parseInt("10xaaa");
		return "index";
	}
}
