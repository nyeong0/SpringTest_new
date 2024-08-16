package com.nyeong.spring.test.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lifecycle/test01")
public class Test01Controller {

	@RequestMapping("/1")
	public String welcome() {
		
		return "<h1>테스트 프로젝트 완성</h1><h4>해당 프로젝트를 통해서 문제 풀이를 진행합니다.</h4>";
	}
	
	@RequestMapping("/2")
	public Map<String, Integer> scoreData(){
		
		Map<String, Integer> scoreMap = new HashMap<>();
		scoreMap.put("국어", 80);
		scoreMap.put("수학", 90);
		scoreMap.put("영어", 85);
		
		return scoreMap;
	}
}
