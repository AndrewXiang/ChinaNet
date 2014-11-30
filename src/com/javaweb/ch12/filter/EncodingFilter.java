package com.javaweb.ch12.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import dao.AccessBean;

/**
 * 
 * TODO 本过滤器的主要功能就是完成对全站的编码_GBK
 */
public class EncodingFilter implements Filter {

	public void init(FilterConfig cong) {
		//		do nothing
	}

	public void doFilter(ServletRequest srequest, ServletResponse sresponse,
			FilterChain chain) {
		try{
			//编码
			srequest.setCharacterEncoding("GBK");
			//继续请求
			chain.doFilter(srequest, sresponse);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void destroy() {
		//do nothing
	}

}
