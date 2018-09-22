package com.winds.admin.config.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.winds.admin.core.model.system.User;

/**
* @author   :WindsJune/博客园：WindsJune
* @version  :1.1.0
* @date     :2018年9月19日 上午9:36:16
* @comments :登录拦截器
*/

@Component
public class LoginInterceptor implements HandlerInterceptor{
	
	private static final Logger LOGGER=LoggerFactory.getLogger(HandlerInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute(session.getId());
		if (user != null && StringUtils.equals(user.getSessionId(), session.getId())) {
            LOGGER.info("恭喜：["+user.getUserName()+"] 登录成功！登录信息："+user.toString());
			String url = "/index";
            response.sendRedirect(url);
		}else {
			String url = "/login";
            response.sendRedirect(url);
            return false;
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception {
		System.out.println("afterCompletion");
	}
	
}
