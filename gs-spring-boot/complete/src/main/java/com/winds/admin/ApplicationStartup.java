package com.winds.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationStartup {

	private static  final Logger LOGGER= LoggerFactory.getLogger(ApplicationStartup.class);

	public static void main(String[] args) {

		try {

			SpringApplication.run(ApplicationStartup.class, args);

			LOGGER.info("spring-boot-ApplicationStartup: 启动成功......");

		} catch (Exception e) {

			LOGGER.error("spring-boot-ApplicationStartup启动异常!",e);

		}

	}
}
