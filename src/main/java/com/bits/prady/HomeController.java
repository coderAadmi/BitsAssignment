package com.bits.prady;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String showHome()
	{
		System.out.println("Home ran");
		return "home";
	}
	
	
	@RequestMapping("index")
	public String index() {
	    return "index";
	}

}
