package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
@Controller
public class MyControllerForteacher {

	@RequestMapping("UrlTeacher")
	public String hendler1() {
		return "teacher";

	}

	@RequestMapping("urlforteacher")
	public String hendler2(@RequestParam String teacherName, @RequestParam String teacherCity,
			@RequestParam String teacherAge,Model m ) {
		m.addAttribute("key1",teacherName);
		m.addAttribute("key2",teacherCity);
		m.addAttribute("key3",teacherAge);
		return "viewTeacher";

	}

}
