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
	<script type="text/javascript">
		function ajax(mid){
		$.ajax({
			url:'deleteEmail?mid='+mid,
			type:'get',
			success:function(data){
			if(data == 'ok'){
				$('#'+mid).remove();
			}
			}
		});
	}
	</script>
	</head>
	<body>
		<form method="post" action="toaddEmail">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--邮箱管理设置--邮箱设置
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="添加" class="BUTTON_STYLE1"
							onclick="window.location.href='toaddFirstKind'" />
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1 align="center"
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="20%" class="TD_STYLE1">
						邮件标题
					</td>
					<td width="20%" class="TD_STYLE1">
						邮件正文
					</td>
					<td width="5%" class="TD_STYLE1" align="center">
						变更
					</td>
					<td width="5%" class="TD_STYLE1">
						删除
					</td>
				</tr>
				<c:forEach items="${mlist}" var="m">
				<tr id="${m.mid }">
					<td class="TD_STYLE2">
						${m.mtitle }
					</td>
					<td class="TD_STYLE2">
						<textarea name="mbody" rows="4" class="TEXTAREA_STYLE1">${m.mboby }</textarea>
						
					</td>
					<td class="TD_STYLE2" align="center">
						<a href="toqueryByIdEmail?mid=${m.mid }" >变更</a>
					</td>
					<td class="TD_STYLE2">
						<a href="javascript:ajax(${m.mid })">删除</a>
					</td>
				</tr>
				</c:forEach>
			</table>
			<p>
				 
		</form>
	</body>
</html>