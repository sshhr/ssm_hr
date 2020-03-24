<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>My JSP 'interview-resume.jsp' starting page</title>
     	<link rel="stylesheet"
			href="<%=basePath %>css/table.css" type="text/css">
		<link rel="stylesheet"
			href="<%=basePath %>css/cwcalendar.css"
			type="text/css">
		<script type="text/javascript"
			src="<%=basePath %>javascript/comm/comm.js">
		</script>
		<script type="text/javascript"
			src="<%=basePath %>javascript/comm/list.js">
		</script>
		<script type="text/javascript"
			src="<%=basePath %>javascript/calendar-ch.js">
		</script>
		<script type="text/javascript"
			src="<%=basePath %>javascript/jquery-1.7.2.js">
		</script>
		<script type="text/javascript"
			src="<%=basePath %>javascript/locate.js">
		</script>
		<script type="text/javascript"
			src="<%=basePath %>javascript/select.js">
		</script>
		<script type="text/javascript"
			src="<%=basePath %>javascript/comm/time.js">
		</script>
<script type="text/javascript">
	function search() {
		document.examAnswerForm.submit();
	}
</script>
	</head>

	<body>
		<form name="examAnswerForm" method="post" action="examAnswerSearchResult" >
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--招聘考试管理--成绩查询筛选</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						 
						<input type="submit" value="开始"
							class="BUTTON_STYLE1" onclick="search();">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
			 
				<tr>
					<td class="TD_STYLE1" width="30%">
						请输入应试人身份证
					</td>
					<td width="84%" >
						<input type="text" name="humanIdcard" value=""
							class="INPUT_STYLE2" />
					</td>
				</tr>
				 
				 <tr>
					<td class="TD_STYLE1" width="30%">
						请输入关键字
					</td>
					<td width="84%" >
						<input type="text" name="primaryKey" value=""
							class="INPUT_STYLE2" />
							(姓名，职业分类名称，职业名称)
					</td>
				</tr>
				
				<tr>
					<td class="TD_STYLE1" width="30%">
						请输入登记时间
					</td>
					<td width="84%" class="TD_STYLE1" >
					 
					<input type="text" name="startdate"   onclick="aa('startdate')" 
							style="width: 14%" class="INPUT_STYLE2">
						至
						<input type="text" name="enddate" 
							style="width: 14%" class="INPUT_STYLE1" onclick="aa('enddate')">
						（YYYY-MM-DD）
					</td>
				</tr>
			</table>
		</form>
	</body>
	 
</html>