package com.javaweb.ch12.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import dao.AccessBean;

/**
 * 
 * TODO ������������Ҫ���ܾ�����ɶ�ȫվ�ı���_GBK
 */
public class EncodingFilter implements Filter {

	public void init(FilterConfig cong) {
		//		do nothing
	}

	public void doFilter(ServletRequest srequest, ServletResponse sresponse,
			FilterChain chain) {
		try{
			//����
			srequest.setCharacterEncoding("GBK");
			//��������
			chain.doFilter(srequest, sresponse);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void destroy() {
		//do nothing
	}

}
