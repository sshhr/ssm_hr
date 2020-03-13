<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="css/table.css" type="text/css" />
		<title>无标题文档</title>
		
		<style type="text/css">
.style3 {
	color: #0000CC
}

</style>
	</head>

	<body>
		<form method="post" action="queryCount">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是:人力资源管理--薪酬标准管理--薪酬标准登记查询</font>
					</td>
				</tr>
				<tr>
					<td>
						&nbsp;
					</td>
				</tr>
				<tr>
					<td>符合条件的薪酬标准总数:${count} 例</td>
					</td>
				</tr>
			</table>
			
				<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="15%" class="TD_STYLE1">
						<span>薪酬标准编号</span>
					</td>
					<td width="20%" class="TD_STYLE1">
						<span>薪酬标准名称</span>
					</td>
					<td width="15%" class="TD_STYLE1">
						<span>制定人</span>
					</td>
					<td width="30%" class="TD_STYLE1">
						<span>登记时间</span>
					</td>
					<td class="TD_STYLE1" width="15%">
						薪酬总额
					</td>
				</tr>
				
				<c:forEach items="${slist}" var="s">
					<tr class="TD_STYLE2">
						<td><a href="qyertbzto?sstid=${s.sstid}">${s.sstid }</a></td>
						<td>${s.sname }</td>
						<td>${s.sdesigner }</td>
						<td>${s.srtime }</td>
						<td>&nbsp;${s.ssum}</td>
					</tr>
				</c:forEach>
			</table>
			
			 
<html>
  <head>  
  </head>  
  <body>
   
			<script type="text/javascript">
function dopagebybutton() {
	var reg = /^[0-9]*[1-9][0-9]*$/;
	if (reg.test(document.getElementById("page").value)) {
		document.getElementById("startpage").value= document.getElementById("page").value;
	} else {
		alert("您的输入有误");
		document.getElementById("page").value = document.getElementById("startpage").value;
	}
	document.forms[0].submit();
	
}
function doPage(startsize) {
	document.getElementById("startpage").value =startsize;
	document.forms[0].submit();
	 
}
</script>
   
   
  </body>
</html>
 
			 		
		</form>
	</body>
</html>