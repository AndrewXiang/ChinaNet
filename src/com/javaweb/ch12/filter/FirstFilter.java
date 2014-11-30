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
 * TODO �ж��û��Ƿ��н���ϵͳ��Ȩ��
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
			//��session��ȡ������Ա����,���Ϊ��˵��û�е�¼,����ת����¼ҳ��.
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

