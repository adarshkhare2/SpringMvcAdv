package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
@Controller
public class MyControllerForadmin {

	@RequestMapping("UrlAdmin")
	public String hendler1() {
		return "admin";

	}

	@RequestMapping("urlforadmin")
	public String hendler2(@RequestParam String adminName, @RequestParam String adminCity,
			@RequestParam String adminAge,Model m ) {
		m.addAttribute("key1",adminName);
		m.addAttribute("key2",adminCity);
		m.addAttribute("key3",adminAge);
		return "viewAdmin";

	}

}
