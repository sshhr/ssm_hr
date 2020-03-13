<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>角色管理</title>
		<link rel="stylesheet"
			href="css/table.css" type="text/css"/>
		<script type="text/javascript">
			function doDelete(user_role_id) {
				if (confirm("确定删除此角色吗？")) {
					location.href = "delUserRole?user_role_id=" + user_role_id;
				}
			}
		</script>
	</head>
	<body>
		<table width="100%">
			<tr>
				<td>
					<font color="black">您正在做的业务是：人力资源--权限管理--角色管理 </font>
				</td>
			</tr>
			<tr>
				<td>
					当前角色总数：${count }
				</td>
			</tr>
			<tr>
				<td align="right">
					<input type="button" value="添加角色" class="BUTTON_STYLE1" onclick="location.href='power/right_add'">
				</td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=5 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
			<tr class="TR_STYLE1">
				<td class="TD_STYLE1">
					角色编号
				</td>
				<td class="TD_STYLE1">
					角色名称
				</td>
				<td class="TD_STYLE1">
					角色说明
				</td>
				<td class="TD_STYLE1">
					是否可用
				</td>
				<td class="TD_STYLE1">
					操作
				</td>
			</tr>
			<c:forEach items="${uList}" var="u">
				<tr class="TR_STYLE2" id="${u.user_role_id }">
					<td class="TD_STYLE2">
						${u.user_role_id }
					</td>
					<td class="TD_STYLE2">
						${u.user_role_name }
					</td>
					<td class="TD_STYLE2">
						${u.user_role_explain }
					</td>
					<td class="TD_STYLE2">
						
						${u.user_role_chose }
					</td>
					<td class="TD_STYLE2">
						<img src="images/bt_edit.gif" title="编辑" style="cursor:pointer;" onclick="location.href='queryRoleQx?user_role_id=${u.user_role_id}'"/>
						<c:if test="${u.user_role_name!='管理员'}"><img src="images/bt_del.gif" title="删除" style="cursor:pointer;" onclick="doDelete(${u.user_role_id })"/></c:if>
					</td>
		</tr>
			</c:forEach>
		</table>
		
	</body>
</html>