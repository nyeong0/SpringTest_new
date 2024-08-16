package com.nyeong.spring.test.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {

	@RequestMapping("/helloTest")
	@ResponseBody
	public String hello() {
		return "Hello test";
	}
}
