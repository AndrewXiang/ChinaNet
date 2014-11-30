<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ page import="com.javaweb.ch12.model.*"%>
<%
	Operator operator = (Operator) session.getAttribute("operator");
	int ad = operator.getIsAdmin();
	Customer customer = (Customer) session.getAttribute("customer");
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
							<A href="http://ah.189.cn/index.html"> <IMG height=74
									src="images/logo_dianxin.jpg" width=173 border=0> </A>
						</TD>
						<TD vAlign=top align=right>
							<TABLE width="100%" border=0 cellPadding=0 cellSpacing=0>
								<TBODY>
									<TR bgColor=#2650a6>
										<TD height="12">
											<img src="images/spacer.gif" width="1" height="1">
										</TD>
										<TD height="12">
											<img src="images/spacer.gif" width="1" height="1">
										</TD>
										<TD height="12">
											<img src="images/spacer.gif" width="1" height="1">
										</TD>
										<TD height="12">
											<img src="images/spacer.gif" width="1" height="1">
										</TD>
										<TD height="12">
											<img src="images/spacer.gif" width="1" height="1">
										</TD>
									</TR>
									<TR bgColor=#FFFFFF>
										<TD>
											<img src="images/spacer.gif" width="1" height="1">
										</TD>
										<TD>
											<img src="images/spacer.gif" width="1" height="1">
										</TD>
										<TD>
											<img src="images/spacer.gif" width="1" height="1">
										</TD>
										<TD>
											<img src="images/spacer.gif" width="1" height="1">
										</TD>
										<TD>
											<img src="images/spacer.gif" width="1" height="1">
										</TD>
									</TR>
									<TR>
										<TD>
											<img src="images/pic01.gif" width="115" height="55">
										</TD>
										<TD>
											<img src="images/pic04.gif" width="115" height="55">
										</TD>
										<TD>
											<img src="images/pic03.gif" width="115" height="55">
										</TD>
										<TD>
											<img src="images/pic02.gif" width="115" height="55">
										</TD>
										<TD>
											<img src="images/pic05.jpg" width="115" height="55">
										</TD>
									</TR>
								</TBODY>
							</TABLE>
						</TD>
					</TR>
					<TR>
						<TD height="12" colSpan=2 align=right bgColor=#d4dced>


							<img src="images/spacer.gif" width="1" height="1">
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
							<IMG height=2 src="images/blank(1).gif" width=1>
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
											<img src="images/Arrow1.gif" width="23" height="23">
										</TD>
										<TD width=165 height="29" bgColor=#7691c7>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<A class=nav href="web/newOperator.jsp">新增操作员</A>
										</TD>
									</TR>
									<TR>
										<TD bgColor=#ffffff colSpan=2>
											<IMG height=1 src="images/blank.gif" width=1 border=0>
										</TD>
									</TR>

									<TR>
										<TD width=11 bgColor=#2650a6>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
											<img src="images/Arrow1.gif" width="23" height="23">
										</TD>
										<TD width=165 height="29" bgColor=#7691c7>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<A class=nav href="web/Resource.jsp">资源管理</A>
										</TD>
									</TR>
									<TR>
										<TD bgColor=#ffffff colSpan=2>
											<IMG height=1 src="images/blank.gif" width=1 border=0>
										</TD>
									</TR>
									<TR>
										<TD width=11 bgColor=#2650a6>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
											<img src="images/Arrow1.gif" width="23" height="23">
										</TD>
										<TD width=165 height="29" bgColor=#7691c7>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<A class=nav href="web/Charge.jsp">配置业务费用</A>
										</TD>
									</TR>
									<TR>
										<TD bgColor=#ffffff colSpan=2>
											<IMG height=1 src="images/blank.gif" width=1 border=0>
										</TD>
									</TR>

									<%
										}
									%>
									<TR>
										<TD bgColor=#ffffff colSpan=2>
											<IMG height=1 src="images/blank.gif" width=1 border=0>
										</TD>
									</TR>
									<TR>
										<TD width=11 bgColor=#2650a6>
											<IMG height=1 src="images/blank.gif" width=1 border=0>
											<img src="images/Arrow1.gif" width="23" height="23">
										</TD>
										<TD width=165 height="29" bgColor=#7691c7>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<A class=nav href="web/newCustomer.jsp">开户</A>
										</TD>
									</TR>
									<TR>
										<TD bgColor=#ffffff colSpan=2>
											<IMG height=1 src="images/blank.gif" width=1 border=0>
										</TD>
									</TR>
									<TR>

									</TR>
									<TR>
										<TD width=11 bgColor=#2650a6>
											<IMG height=1 src="images/blank.gif" width=1 border=0>
											<img src="images/Arrow1.gif" width="23" height="23">
										</TD>
										<TD width=165 height="29" bgColor=#7691c7>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<A class=nav href="web/logout.jsp">退出</A>
										</TD>
									</TR>
									<TR>
										<TD bgColor=#ffffff colSpan=2>
											<IMG height=1 src="images/blank.gif" width=1 border=0>
										</TD>
									</TR>
									<TR>

										<TD colSpan=2>
											<IMG src="images/index_b.jpg" width=173 border=0>
										</TD>
									</TR>
									<TR>
										<TD colSpan=2>
											<IMG src="images/index_1.jpg" width=173 heigh=180 border=0>
										</TD>
									</TR>
									<TR align=middle>
										<TD colSpan=2 height=160>
											&nbsp;
										</TD>
									</TR>
									<TR>
										<TD colSpan=2>
											<IMG height=1 src="images/blank.gif" width=1>
										</TD>
									</TR>
								</TBODY>
							</TABLE>
						</TD>
						<TD width=2 rowSpan=3>
							<IMG height=1 src="images/blank(1).gif" width=2>
						</TD>
						<TD width="2">
							<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
								<TBODY>
									<TR>
										<TD height=25>
											&nbsp;您现在的位置：新增用户
										</TD>
									</TR>
									<TR>
										<TD bgColor=#2650a6>
											<IMG height=1 src="images/blank(1).gif" width=1>
										</TD>
									</TR>
									<TR>
										<TD>
											<IMG height=2 src="images/blank(1).gif" width=574>
										</TD>
									</TR>
								</TBODY>
							</TABLE>
						</TD>
					</TR>
					<TR vAlign=top>
						<TD height="600" bgColor=#f1f3f9>

							<form method="POST" action="addUser.action">
								<p>
									手机号码：
									<input type="text" name="mobile" size="20">
								</p>
								<p>
									漫游状态：
									<input type="radio" name="roamingStatus" value="P" checked>
									省内漫游
									<input type="radio" name="roamingStatus" value="D">
									国内漫游
									<input type="radio" name="roamingStatus" value="I">
									国际漫游
								</p>
								<p>
									通话级别：
									<input type="radio" value="L" checked name="comLevel">
									本地通话
									<input type="radio" name="comLevel" value="D">
									国内长途
									<input type="radio" name="comLevel" value="I">
									国际长途
								</p>
								<p>
									客户ID：
									<input type="text" name="userId" size="20"
										value="<%=customer.getCustomerId()%>" readonly>
								</p>

								<p>
									<input type="submit" value="完成>>" name="B1">
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
