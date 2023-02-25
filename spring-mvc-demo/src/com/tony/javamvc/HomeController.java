package com.tony.javamvc;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String showHomePage() {
		return "main-menu";
	}
	@RequestMapping("/showForm")
	public String showForm() {
		return "show-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "process-form";
	}
	
	//Adding data to model
	@RequestMapping("/processFormVersionTwo")
	public String convertToUpperCase(HttpServletRequest request, Model model) {
		String theName = request.getParameter("myName");
		theName = "Hey "+theName.toUpperCase();
		model.addAttribute("name",theName);
		return "process-form";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String convertToUpperCaseNext(@RequestParam("myName") String theName, Model model) {
		theName = "Oye!!! "+theName.toUpperCase();
		model.addAttribute("name",theName);
		return "process-form";
	}
}
