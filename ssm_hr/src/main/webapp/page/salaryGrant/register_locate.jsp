<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="css/table.css"
			type="text/css"></link>
			 
	</head>
	
	<body>
		<form action="queryBysalaryid" method="post">
				<input type="hidden" name="page.startPage" value="0">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--薪酬发放管理--薪酬发放登记</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="确 定"  class="BUTTON_STYLE1">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				
				<tr>
					<td width="27%" class="TD_STYLE1">
						薪酬发放方式
					</td>
					<td width="22%" class="TD_STYLE1">
						<select name="submitType" class="INPUT_STYLE2">
							<option value="1"  >一级机构发放方式</option>
							<option value="2" >二级机构发放方式</option>
							<option value="3">三级机构发放方式</option>
						</select>
					</td>
					<td width="60%" class="TD_STYLE1"></td>
			</table>
		</form>
	</body>
</html>