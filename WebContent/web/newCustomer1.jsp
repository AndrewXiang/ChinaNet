<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ page import="com.javaweb.ch12.model.*"%>
<%@page import="com.javaweb.ch12.service.IOperator"%>
<%@ page import="org.springframework.context.ApplicationContext"%>
<%@ page
	import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%
	String idType = request.getParameter("idType");
	String idNumber = request.getParameter("idNumber");
	Customer mycostomer = new Customer();
	mycostomer.setIdNumber(idNumber);
	mycostomer.setIdType(idType);
	Operator operator = (Operator) session.getAttribute("operator");
	int ad = operator.getIsAdmin();
	//加载Spring配置文件，初始化IOC容器
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");
		//从容器接管bean
	IOperator dooperator = (IOperator) context
			.getBean("operatorservice");
%>
<HTML>
	<HEAD>
		<TITLE>中国电信业务管理系统</TITLE>
		<META http-equiv=Content-Type content="text/html; charset=gb2312">
		<META content="MSHTML 6.00.2600.0" name=GENERATOR>
		<link href="style.css" rel="stylesheet" type="text/css">
	</HEAD>
	<BODY bgColor=#ffffff leftMargin=0 topMargin=0 marginheight="0"
		marginwidth="0">
		<CENTER>
			<TABLE cellSpacing=0 cellPadding=0 width=749 border=0>
				<TBODY>
					<TR>
						<TD width=173>
							<A href="http://ah.189.cn/index.html"><IMG height=74
									src="../images/logo_dianxin.jpg" width=173 border=0> </A>
						</TD>
						<TD vAlign=top align=right>
							<TABLE width="100%" border=0 cellPadding=0 cellSpacing=0>
								<TBODY>
									<TR bgColor=#2650a6>
										<TD height="12">
											<img src="../images/spacer.gif" width="1" height="1">
										</TD>
										<TD height="12">
											<img src="../images/spacer.gif" width="1" height="1">
										</TD>
										<TD height="12">
											<img src="../images/spacer.gif" width="1" height="1">
										</TD>
										<TD height="12">
											<img src="../images/spacer.gif" width="1" height="1">
										</TD>
										<TD height="12">
											<img src="../images/spacer.gif" width="1" height="1">
										</TD>
									</TR>
									<TR bgColor=#FFFFFF>
										<TD>
											<img src="../images/spacer.gif" width="1" height="1">
										</TD>
										<TD>
											<img src="../images/spacer.gif" width="1" height="1">
										</TD>
										<TD>
											<img src="../images/spacer.gif" width="1" height="1">
										</TD>
										<TD>
											<img src="../images/spacer.gif" width="1" height="1">
										</TD>
										<TD>
											<img src="../images/spacer.gif" width="1" height="1">
										</TD>
									</TR>
									<TR>
										<TD>
											<img src="../images/pic01.gif" width="115" height="55">
										</TD>
										<TD>
											<img src="../images/pic04.gif" width="115" height="55">
										</TD>
										<TD>
											<img src="../images/pic03.gif" width="115" height="55">
										</TD>
										<TD>
											<img src="../images/pic02.gif" width="115" height="55">
										</TD>
										<TD>
											<img src="../images/pic05.jpg" width="115" height="55">
										</TD>
									</TR>
								</TBODY>
							</TABLE>
						</TD>
					</TR>
					<TR>
						<TD height="12" colSpan=2 align=right bgColor=#d4dced>


							<img src="../images/spacer.gif" width="1" height="1">
							<TABLE cellSpacing=0 cellPadding=0 border=0>
								<TBODY>
									<TR>
									</TR>
								</TBODY>
							</TABLE>

						</TD>
					</TR>
					<TR>
						<TD colSpan=2>
							<IMG height=2 src="../images/blank(1).gif" width=1>
						</TD>
					</TR>
				</TBODY>
			</TABLE>
			<TABLE cellSpacing=0 cellPadding=0 width=749 border=0>
				<TBODY>
					<TR vAlign=top>
						<TD width=173 bgColor=#c9d3e9 rowSpan=2>
							<TABLE cellSpacing=0 cellPadding=0 width=173 border=0>
								<TBODY>
									<%
										if (ad == 1) {
									%>
									<TR>
										<TD width=11 height="29" bgColor=#2650a6>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
											<img src="../images/Arrow1.gif" width="23" height="23">
										</TD>
										<TD width=165 height="29" bgColor=#7691c7>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<A class=nav href="newOperator.jsp">新增操作员</A>
										</TD>
									</TR>
									<TR>
										<TD bgColor=#ffffff colSpan=2>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
										</TD>
									</TR>
									<!--TR>
          <TD width=11 bgColor=#2650a6><IMG height=1 
            src="images/blank.gif" width=1 border=0><img src="images/Arrow1.gif" width="23" height="23"></TD>
          <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A 
            class=nav 
            href="modifyOperator.htm">修改操作员</A></TD>
        </TR-->
									<TR>
										<TD bgColor=#ffffff colSpan=2>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
										</TD>
									</TR>
									<TR>

									</TR>
									<TR>
										<TD bgColor=#ffffff colSpan=2>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
										</TD>
									</TR>
									<TR>
										<TD width=11 bgColor=#2650a6>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
											<img src="../images/Arrow1.gif" width="23" height="23">
										</TD>
										<TD width=165 height="29" bgColor=#7691c7>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<A class=nav href="Resource.jsp">资源管理</A>
										</TD>
									</TR>
									<TR>
										<TD bgColor=#ffffff colSpan=2>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
										</TD>
									</TR>
									<TR>
										<TD width=11 bgColor=#2650a6>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
											<img src="../images/Arrow1.gif" width="23" height="23">
										</TD>
										<TD width=165 height="29" bgColor=#7691c7>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<A class=nav href="Charge.jsp">配置业务费用</A>
										</TD>
									</TR>
									<TR>
										<TD bgColor=#ffffff colSpan=2>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
										</TD>
									</TR>
									<TR>
										<!--TD width=11 bgColor=#2650a6><IMG height=1 
            src="images/blank.gif" width=1 border=0><img src="images/Arrow1.gif" width="23" height="23"></TD>
          <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A 
            class=nav 
            href="#"></A></TD-->
									</TR>
									<%
										}
									%>
									<TR>
										<TD bgColor=#ffffff colSpan=2>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
										</TD>
									</TR>
									<TR>
										<TD width=11 bgColor=#2650a6>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
											<img src="../images/Arrow1.gif" width="23" height="23">
										</TD>
										<TD width=165 height="29" bgColor=#7691c7>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<A class=nav href="newCustomer.jsp">开户</A>
										</TD>
									</TR>
									<TR>
										<TD bgColor=#ffffff colSpan=2>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
										</TD>
									</TR>
									<TR>
										<TD width=11 bgColor=#2650a6>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
											<img src="../images/Arrow1.gif" width="23" height="23">
										</TD>
										<TD width=165 height="29" bgColor=#7691c7>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<A class=nav href="logout.jsp">退出</A>
										</TD>
									</TR>
									<TR>
										<TD bgColor=#ffffff colSpan=2>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
										</TD>
									</TR>

									<TR align=middle>
										<TD colSpan=2 height=160>
											&nbsp;
										</TD>
									</TR>
									<TR>
										<TD colSpan=2>
											<IMG height=1 src="../images/blank.gif" width=1>
										</TD>
									</TR>
								</TBODY>
							</TABLE>
						</TD>
						<TD width=2 rowSpan=3>
							<IMG height=1 src="../images/blank(1).gif" width=2>
						</TD>
						<TD width="2">
							<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
								<TBODY>
									<TR>
										<TD height=25>
											&nbsp;您现在的位置：新增客户>第二步
										</TD>
									</TR>
									<TR>
										<TD bgColor=#2650a6>
											<IMG height=1 src="../images/blank(1).gif" width=1>
										</TD>
									</TR>
									<TR>
										<TD>
											<IMG height=2 src="../images/blank(1).gif" width=574>
										</TD>
									</TR>
								</TBODY>
							</TABLE>
						</TD>
					</TR>
					<TR vAlign=top>
						<TD height="600" bgColor=#f1f3f9>
							<form method="POST" action="../addCustomer.action">
								<%
									Customer customer = dooperator.isCustomerExist(mycostomer);
									if (customer != null) {
								%>
								<p>
									证件类型：<%=customer.getIdType()%><input type="hidden"
										name="idType" value="<%=customer.getIdType()%>">
								</p>
								<p>
									证件号码：<%=customer.getIdNumber()%><input type="hidden"
										name="idNumber" value="<%=customer.getIdNumber()%>">
								</p>
								<p>
									姓名：
									<input type="text" name="customerName" size="20"
										value="<%=customer.getCustomerName()%>">
								</p>
								<p>
									性别：
									<input type="radio" value="M"
										<%if (customer.getCustomerSex().equals("M")) {%> checked <%}%>
										name="customerSex">
									男&nbsp;&nbsp;
									<input type="radio"
										<%if (customer.getCustomerSex().equals("F")) {%> checked <%}%>
										name="customerSex" value="F">
									女
								</p>
								<p>
									生日：
									<input type="text" name="customerBirtyday" size="20"
										value="<%=customer.getCustomerBirtyday()%>">
								</p>
								<p>
									联系地址：
									<input type="text" name="customerAddress" size="20"
										value="<%=customer.getCustomerAddress()%>">
								</p>
								<%
									} else {
								%>
								<p>
									证件类型：<%=mycostomer.getIdType()%><input type="hidden"
										name="idType" value="<%=mycostomer.getIdType()%>">
								</p>
								<p>
									证件号码：<%=mycostomer.getIdNumber()%><input type="hidden"
										name="idNumber" value="<%=mycostomer.getIdNumber()%>">
								</p>
								<p>
									姓名：
									<input type="text" name="customerName" size="20" value="">
								</p>
								<p>
									性别：
									<input type="radio" value="M" checked name="customerSex">
									男&nbsp;&nbsp;
									<input type="radio" name="customerSex" value="F">
									女
								</p>
								<p>
									生日：
									<input type="text" name="customerBirtyday" size="20" value="">
								</p>
								<p>
									联系地址：
									<input type="text" name="customerAddress" size="20" value="">
								</p>
								<%
									}
								%>
								<p>
								</p>
								<p>
									<input type="submit" value="下一步>>" name="B1">
									<input type="reset" value="全部重写" name="B2">
								</p>

							</form>

						</TD>
					</TR>
				</TBODY>
			</TABLE>
			<BR>
		</CENTER>
	</BODY>
</HTML>
