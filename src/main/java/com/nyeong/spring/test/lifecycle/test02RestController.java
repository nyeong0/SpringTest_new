package com.nyeong.spring.test.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lifecycle/test02")
public class test02RestController {

	@RequestMapping("/1")
	public List<Map<String, Object>> movieList(){
		
		List< Map<String, Object>> movieList = new ArrayList();

		Map<String, Object> map = new HashMap<>();
		map.put("rate", 15);
		map.put("director", "봉준호");
		map.put("time", 131);
		map.put("title", "기생충");
		movieList.add(map);
		
		map = new HashMap<>();
		map.put("rate", 10);
		map.put("director", "로베르토 베니니");
		map.put("time", 116);
		map.put("title", "인생은 아름다워");
		movieList.add(map);

		map = new HashMap<>();
		map.put("rate", 12);
		map.put("director", "크리스토퍼 놀란");
		map.put("time", 156);
		map.put("title", "인셉션");
		movieList.add(map);
		
		return movieList;
	}
	
	@RequestMapping("/2")
	public List<Board> boardList() {
		
		List<Board> boardList = new ArrayList<>();
		
		Board board = new Board("안녕하세요 가입인사 드립니다", "nyeong", "잘부탁드립니다.");
		boardList.add(board);
		boardList.add(new Board("ㅎㅓㄹ 대박", "adf", "........."));
		boardList.add(new Board("가나다라마바사", "bada", ".오늘 목요일..?."));
		boardList.add(new Board("ㅎ오늘 데이트한 얘기 해드릴게", "dulumary", "........."));
		
		return boardList;
	}
	
	@RequestMapping("/3")
	public ResponseEntity<Board> boardError(){
		Board board = new Board("안녕하세요 가입인사 드립니다", "nyeong", "잘부탁드립니다.");
		
		ResponseEntity<Board> entity = new ResponseEntity<>(board, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}
	
	
}
