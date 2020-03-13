<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>用户管理</title>
		<link rel="stylesheet"
			href="css/table.css" type="text/css"/>
		<script type="text/javascript">
			function doDelete(user_id) {
				if (confirm("确定删除此用户吗？")) {
					location.href = "delUser?user_id=" + user_id;
				}
			}
		</script>
	</head>
	<body>
		<table width="100%">
			<tr>
				<td>
					<font color="black">您正在做的业务是：人力资源--权限管理--用户管理 </font>
				</td>
			</tr>
			
			<tr>
				<td align="right">
					<c:if test="${userlogin.user_role_uid.user_role_name=='管理员'}"><input type="button" value="添加用户" class="BUTTON_STYLE1" onclick="location.href='queryAllRole'"></c:if>
				</td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=5 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
			<tr class="TR_STYLE1">
				<td class="TD_STYLE1">
					用户编号
				</td>
				<td class="TD_STYLE1">
					用户名称
				</td>
				<td class="TD_STYLE1">
					真实姓名
				</td>
				<td class="TD_STYLE1">
					用户密码
				</td>
				<td class="TD_STYLE1">
					用户电话
				</td>
				<td class="TD_STYLE1">
					用户身份
				</td>
				<td class="TD_STYLE1">
					操作
				</td>
			</tr>
			<c:forEach items="${userList}" var="us">
			<c:if test="${userlogin.user_id==us.user_id && userlogin.user_role_uid.user_role_name!='管理员' }">
				<tr class="TR_STYLE2" id="${us.user_id}">
					<td class="TD_STYLE2">
						${us.user_id}
					</td>
					<td class="TD_STYLE2">
						${us.user_name}
					</td>
					<td class="TD_STYLE2">
						${us.user_true_name}
					</td>
					<td class="TD_STYLE2">
						${us.user_password}
					</td>
					<td class="TD_STYLE2">
						${us.user_phone}
					</td>
					<td class="TD_STYLE2">
						${us.user_role_uid.user_role_name}
					</td>
					<td class="TD_STYLE2">
						<img src="images/bt_edit.gif" title="编辑" style="cursor:pointer;" onclick="location.href='queryUserID?user_id=${us.user_id}'"/>
						<input type="button" value="绑定手机" class="BUTTON_STYLE1" onclick="location.href='queryUserIDcheck?user_id=${us.user_id}'">
					</td>
				</tr>
				</c:if>
			</c:forEach>
		<c:forEach items="${userList}" var="us">
			<c:if test="${userlogin.user_role_uid.user_role_name=='管理员'}">
				<tr class="TR_STYLE2" id="${us.user_id}">
					<td class="TD_STYLE2">
						${us.user_id}
					</td>
					<td class="TD_STYLE2">
						${us.user_name}
					</td>
					<td class="TD_STYLE2">
						${us.user_true_name}
					</td>
					<td class="TD_STYLE2">
						${us.user_password}
					</td>
					<td class="TD_STYLE2">
						${us.user_phone}
					</td>
					<td class="TD_STYLE2">
						${us.user_role_uid.user_role_name}
					</td>
					<td class="TD_STYLE2">
						<img src="images/bt_edit.gif" title="编辑" style="cursor:pointer;" onclick="location.href='queryUserID?user_id=${us.user_id}'"/>
						<c:if test="${us.user_role_uid.user_role_name!='管理员'}"><img src="images/bt_del.gif" title="删除" style="cursor:pointer;" onclick="doDelete(${us.user_id})"/></c:if>
						<c:if test="${userlogin.user_id==us.user_id}"><input type="button" value="绑定手机" class="BUTTON_STYLE1" onclick="location.href='queryUserIDcheck?user_id=${us.user_id}'"></c:if>
					</td>
				</tr>
				</c:if>
			</c:forEach>
		</table>
		
	</body>
</html>