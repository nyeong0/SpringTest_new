package com.nyeong.spring.test.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test02Controller {
	
	@RequestMapping("/lifecycle/test02")
	public String thymleafTest() {
		return "lifecycle/test01";
	}
}
