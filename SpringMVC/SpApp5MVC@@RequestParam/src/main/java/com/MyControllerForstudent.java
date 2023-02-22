package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
@Controller
public class MyControllerForstudent {

	@RequestMapping("UrlStudent")
	public String hendler1() {
		return "student";

	}

	@RequestMapping("urlforstudent")
	public String hendler2(@RequestParam String studentName,@RequestParam String studentCity,@RequestParam String studentAge, Model model) {
		
		model.addAttribute("k1",studentName);
		model.addAttribute("k2",studentCity);
		model.addAttribute("k3",studentAge);

		
	

		return "viewStudent";

	}
}
