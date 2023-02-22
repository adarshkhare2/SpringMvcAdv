package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/")
@Controller
public class Mycontroller1 {
	@GetMapping("a")
	public String hendler1() {
		return "view1";
	}
	@RequestMapping("b")
	public String hendler2() {
		return "view2";
	}
	@RequestMapping("login")
	public String hendler3() {
		return "login";
	}
}
