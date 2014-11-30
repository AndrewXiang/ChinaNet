<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ page import="com.javaweb.ch12.model.Operator"%>
<%
	Operator operator = (Operator) session.getAttribute("operator");
	int ad = operator.getIsAdmin();
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
							<A href="http://www.chinamobile.com/index.asp"><IMG height=45
									src="../images/logo_dianxin.jpg" width=173 border=0> </A>
						</TD>
						<TD vAlign=top align=right>
							<TABLE width="100%" border=0 cellPadding=0 cellSpacing=0>
								<TBODY>
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
										<TD bgColor=#ffffff colSpan=2 height=1 width=173></TD>
									</TR>
									<TR>
										<TD width=11 bgColor=#2650a6>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
											<img src="../images/Arrow1.gif" width="23" height="23">
										</TD>
										<TD width=165 height="29" bgColor=#7691c7>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<A class=nav href="Resource.jsp">号码管理</A>
										</TD>
									</TR>
									<TR>
										<TD bgColor=#ffffff colSpan=2 height=1 width=173></TD>
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
										<TD bgColor=#ffffff colSpan=2 height=1 width=173></TD>
									</TR>
									<%
										}
									%>
									<TR>
										<TD width=11 bgColor=#2650a6>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
											<img src="../images/Arrow1.gif" width="23" height="23">
										</TD>
										<TD width=165 height="29" bgColor=#7691c7>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<A class=nav href="newCustomer.jsp">开户管理</A>
										</TD>
									</TR>
									<TR>
										<TD bgColor=#ffffff colSpan=2 height=1 width=173></TD>
									</TR>

									<TR>
										<TD width=11 bgColor=#2650a6>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
											<img src="../images/Arrow1.gif" width="23" height="23">
										</TD>
										<TD width=165 height="29" bgColor=#7691c7>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<A class=nav href="logout.jsp">退出系统</A>
										</TD>
									</TR>
									<TR>
										<TD bgColor=#ffffff colSpan=2>
											<IMG height=1 src="../images/blank.gif" width=1 border=0>
										</TD>
									</TR>
									<TR>

										<TD colSpan=2>
											<IMG src="../images/index_b.jpg" width=173 border=0>
										</TD>
									</TR>
									<TR>
										<TD colSpan=2>
											<IMG src="../images/index_1.jpg" width=173 heigh=180 border=0>
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
											&nbsp;您现在的位置：号码管理
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


							<form method="POST" action="../resource.action">
								<p>
									号码类型：
									<input type="Radio" name="nbtype" value="SIM" checked />
									SIM &nbsp;&nbsp;
									<input type="Radio" name="nbtype" value="UIM">
									UIM
								</p>
								<p>
									指定号段：从
									<input type="text" name="startMobile" size="20" value="">
									到
									<input type="text" name="endMobile" size="20" value="">
									<input type="submit" value="提交" name="B1">
									<input type="reset" value="全部重写" name="B2">
								</p>
							</form>
							<hr>




						</TD>
					</TR>
				</TBODY>
			</TABLE>
			<BR>
		</CENTER>
	</BODY>
</HTML>
