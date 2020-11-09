package com.spring.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controlador {
	@GetMapping(value = "/")
	public String index()
	{
		return "index";
	}

}
