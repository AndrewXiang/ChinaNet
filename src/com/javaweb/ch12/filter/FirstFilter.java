package com.javaweb.ch12.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;

import com.javaweb.ch12.model.Operator;


/**
 * 
 * TODO 判断用户是否有进入系统的权限
 */
public class FirstFilter implements Filter {

	public void init(FilterConfig cong) {
//		do nothing
	}

	public void doFilter(ServletRequest srequest, ServletResponse sresponse,
			FilterChain chain) {

		try {
			HttpServletRequest requst = (HttpServletRequest) srequest;
			HttpServletResponse response = (HttpServletResponse) sresponse;
			HttpSession session = requst.getSession();
			//从session从取出操作员对象,如果为空说明没有登录,将其转到登录页面.
			Operator operator = (Operator) session.getAttribute("operator");
			if (operator == null) {
				
					response.sendRedirect("/chinamobile/index.html");
				
			} else {
				chain.doFilter(srequest, sresponse);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void destroy() {
		//do nothing
	}

}

