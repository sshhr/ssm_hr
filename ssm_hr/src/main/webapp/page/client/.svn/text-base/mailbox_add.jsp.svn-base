<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="css/table.css" type="text/css">
		<script type="text/javascript"
			src="javascript/comm/comm.js">
		</script>
		<script type="text/javascript"
			src="javascript/jquery-1.7.2.js">
		</script>
			<script type="text/javascript" src="javascript/jquery.messager.js"></script>
<script type="text/javascript">
		function check(){
			if (document.getElementById("mtitle").value==""){
				$.messager.show("消息提示","邮件标题不能为空!!!",2000);
				return ;
			}
			if (document.getElementById("mboby").value==""){
				$.messager.show("消息提示","邮件内容不能为空!!!",2000);
				return ;
			}
			document.addEmail.submit();
		}	
</script>	
	</head>
	<body>
		<form method="post" action="addEmail" name="addEmail">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--邮箱管理设置--邮箱设置--添加邮件模板
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="添加" class="BUTTON_STYLE1" onclick="check()"/>
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1">邮件标题</td>
					<td colspan="3" class="TD_STYLE2"><input type="text" name="mtitle" id="mtitle" class="INPUT_STYLE2"></td>
				</tr>
				<tr>
					<td class="TD_STYLE1">邮件正文</td>
					<td colspan="7" class="TD_STYLE2"><textarea name="mboby" id="mboby" rows="4" class="TEXTAREA_STYLE1"></textarea>
		</td>
				</tr>
			</table>
			<p>
				 
		</form>
	</body>
</html>