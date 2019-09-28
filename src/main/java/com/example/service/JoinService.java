package com.example.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.example.model.Users;

@Service
public class JoinService {

	public void joinUser(HttpServletRequest request) {
		String userId= request.getParameter("user_id");
		String userPw= request.getParameter("user_pw");
		String userName= request.getParameter("user_name");
		
		Users users = new Users();
		users.setUser_id(userId);
		users.setUser_pw(userPw);
		users.setUser_name(userName);
	}
}
