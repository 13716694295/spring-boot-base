package com.winds.admin.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.winds.admin.model.login.User;

@RestController
public class HelloController {
    
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
	
    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request,HttpServletResponse response,String data) {
    	HttpSession session=request.getSession();
    	User user=new User();
    	//user.setUserName(userName);
    	LOGGER.info("getId:"+session.getId());
    	LOGGER.info("getAttributeNames:"+session.getAttributeNames());
    	LOGGER.info("getSessionContext:"+session.getSessionContext());
    	LOGGER.info("getValue:"+session.getValue("1"));
    	LOGGER.info("getServletContext:"+session.getServletContext());
        return "please login in";
    }
    
    @RequestMapping("/register")
    @ResponseBody
    public String register() {
        return "please register";
    }
    
}
