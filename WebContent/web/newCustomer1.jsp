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
	//����Spring�����ļ�����ʼ��IOC����
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");
		//�������ӹ�bean
	IOperator dooperator = (IOperator) context
			.getBean("operatorservice");
%>
<HTML>
	<HEAD>
		<TITLE>�й�����ҵ�����ϵͳ</TITLE>
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
											<A class=nav href="newOperator.jsp">��������Ա</A>
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
            href="modifyOperator.htm">�޸Ĳ���Ա</A></TD>
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
											<A class=nav href="Resource.jsp">��Դ����</A>
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
											<A class=nav href="Charge.jsp">����ҵ�����</A>
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
											<A class=nav href="newCustomer.jsp">����</A>
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
											<A class=nav href="logout.jsp">�˳�</A>
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
											&nbsp;�����ڵ�λ�ã������ͻ�>�ڶ���
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
									֤�����ͣ�<%=customer.getIdType()%><input type="hidden"
										name="idType" value="<%=customer.getIdType()%>">
								</p>
								<p>
									֤�����룺<%=customer.getIdNumber()%><input type="hidden"
										name="idNumber" value="<%=customer.getIdNumber()%>">
								</p>
								<p>
									������
									<input type="text" name="customerName" size="20"
										value="<%=customer.getCustomerName()%>">
								</p>
								<p>
									�Ա�
									<input type="radio" value="M"
										<%if (customer.getCustomerSex().equals("M")) {%> checked <%}%>
										name="customerSex">
									��&nbsp;&nbsp;
									<input type="radio"
										<%if (customer.getCustomerSex().equals("F")) {%> checked <%}%>
										name="customerSex" value="F">
									Ů
								</p>
								<p>
									���գ�
									<input type="text" name="customerBirtyday" size="20"
										value="<%=customer.getCustomerBirtyday()%>">
								</p>
								<p>
									��ϵ��ַ��
									<input type="text" name="customerAddress" size="20"
										value="<%=customer.getCustomerAddress()%>">
								</p>
								<%
									} else {
								%>
								<p>
									֤�����ͣ�<%=mycostomer.getIdType()%><input type="hidden"
										name="idType" value="<%=mycostomer.getIdType()%>">
								</p>
								<p>
									֤�����룺<%=mycostomer.getIdNumber()%><input type="hidden"
										name="idNumber" value="<%=mycostomer.getIdNumber()%>">
								</p>
								<p>
									������
									<input type="text" name="customerName" size="20" value="">
								</p>
								<p>
									�Ա�
									<input type="radio" value="M" checked name="customerSex">
									��&nbsp;&nbsp;
									<input type="radio" name="customerSex" value="F">
									Ů
								</p>
								<p>
									���գ�
									<input type="text" name="customerBirtyday" size="20" value="">
								</p>
								<p>
									��ϵ��ַ��
									<input type="text" name="customerAddress" size="20" value="">
								</p>
								<%
									}
								%>
								<p>
								</p>
								<p>
									<input type="submit" value="��һ��>>" name="B1">
									<input type="reset" value="ȫ����д" name="B2">
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
