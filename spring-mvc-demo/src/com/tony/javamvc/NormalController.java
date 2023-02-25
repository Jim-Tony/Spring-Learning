package com.tony.javamvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 
 * @author tonyji
 * We are using a parent domain to get rid of ambiguity in URL
 */
@Controller
@RequestMapping("/normal")
public class NormalController {
    @RequestMapping("/processForm")
	public String showForm() {
		return "normal";
	}
}
