package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyController1 {
	@RequestMapping("1")
	public String hendler1() {
		return "view1";

	}
	
}
