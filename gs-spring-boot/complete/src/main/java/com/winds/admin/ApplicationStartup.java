package com.winds.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationStartup {
	
    public static void main(String[] args) {
    	
    	try {
			
    		  SpringApplication.run(ApplicationStartup.class, args);
    		  
    		  System.out.println("spring boot application 启动成功....");
    		  
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
    	
    }
}
