<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>添加用户</title>
		<link rel="stylesheet"
			href="css/table.css" type="text/css"/>
		<script type="text/javascript" src="javascript/jquery-1.7.2.js"></script>
		<script type="text/javascript"
			src="javascript/jquery.messager.js"></script>
		<script type="text/javascript" src="javascript/user_add.js"></script>
	</head>
	<body>
		<form method="post" action="addUser">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--权限管理--添加用户</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="保存" class="BUTTON_STYLE1"/>
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="history.back()">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=3 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1">用户名称</td>
					<td class="TD_STYLE2">
						<input type="text" id="userName" name="user_name"/>
					</td>
					<td class="TD_STYLE1">用户密码</td>
					<td class="TD_STYLE2">
						<input type="password" id="userPassword" name="user_password"/>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">真实姓名</td>
					<td class="TD_STYLE2">
						<input type="text" id="userTrueName" name="user_true_name"/>
					</td>
					<td class="TD_STYLE1">用户身份</td>
					<td class="TD_STYLE2">
						<select name="user_role_uid.user_role_id">
							<c:forEach items="${uList}" var="us">
								<option value="${us.user_role_id }">${us.user_role_name}</option>
							</c:forEach>
							
						</select>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>