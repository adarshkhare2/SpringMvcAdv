package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class MyControllerForstudent {

	@RequestMapping("UrlStudent")
	public String hendler1() {
		return "student";

	}

	@RequestMapping("urlforstudent")
	public String hendler2(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("studentName");
		String city = request.getParameter("studentCity");
		String age = request.getParameter("studentAge");
		
		System.out.println(name+" "+ city+" " + age);

		request.setAttribute("k1", name);
		request.setAttribute("k2", city);
		request.setAttribute("k3", age);

		return "viewStudent";

	}
}
