package com.nyeong.spring.test.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nyeong.spring.test.mvc.domain.User;
import com.nyeong.spring.test.mvc.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	// 가장 최근 등록된 사용자 정보 리턴
	public User getLastUser() {
		
		User lastUser = userRepository.selectLastUser();
		
		return lastUser;
	}
}
