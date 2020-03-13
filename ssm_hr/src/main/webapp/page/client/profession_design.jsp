<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
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
		function ajax(pbcid){
		$.ajax({
			url:'deletepublic?pbcid='+pbcid,
			type:'get',
			success:function(){
				$('#'+pbcid).remove();
			}
		});
	}
	</script>
	</head>
	<body>
		<form method="post" action="../customiz/customizAction!findAttribute">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--职称设置
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						 
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="80%" class="TD_STYLE1">
						职称名称
					</td>
					<td width="20%" class="TD_STYLE1" align="center">
						删除
					</td>
				</tr>
				
				<c:forEach items="${zlist}" var="z">
				<tr id="${z.pbcid}">
					<td class="TD_STYLE2">
					${z.attributename}
					</td>
					<td class="TD_STYLE2" align="center">
						<a href="javascript:ajax(${z.pbcid})">删除</a>
					</td>
				</tr>
				</c:forEach>
		
				

			</table>
		
				 
		</form>
	</body>
</html>
