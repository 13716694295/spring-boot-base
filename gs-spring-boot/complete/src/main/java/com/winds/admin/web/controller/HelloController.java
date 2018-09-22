package com.winds.admin.web.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.winds.admin.core.model.system.User;

@RestController
public class HelloController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping("/index")
	@ResponseBody
	public String index(HttpServletRequest request, HttpServletResponse response, String data) {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/login")
	@ResponseBody
	public String login(HttpServletRequest request, HttpServletResponse response, String data) {
		HttpSession session = request.getSession();
		User user = null;
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("userPass");

		// 初始化
		userName = "汪师生";
		passWord = "xxxxxxxx";

		if (!StringUtils.isAllEmpty(userName, passWord)) {
			user = new User();
			// TODO 查询用户信息校验
			user.setSessionId(session.getId());
			user.setUserName(userName);
			user.setPassWord(passWord);
			user.setCreateTime(new Date());
			session.setAttribute(session.getId(), user);
			// 设置session过期时间-2分钟
			session.setMaxInactiveInterval(2 * 60);
		}
		return "please login in";
	}

	@RequestMapping("/register")
	@ResponseBody
	public String register(HttpServletRequest request, HttpServletResponse response) {
		return "please register";
	}

}
