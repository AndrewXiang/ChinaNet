package com.javaweb.ch12.struts.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {
    public HttpServletRequest request(){
		return ServletActionContext.getRequest();
    }
    public HttpServletResponse response(){
		return ServletActionContext.getResponse();	
    }
    public ServletContext application(){
    	return ServletActionContext.getServletContext();
    }
    public HttpSession session(){
		return ServletActionContext.getRequest().getSession();
    }
}
