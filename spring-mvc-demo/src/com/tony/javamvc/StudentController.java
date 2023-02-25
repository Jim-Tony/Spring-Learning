package com.tony.javamvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showStudentForm")
	public String showForm(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student",theStudent);
		return "student-form";
	}
	
	@RequestMapping("/processStudentForm")
		public String processForm(@ModelAttribute("student") Student theStudent) {
			System.out.println(theStudent.getFirstName() + ' ' + theStudent.getLastName() +' ' + theStudent.getCountry());
			return "student-confirmation";
		}
	}
