package com.javaweb.ch12.struts.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.javaweb.ch12.model.Operator;
import com.javaweb.ch12.service.IAdminOperator;
import com.javaweb.ch12.service.ILogin;
/** 
 * 功能:资源配置(增加可用手机号)
 */
public class ResourceAction extends BaseAction {
	/*
	 * Generated fields
	 */

	/** startMobile property */
	private String startMobile;

	/** nbtype property */
	private String nbtype;

	/** endMobile property */
	private String endMobile;

	/** 
	 * Returns the startMobile.
	 * @return String
	 */
	public String getStartMobile() {
		return startMobile;
	}

	/** 
	 * Set the startMobile.
	 * @param startMobile The startMobile to set
	 */
	public void setStartMobile(String startMobile) {
		this.startMobile = startMobile;
	}

	/** 
	 * Returns the nbtype.
	 * @return String
	 */
	public String getNbtype() {
		return nbtype;
	}

	/** 
	 * Set the nbtype.
	 * @param nbtype The nbtype to set
	 */
	public void setNbtype(String nbtype) {
		this.nbtype = nbtype;
	}

	/** 
	 * Returns the endMobile.
	 * @return String
	 */
	public String getEndMobile() {
		return endMobile;
	}

	/** 
	 * Set the endMobile.
	 * @param endMobile The endMobile to set
	 */
	public void setEndMobile(String endMobile) {
		this.endMobile = endMobile;
	}

	public String execute(){
		//加载Spring配置文件，初始化IOC容器
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");
		//从容器接管bean
		IAdminOperator admin=(IAdminOperator)context.getBean("adminservice");
//		调用业务层的方法设置业务收费增加可用手机号
		String message=admin.addNumber(nbtype, startMobile, endMobile);
		System.out.println(message);
		if(!message.equals("")){
			this.request().setAttribute("message", message);
			return SUCCESS;
		}
		else{
			return INPUT;
		}
	}
}